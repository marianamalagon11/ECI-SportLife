# Conceptos de API y REST

## API (Application Programming Interface)
Conjunto de reglas que permite que diferentes sistemas se comuniquen entre sí.

## API REST
Arquitectura de servicios web que usa HTTP para operar sobre recursos mediante URLs.

### Recurso (Resource)
Entidad representada en la API (ej: usuario, libro).

### Endpoint
Ruta específica donde se accede a un recurso o funcionalidad de la API.

### Métodos HTTP
- **GET:** obtener datos
- **POST:** crear
- **PUT:** actualizar
- **DELETE:** eliminar

### Código de estado HTTP
Código que indica el resultado de una petición (ej: 200, 404, 500).

### Header HTTP
Metadatos enviados en una petición o respuesta HTTP.

### Body (Cuerpo)
Contenido principal de una petición o respuesta.

---

# OpenAPI y Swagger

## OpenAPI
Especificación estándar que describe completamente una API REST (endpoints, parámetros, respuestas, etc.).

## Swagger UI
Herramienta que muestra la documentación de una API de forma visual e interactiva.

---

# Sistemas

## Sistema con estado (Stateful)
El servidor guarda información del cliente entre solicitudes.

## Sistema sin estado (Stateless)
Cada solicitud es independiente y contiene toda la información necesaria.

---

# Manejo de Errores

- **Validación de input:** Verifica que los datos tengan el formato correcto.
- **Validación de negocio:** Verifica que los datos cumplan las reglas del sistema.
- **Try-Catch:** Estructura para capturar errores en ejecución.
- **Error Handler:** Componente que centraliza el manejo de errores y devuelve respuestas uniformes.

---

# Logging

- **Logging:** Registro de eventos dentro de una aplicación.
- **Niveles de logging**
    - **TRACE:** máximo detalle
    - **DEBUG:** depuración
    - **INFO:** información normal
    - **WARN:** advertencia
    - **ERROR:** error crítico

---

# Configuración ⚙️

- **application.properties:** Archivo de configuración en formato clave-valor.
- **application.yml:** Archivo de configuración en formato estructurado.
- **Perfil de configuración:** Configuración específica para un entorno (dev, prod).

---

# Testing y Cobertura

- **Testing:** Proceso de verificación del funcionamiento del software.
- **Caso de prueba:** Escenario diseñado para validar una funcionalidad.
- **Escenario exitoso:** Cuando el sistema funciona correctamente.
- **Escenario de error:** Cuando el sistema falla de manera controlada.
- **Cobertura de código:** Porcentaje del código ejecutado por las pruebas.
- **Tipos de cobertura:**
    - **Line Coverage**
    - **Branch Coverage**
    - **Condition Coverage**
    - **Path Coverage**
    - **Function Coverage**
    - **Loop Coverage**

---

# Diagramas

- **Diagrama de secuencia:** Representa la interacción entre componentes en el tiempo.
- **Línea de vida:** Representa un objeto en el diagrama.
- **Mensaje:** Comunicación entre componentes.
- **Barras de activación:** Indican el tiempo de ejecución.
- **Fragmentos (alt, loop, opt, par):** Bloques que representan condiciones, ciclos o concurrencia.

---

# Versionamiento

- **Versionamiento de API:** Gestión de cambios en una API sin afectar clientes existentes.
- **Versionamiento en URL:** Versión incluida en la ruta.
- **Versionamiento en header:** Versión incluida en encabezados.
- **Versionamiento semántico:**
    - **MAJOR:** cambios incompatibles
    - **MINOR:** nuevas funcionalidades
    - **PATCH:** correcciones

---

# Arquitectura

- **Modelo (Model):** Representa los datos del sistema.
- **Servicio (Service):** Contiene la lógica de negocio.
- **Controlador (Controller):** Maneja las solicitudes HTTP.
- **Capa (Layer):** Nivel de la arquitectura con responsabilidad específica.

---

# Validators, Mappers, Utils

- **Validator:** Valida datos de entrada o reglas del sistema.
- **Mapper:** Convierte objetos entre diferentes estructuras.
- **Utils:** Funciones reutilizables de apoyo.
- **DTO (Data Transfer Object):** Objeto usado para transferir datos entre capas.

---

# Bases de Datos Relacionales

- **Base de datos relacional:** Sistema que organiza datos en tablas relacionadas.

---

# Propiedades ACID

- **ACID:** Garantías de fiabilidad de transacciones:
    - **Atomicidad:** todo o nada
    - **Consistencia:** estado válido
    - **Aislamiento:** independencia entre transacciones
    - **Durabilidad:** persistencia de datos

