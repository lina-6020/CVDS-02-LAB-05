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

> **¿Qué otros códigos de error existen?**
> * _1xx informational response_
> * _2xx sucess_
> * _3xx redirection_
> * _4xx client errors_
> * _5xx server errors_

> Realizamos una  nueva conexión:


> ``` telnet www.httpbin.orh 80 ```

> ![image](https://user-images.githubusercontent.com/59893804/93660829-97227b80-fa18-11ea-844d-e4b5c47f2acc.png)

> Realizamos una petición GET con el recurso 


> ``` GET /html HTTP/1.1 ```

> Obtenemos lo siguiente 

> ![image](https://user-images.githubusercontent.com/59893804/93660880-eff21400-fa18-11ea-8593-10b85bede7c1.png)

> Seleccionamos el contenido ```HTML``` y contamos el número de caracteres con **wc -c = 3601*

> **¿Cuál es la diferencia entre los verbos GET y POST? ¿Qué otros tipos de peticiones existen?**
> Una de las diferencias entre **GET** y **POST** es que el método GET lleva los datos usando la URL de forma visible, el método POST los envía de forma que no podemos verlos (en un segundo plano u "ocultos" al usuario).

> Hacemos peticiones con el comando ```curl```

> ``` curl www.httpbin.org ```

> ![image](https://user-images.githubusercontent.com/59893804/93660992-f208a280-fa19-11ea-8dbe-6e55d2622d92.png)


> ``` curl -v www.httpbin.org ```
> ![image](https://user-images.githubusercontent.com/59893804/93665421-f80f7b00-fa3b-11ea-9ffe-e62ac28da404.png)

> ``` curl -i www.httpbin.org ```
![image](https://user-images.githubusercontent.com/59893804/93665437-18d7d080-fa3c-11ea-989c-29905d38f004.png)


> ¿cuáles son las diferencias con los diferentes parámetros?
> Curl es un lenguaje de programación reflexivo para aplicaciones web interactivas cuyo objetivo es trasnsitar mas suave entre el formato y la programación.Con curl -i se enviara una solicitud GET completa , mientras que con curl -v se hara una petición GET que retornada solo el HEAD.
>



### Parte II. -Haciendo una aplicación Web dinámica a bajo nivel
> Creamos un proyecto Maven nuevo usando e
arquetipo de aplicación web estándar 


> ![image](https://user-images.githubusercontent.com/59893804/93665651-c26b9180-fa3d-11ea-8151-b2569ce7687b.png)

> La clase SampleServlet nos permite extender por modulos las capacidades de los serviidores.

> Agregue la dependencia y el plugin

> ![image](https://user-images.githubusercontent.com/59893804/93665692-360d9e80-fa3e-11ea-9084-41722622b38e.png)

>![image](https://user-images.githubusercontent.com/59893804/93665715-65241000-fa3e-11ea-88e3-345ca835de61.png)

> Compile y ejecute con:
>```mvn package``` 

> ![image](https://user-images.githubusercontent.com/59893804/93665838-43775880-fa3f-11ea-8347-1a6d0d1158b4.png)

>```mvn tomcat7:run```

> ![image](https://user-images.githubusercontent.com/59893804/93665755-b6340400-fa3e-11ea-9025-c8155e52bfb4.png)

> En el navegador ponga la URL con la cual se le enviaran peticiones a  'SampleServlet'

> ![image](https://user-images.githubusercontent.com/59893804/93665860-7f122280-fa3f-11ea-8264-bc587f193512.png)

> Con parámetros

>![image](https://user-images.githubusercontent.com/59893804/93665897-a9fc7680-fa3f-11ea-8078-40f6b18ffbf4.png)

> Agregue la dependencia para ```gson```

> ![image](https://user-images.githubusercontent.com/59893804/93665922-d3b59d80-fa3f-11ea-8078-d540c2c26ab0.png)

> Revise la dirección https://jsonplaceholder.typicode.com/todos/1. E intente cambiar los números final del path.

> ![image](https://user-images.githubusercontent.com/59893804/93665956-0cee0d80-fa40-11ea-88f1-4cfddbc2fc9b.png)

> ![image](https://user-images.githubusercontent.com/59893804/93665965-18413900-fa40-11ea-8e4d-35f6d17e05f1.png)

> ![image](https://user-images.githubusercontent.com/59893804/93665974-255e2800-fa40-11ea-9b42-7b829510d2cf.png)

>Implemente y verifique el funcionamiento de la aplicación

> ![image](https://user-images.githubusercontent.com/59893804/93666037-8259de00-fa40-11ea-890e-cfa3aee23777.png)



### Parte III.

> Termine de implementar las clases necesarias

> ![image](https://user-images.githubusercontent.com/59893804/93666084-d49aff00-fa40-11ea-80dc-09077acfea2c.png)

