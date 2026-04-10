package com.eci.sportlife.service;

import com.eci.sportlife.dto.request.LoginRequest;
import com.eci.sportlife.dto.request.RegisterRequest;
import com.eci.sportlife.dto.response.AuthResponse;
import com.eci.sportlife.exception.BusinessException;
import com.eci.sportlife.model.User;
import com.eci.sportlife.repository.UserRepository;
import com.eci.sportlife.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepo;
    private final PasswordEncoder encoder;
    private final JwtUtil jwtUtil;

    public AuthResponse register(RegisterRequest req) {
        if (userRepo.existsByEmail(req.getEmail()))
            throw new BusinessException("Email ya registrado", HttpStatus.CONFLICT);
        User user = User.builder()
            .name(req.getName())
            .email(req.getEmail())
            .password(encoder.encode(req.getPassword()))
            .build();
        userRepo.save(user);
        String token = jwtUtil.generateToken(user.getEmail());
        return AuthResponse.builder()
            .userId(user.getId()).name(user.getName())
            .email(user.getEmail()).token(token).expiresIn(86400L).build();
    }

    public AuthResponse login(LoginRequest req) {
        User user = userRepo.findByEmail(req.getEmail())
            .orElseThrow(() -> new BusinessException("Credenciales inválidas", HttpStatus.UNAUTHORIZED));
        if (!encoder.matches(req.getPassword(), user.getPassword()))
            throw new BusinessException("Credenciales inválidas", HttpStatus.UNAUTHORIZED);
        String token = jwtUtil.generateToken(user.getEmail());
        return AuthResponse.builder()
            .userId(user.getId()).name(user.getName())
            .email(user.getEmail()).token(token).expiresIn(86400L).build();
    }
}

