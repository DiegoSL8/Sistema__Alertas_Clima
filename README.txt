Sistema de Alertas Climáticas con Patrones de Diseño

Descripción del Proyecto
Este proyecto es una aplicación de consola desarrollada en Java que simula un sistema automático de notificaciones meteorológicas. 
El objetivo principal es aplicar buenas prácticas de programación orientada a objetos para resolver problemas comunes de acoplamiento y rigidez en el código. 
Para lograr esto implementamos tres patrones de diseño de software que nos permiten gestionar las alertas de forma dinámica y escalable según la gravedad del clima.



Arquitectura y Patrones Implementados
En el corazón de este software utilizamos el patrón Observer para manejar la comunicación en tiempo real. 
La estación meteorológica actúa como el sujeto central que notifica automáticamente a todos los dispositivos de los usuarios registrados 
cada vez que se detecta un cambio drástico en la temperatura o humedad.

También incorporamos el patrón de creación Factory Method para estandarizar los mensajes. 
Esta fábrica centralizada se encarga de instanciar los distintos tipos de notificaciones base, 
como correos electrónicos o mensajes SMS, aislando la lógica de creación del resto de la aplicación.

Finalmente aplicamos el patrón estructural Decorator para añadir funcionalidades extra en el caso necesario. 

Esta solución nos permite envolver las notificaciones simples con características adicionales, 
como etiquetas visuales de urgencia roja o mecanismos de encriptación de texto, todo esto sin tener que modificar el código original de las alertas.



Requisitos Técnicos y Entorno
El sistema fue construido íntegramente utilizando Java en su versión 25.0.2 apoyado en OpenJDK 64-Bit Server VM. 
La estructura del proyecto y el manejo del proceso de construcción se administran mediante Apache Maven. 
Todo el desarrollo, integración y pruebas se llevaron a cabo utilizando el entorno de desarrollo Apache NetBeans IDE 29.



Instrucciones de Ejecución
Para probar la funcionalidad de la aplicación debe descargar o clonar este repositorio en su computadora,
luego abrir la carpeta del proyecto desde NetBeans y espera a que Maven sincronice la estructura. 
Una vez carga el proyecto debe ir al paquete sistemaclima, abrir el archivo Main y ejecutarlo para ver la simulación
de las distintas alertas meteorológicas directamente en la consola.



Equipo de Desarrollo
El diseño arquitectónico y la programación de este proyecto fueron realizados por los papus: 

Diego Sereño(lider)
Sebastian Cofré 
Daniel Ledesma