---

# Indexación

- **Índice:** Estructura que permite búsquedas más rápidas en una base de datos.

---

# Normalización

- **Normalización:** Organización de datos para eliminar redundancia.
    - **Primera Forma Normal (1FN):** Datos atómicos.
    - **Segunda Forma Normal (2FN):** Elimina dependencias parciales.
    - **Tercera Forma Normal (3FN):** Elimina dependencias transitivas.

---

# Relaciones

- **Agregación:** Relación débil entre objetos.
- **Composición:** Relación fuerte donde los objetos dependen completamente.

---

# Modelo Entidad-Relación

- **Modelo ER:** Representación conceptual de la base de datos.
- **Entidad:** Objeto o tabla.
- **Atributo:** Propiedad de la entidad.
- **Relación:** Conexión entre entidades.
- **Cardinalidad:** Cantidad de relaciones entre entidades.

---

# JPA y Spring Data

- **JPA (Java Persistence API):** Especificación para manejar datos en bases relacionales usando objetos.
- **DAO (Data Access Object):** Clase que representa una tabla en código.
- **Repositorio (Repository):** Interfaz que permite operaciones CRUD.
- **CRUD:** Create, Read, Update, Delete.

---

# Seguridad en APIs

- **Seguridad de API:** Protección de la API frente a ataques y accesos indebidos.

---

# Riesgos de Seguridad en APIs

- **DoS / DDoS:** Ataques que saturan el servidor.
- **Robo de credenciales:** Obtención ilegal de datos de acceso.
- **Vulnerabilidades:** Fallos explotables del sistema.

---

# Tipos de Ataques

- **CSRF (Cross-Site Request Forgery):** Acciones ejecutadas sin consentimiento del usuario.
- **XSS (Cross-Site Scripting):** Inyección de código malicioso.
- **Clickjacking:** Engaño mediante interfaces invisibles.

---

# Authentication

- **Autenticación:** Verificación de identidad del usuario.
- **HTTP Basic:** Método simple con usuario y contraseña codificados.
- **OAuth2:** Protocolo de autorización mediante terceros.
- **JWT (JSON Web Token):** Token firmado que contiene información del usuario.
- **Token:** Credencial de acceso.
- **Access Token:** Token que permite acceder a recursos protegidos.
- **TTL (Time To Live):** Tiempo de vida del token.

---

# Authorization

- **Autorización:** Define qué acciones puede realizar un usuario.
- **Roles:** Conjunto de permisos asignados a un usuario.
- **Permisos:** Acciones específicas que puede realizar un usuario.

---

# Integridad

- **Integridad de datos:** Garantiza que la información no ha sido alterada.

---

# HTTPS / SSL

- **HTTPS:** Protocolo seguro para comunicación web.
- **SSL/TLS:** Tecnologías de cifrado de datos.

---

# CORS

- **CORS (Cross-Origin Resource Sharing):** Mecanismo que controla el acceso entre diferentes dominios en el navegador.

---

# Persistencia y Modelos de Datos

## Persistencia Relacional (anotaciones)

- **Persistencia relacional:** Forma de guardar datos en bases de datos estructuradas en tablas relacionadas.
- **@Entity:** Define una clase como una tabla en la base de datos.
- **@Table:** Permite especificar el nombre de la tabla.
- **@Id:** Indica la clave primaria.
- **@GeneratedValue:** Define que el ID se genera automáticamente.
- **@Column:** Configura las columnas de la tabla.
- **@OneToMany:** Relación de uno a muchos.
- **@ManyToOne:** Relación de muchos a uno.
- **@ManyToMany:** Relación de muchos a muchos.

---

## SQL vs NoSQL

- **SQL (bases de datos relacionales):**
    - Estructura fija (tablas)
    - Uso de relaciones
    - Lenguaje SQL
    - Alta consistencia

- **NoSQL:**
    - Estructura flexible
    - Basado en documentos, clave-valor, grafos, etc.
    - Escalable
    - No requiere esquema fijo

---

## BASE (Modelo NoSQL)

- **BASE:** Modelo usado en sistemas NoSQL:
    - **Basically Available:** siempre disponible
    - **Soft State:** el estado puede cambiar
    - **Eventual Consistency:** consistencia eventual

Diferencia con ACID: prioriza disponibilidad y escalabilidad.

---

## Embebido vs Referenciado

- **Embebido:** Los datos relacionados se almacenan dentro del mismo documento.
    - Ventaja: rapidez de lectura
    - Desventaja: duplicación de datos

