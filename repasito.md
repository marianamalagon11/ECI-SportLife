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

 PUNTO 2 — Validaciones de input vs. validaciones de negocio
Validaciones de input verifican que los datos recibidos tengan la forma correcta, antes de procesarlos. Son técnicas y no requieren consultar la base de datos. Ejemplos: que un campo no esté vacío, que un email tenga @, que un número no sea negativo, que una fecha tenga formato correcto.
Validaciones de negocio verifican que los datos cumplan las reglas del dominio del problema. Requieren conocer el contexto de la aplicación y generalmente implican consultar la base de datos. Ejemplos: que un usuario no tenga ya un pedido activo, que el stock sea suficiente, que el correo sea institucional de ese dominio específico.
La diferencia clave es: el input validation ocurre antes de tocar la base de datos; el business validation ocurre después de conocer el estado del sistema.

 PUNTO 3 — Autenticación, Autorización e Integridad
Autenticación es el proceso de verificar quién eres. El sistema confirma la identidad del usuario, típicamente mediante usuario/contraseña y luego emite un token (JWT). Es el "¿quién eres tú?".
Autorización es el proceso de verificar qué puedes hacer. Una vez autenticado, el sistema determina si ese usuario tiene permisos para ejecutar una acción específica según su rol. Es el "¿tienes permiso para esto?". En ECIXPRESS: un CLIENTE no puede cambiar el estado del pedido a EN_PREPARACION, aunque esté autenticado.
Integridad garantiza que los datos no han sido alterados ni corrompidos durante su transmisión o almacenamiento. En APIs REST se logra con HTTPS (TLS), firmas digitales en los JWT, y validaciones de checksum. Es el "¿los datos llegaron tal como fueron enviados?".

PUNTO 5 — Problemas al no separar capas
Cuando un proyecto no separa correctamente sus capas (presentación, negocio, persistencia) ocurren varios problemas graves:
Acoplamiento fuerte: cualquier cambio en la base de datos obliga a tocar el código de presentación, generando errores en cascada.
Imposibilidad de hacer pruebas unitarias: si la lógica de negocio está mezclada con SQL directo o con el controlador HTTP, no puedes probar la lógica sin levantar toda la aplicación.
Duplicación de código: al no tener servicios reutilizables, la misma validación de stock se repite en múltiples puntos.
Dificultad para escalar: no puedes reemplazar la base de datos (de MySQL a MongoDB) sin reescribir media aplicación.
Bajo mantenimiento: el código se vuelve un "espagueti" difícil de entender para nuevos desarrolladores.

Un validador es un componente cuya única responsabilidad es verificar que los datos cumplen ciertas reglas (de input o de negocio) y lanzar excepciones si no. No tiene lógica de negocio propia. Ejemplo: StockValidator, EmailValidator.
Un servicio es el componente que contiene la lógica de negocio central. Orquesta llamadas a repositorios, otros servicios y validadores para cumplir un caso de uso completo. Ejemplo: PedidoService que valida stock, crea el pedido y actualiza el stock.
Una utilidad es una clase con métodos estáticos o de ayuda que realizan operaciones técnicas transversales sin lógica de negocio. No conocen el dominio. Ejemplo: QRCodeUtil que genera o lee un código QR, JwtUtil que firma o verifica un token, DateUtil.
La diferencia clave: el servicio sabe de negocio, el validador sabe de reglas, la utilidad sabe de técnica.

Fases de TDD:
Red (rojo): Escribes las pruebas antes de que exista el código. Todas fallan porque la funcionalidad aún no existe. Por ejemplo:
java@Test
void deberiaCrearPedidoExitosamente() {
// Arrange: usuario sin pedido activo, productos con stock
// Act: llamar crearPedido()
// Assert: estado debe ser CREADO, total debe calcularse
// FALLA porque PedidoService no existe todavía
}
Green (verde): Escribes el mínimo código necesario para que las pruebas pasen. No importa si es feo, el objetivo es verde.
Refactor: Limpias y mejoras el código sin romper las pruebas. Extraes métodos, aplicas patrones, mejoras nombres.

Las pruebas garantizan el cumplimiento de las reglas de negocio porque actúan como contrato ejecutable: cada regla definida en el caso de estudio ("un usuario solo puede tener un pedido activo") se convierte en una prueba que falla si esa regla deja de cumplirse. Cuando alguien modifica el código y rompe una regla inadvertidamente, las pruebas lo detectan antes del despliegue.
La integridad del sistema se garantiza porque las pruebas de integración verifican que todos los componentes trabajan correctamente juntos — el servicio llama al repositorio correcto, el repositorio modifica los datos esperados, y la respuesta HTTP es la correcta para cada caso.

