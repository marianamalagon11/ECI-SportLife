package com.eci.sportlife.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthResponse {
    private Long userId;
    private String name;
    private String email;
    private String token;
    private String type = "Bearer";
    private Long expiresIn;
}

