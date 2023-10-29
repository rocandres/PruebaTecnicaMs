# DESCRIPCIÓN GENERAL DE LA PRUEBA TÉCNICA

La prueba se realizó con las siguientes indicaciones técnicas: 

* Java versión 11
* intellij IDE
* Maven 3.6.3
* Spring Boot 2.4.3
* Arquitectura Hexagonal
* OpenApi 3.0.0 Generator
* Mapstruct
* H2
* Lombok

El proyecto se ha implementado mediante `arquitectura hexagonal`, 
la cual permite aislar los modelos y lógica de negocio de las tecnologías usadas, buscando una baja acoplación entre componentes. 
Se hizo uso de `Spring data` como persistencia de datos, además de una base de datos volátil `H2`. 

Las entradas del servicio en la capa de aplicación se han realizado mediante `API REST` utilizando `OpenApi 3` 
implementando metodología Api first, la cual permite definir el contrato de una api y sus modelos mediante 
archivos `YAML` de configuración, generando automáticamente el código fuente de los controladores y los modelos. 

Para realizar una comprobación de las pruebas descritas en la prueba técnica, se realizaron `pruebas unitarias` embebidas 
en el proyecto spring boot. Tambien se implementaron `pruebas de integración`, las cuales verifican el flujo completo 
del proyecto. De igual manera, se han implementado pruebas de mediante cliente rest `Postman` , las cuales se encuentran dentro del 
proyecto en formato postman collection. 

`NOTA:` En caso de presentar conflictos en la compilación del proyecto debido al uso conjunto de `Lombok` para generación de 
constructores y `Mapstruct` para mapeo de entidades a dto o viceversa.

Por favor, agregar la siguiente opción a la máquina virtual, o en Intellij
IDEA, File -> Settings -> Build,Execution,Deployment -> Compiler -> Shared build Process VM options.

* -Djps.track.ap.dependencies=false
        