Un pipeline automatiza el ciclo de vida de una aplicación en estas etapas principales:
1. Source (Fuente): Se dispara cuando se hace un merge a develop. El pipeline toma el código fuente del repositorio como punto de partida.
2. Build (Construcción): Se compila el código y se resuelven las dependencias (Maven, Gradle, npm). Si el código tiene errores de compilación, el pipeline se detiene aquí. Produce un artefacto ejecutable (JAR, imagen Docker).
3. Test (Pruebas): Se ejecutan las pruebas unitarias y de integración automáticamente. Se genera el reporte de cobertura (Jacoco). Si alguna prueba falla, el pipeline se detiene.
4. Code Analysis (Análisis estático): Herramientas como SonarQube analizan el código en busca de vulnerabilidades, code smells y deuda técnica sin ejecutarlo.
5. Package / Containerize: Se empaqueta la aplicación en una imagen Docker y se sube a un registro de contenedores (Docker Hub, Azure Container Registry).
6. Deploy (Despliegue): Se despliega el artefacto en el ambiente objetivo (staging, producción). En el caso del bono sería Azure.

¿Qué pasa si una prueba falla en el pipeline?
No debe permitirse el despliegue bajo ninguna circunstancia. La razón técnica es que una prueba que falla indica que una regla de negocio o una funcionalidad crítica no se comporta como se espera. Desplegar ese código significa llevar un bug conocido a producción, lo cual puede afectar a usuarios reales, corromper datos, o generar pérdidas económicas.
La filosofía del pipeline es "fail fast" — detectar el problema lo más temprano posible y bloquear el avance. El equipo debe corregir la causa de la falla antes de intentar un nuevo despliegue. Esto protege la integridad del ambiente productivo y mantiene la confianza del cliente en el sistema.

ogging en manejo de errores
a. ¿Qué información DEBERÍA registrarse?
Timestamp exacto del evento, nivel del log (INFO, WARN, ERROR), nombre del método o endpoint donde ocurrió, el mensaje descriptivo del error, el stack trace completo en caso de excepción, el ID de correlación de la request (para rastrear el flujo completo), el rol del usuario (sin identificarlo personalmente), y el código HTTP de respuesta.
b. ¿Qué NO debería registrarse (por seguridad)?
Contraseñas (ni hasheadas), tokens JWT completos, números de tarjetas de crédito o datos financieros, información personal sensible (correo completo, nombre completo en logs de error técnico), y cualquier dato cubierto por normativas como GDPR o habeas data. Registrar esta información crea vectores de ataque si los logs son accedidos por un actor malicioso.

Los códigos de estado HTTP son como las "notas breves" que un servidor le envía a tu navegador para decirle cómo fue la solicitud. Se dividen en cinco categorías principales según el primer dígito.

Aquí tienes la lista completa y organizada:

1xx: Respuestas Informativas
El servidor ha recibido la solicitud y el proceso continúa.

100 Continue: Todo va bien hasta ahora; puedes continuar con la solicitud.

101 Switching Protocols: El servidor acepta cambiar de protocolo (ej. pasar de HTTP a WebSockets).

102 Processing: El servidor está trabajando en ello, pero aún no tiene una respuesta definitiva.

2xx: Peticiones Correctas (Éxito)
La acción fue recibida, entendida y aceptada con éxito.

200 OK: La respuesta estándar para peticiones exitosas.

201 Created: La petición ha sido completada y se ha creado un nuevo recurso.

202 Accepted: La petición ha sido aceptada para procesamiento, pero no se ha completado.

204 No Content: La petición se completó con éxito, pero no hay contenido que enviar (común en APIs).

3xx: Redirecciones
Se requiere realizar acciones adicionales para completar la solicitud.

301 Moved Permanently: El recurso se ha movido permanentemente a una nueva URL.

302 Found: El recurso se ha movido temporalmente.

304 Not Modified: Indica que el recurso no ha cambiado desde la última vez (se usa para ahorro de caché).

4xx: Errores del Cliente
Parece que hubo un error por parte de quien hizo la solicitud (tú o tu navegador).

400 Bad Request: El servidor no entiende la petición por un error de sintaxis.

401 Unauthorized: Es necesario autenticarse (usuario/contraseña) para obtener la respuesta.

403 Forbidden: El servidor entiende la petición pero se niega a autorizarla (no tienes permisos).

404 Not Found: El servidor no puede encontrar el recurso solicitado. Es el más famoso de internet.

405 Method Not Allowed: El método usado (ej. POST) no está permitido para esa URL.

408 Request Timeout: El servidor se cansó de esperar la respuesta del cliente.

429 Too Many Requests: Has enviado demasiadas peticiones en poco tiempo (límite de tasa).

5xx: Errores del Servidor
El servidor falló al intentar completar una solicitud aparentemente válida.

500 Internal Server Error: Un error genérico; algo salió mal en el "cerebro" del servidor.

501 Not Implemented: El servidor no soporta la funcionalidad necesaria para responder.

502 Bad Gateway: El servidor, actuando como puerta de enlace, recibió una respuesta inválida de otro servidor.

503 Service Unavailable: El servidor no está listo para manejar la petición (común por mantenimiento o sobrecarga).

504 Gateway Timeout: El servidor tardó demasiado en responder mientras actuaba como intermediario.
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
