#Prueba técnica "Consultorio Médico"
##creación de unconsultorio médico con Java y springboot
Para la creación de este código se emplean las dependencias:
1. SpringData JPA
2. Spring Web
3. MySQL Driver
Nota: se añade captura de las dependencias que se usaronen SpringInitializr.
4. Con ayuda del workbench se crea la base de datos "consultorio_pacheco", que es la que se va a utilizar para almacenar la información de los pacientes
5. Se usa eclipse como IDE  y github para el control de versiones

##Con las dependencias anteriores se genera el paquete consultorio
se nombra al grupo como "aapr", ya que son las iniciales del desarrollador (Alan Alberto Pachecho Ramírez)
se le da el nombre consultorio a artifact y a name

### Dentro del paquete 
aapr se crean los paquetes con las siguientes clases:
1.model -> Consultorio + Doctor
1.1 dentro de model se definen los contructores, los getters / setters, método toString y HashCode and equals
1.2 en estas clases se realizan las anotaciones necesarias para generar las entidades en MySQL
1.2.2 se definen las características de las columnas (nombre, longitud, etc)
2.repository -> ConsultorioRepository + DoctorRepository
2.1 se definen las interfaces necesarias para reaslizar las conexiones 
3.service -> ConsultorioService + DoctorService
4.controller -> ConsultorioController + DoctorController
5.exceptions -> UserNotFoundException