- **Referenciado:** Los datos se almacenan separados y se conectan mediante referencias.
    - Ventaja: flexibilidad
    - Desventaja: más consultas

---

## MongoDB

- **MongoDB:** Base de datos NoSQL orientada a documentos (JSON/BSON).
    - Esquema flexible
    - Escalable
    - Alta disponibilidad

---

## Implementación en una API

Consiste en:
- Conectar backend con la base de datos
- Definir modelos o documentos
- Usar repositorios para acceder a datos
- Configurar la conexión

---

## Diagramación No Relacional

Representación de estructuras de datos en NoSQL:
- Documentos
- Datos embebidos
- Referencias

---

## Cómo Guardar Imágenes en una API

Opciones:
- Guardar en base de datos como BLOB (poco eficiente)
- Guardar en sistema de archivos (se guarda la ruta en la base de datos)
- Guardar en la nube (servicios externos, mejor práctica)

---

# DevOps, CI/CD y Arquitectura Moderna

## CI / CD

- **CI (Continuous Integration):** Integración continua del código con ejecución automática de pruebas.
- **CD (Continuous Deployment / Delivery):** Despliegue automático del sistema a producción o entornos de prueba.

---

## Pipelines

- **Pipeline:** Secuencia automatizada de pasos:
    - **Build:** compilación
    - **Test:** pruebas
    - **Deploy:** despliegue

---

## Ambientes

- **SBX (Sandbox):** Entorno de pruebas inicial.
- **Preproducción (Preprod):** Entorno que simula producción.
- **Producción (Prod):** Sistema real en uso.

---

## DevOps

- **DevOps:** Cultura que integra desarrollo y operaciones para automatizar procesos y mejorar despliegues.

---

## IT as a Service

- **IT as a Service:** Modelo donde los servicios tecnológicos se ofrecen bajo demanda.

---

## Microcontenedores

- **Microcontenedores (contenedores):** Unidades que empaquetan una aplicación con todo lo necesario para ejecutarse.

---

## Docker

- **Docker:** Herramienta para crear y ejecutar contenedores.
    - Portabilidad
    - Consistencia en entornos

---

## Kubernetes

- **Kubernetes:** Plataforma para orquestar y gestionar múltiples contenedores.
    - Escalabilidad
    - Balanceo de carga
    - Alta disponibilidad

---

## Escalamiento

- **Escalamiento vertical:** Aumentar recursos de un solo servidor (CPU, RAM).
- **Escalamiento horizontal:** Agregar más servidores.

---

## Diagrama de Despliegue

- **Diagrama de despliegue:** Representa la infraestructura física donde se ejecuta el sistema.
    - Incluye servidores, contenedores, redes.

---

## High Level Design (HLD)

- **High Level Design (HLD):** Documento que describe la arquitectura general del sistema.
    - Incluye componentes, tecnologías, interacción entre partes.

---

## Ciclo Completo CI/CD

- Desarrollador escribe código
- Se sube al repositorio
- Pipeline se ejecuta
- Se corren pruebas
- Se despliega automáticamente

---

# Seguridad y Roles

## Mecanismos de Seguridad

- **JWT (JSON Web Tokens) con Spring Security:** Mecanismo central de autenticación, stateless, escalable.
- **BCrypt para contraseñas:** Hashing seguro para contraseñas, protección ante ataques de diccionario y rainbow tables.
- **HTTPS / TLS:** Cifra el tráfico entre cliente y servidor, protege tokens y credenciales.
- **Validación de inputs (Bean Validation):** Utilización de anotaciones para prevenir inyecciones y datos malformados.
- **CORS configurado explícitamente:** Solo orígenes conocidos autorizados.
- **Control de acceso por roles (RBAC):** Roles CUSTOMER y ADMIN, control de permisos a nivel de endpoint.

---


## TLS/SSL en una API REST

- **TLS/SSL:** Protocolo que cifra la comunicación entre cliente y servidor. HTTPS usa HTTP sobre TLS.
- Implementación en Spring Boot: Configuración de certificado SSL en `application.properties` y redirección de HTTP a HTTPS.
- **Ventajas:** Protege tokens y credenciales, garantiza identidad del servidor, protege datos de pago, cumple estándares de seguridad.

---

## ¿Por qué usar CORS en una API REST?

- **CORS:** Mecanismo del navegador que bloquea peticiones a dominios distintos a menos que estén autorizadas.
- **Necesario:** Permite a frontends en dominios distintos consumir la API; previene ataques CSRF.
- **Configuración:** Se define en la configuración del backend (por ej., clase `@Configuration` en Spring).
