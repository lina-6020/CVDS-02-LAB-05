# MVC Primefaces Introduction
## Introducción a proyectos Web

### Parte I. -Jugando a ser un cliente HTTP
> Realizamos una conexión síncronica TCP/IP a través de Telnet al servidor:


> ``` telnet www.escuelaing.edu.co 80 ``` 


> ![image](https://user-images.githubusercontent.com/59893804/93660244-4b6cd380-fa12-11ea-94d1-5d95016488bd.png)
> 

> Realizamos una petición GET con el recurso 


> ``` GET /sssss/abc.html HTTP/1.0 ```


> Obtenemos los siguientes errores

> ![image](https://user-images.githubusercontent.com/59893804/93660615-7ce79e00-fa16-11ea-9aa7-4bf5000b8b3b.png)
> _400 BAD REQUEST
El servidor no puede o no puede procesar la solicitud debido a un aparente error del cliente._

> ![image](https://user-images.githubusercontent.com/59893804/93660720-6261f480-fa17-11ea-8184-dac2b7859e19.png)
> _301 Moved Permanently
El host ha sido capaz de comunicarse con el servidor pero que el recurso solicitado ha sido movido a otra dirección permanentemente._

> **¿Qué otros códigos de error existen?
> * _1xx informational response_
> * _2xx sucess_
> * _3xx redirection_
> * _4xx client errors_
> * _5xx server errors_





### Parte II. -Haciendo una aplicación Web dinámica a bajo nivel
### Parte III.
### Parte IV. -Frameworks Web MVC – Java Server Faces / Prime Faces
