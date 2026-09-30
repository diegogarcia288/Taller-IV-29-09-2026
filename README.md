# Taller-IV-29-09-2026

# Respuestas Parte A:

Etapa 2 - Punto 4:
  Mensaje de NetBeans:
  constructor Paquete in class Paquete cannot be applied to given types;required; String, String, double, boolean

  
  found: no arguments

  
  reason: actual and formal argumentlists differ in length ---

  

  Éste error sucede debido a que al haber ya iniciado un Constructor no son necesarias las lineas de códigos donde se crean los objetos en el main debido a que el constructor se encarga ya de ejecutarlos y dejarlos ya listos.

  

Etapa 5 - Punto 3:


  p1.calcularCosto(): Ésto se ejecuta porque es el método que se ha llamado que cumple con la característica de no tener parámetros

  
  
  p1.calcularCosto(4000): Se ejecuta el método con parámetro de tipo double (calcularCosto(double tarifaPorKilo)).

  

# Respuestas Parte C:

  1. Analiza estas cuatro declaraciones de constructores para la clase Habitacion e indica cuáles pueden existir al
mismo tiempo en la clase y cuáles no. Justifica cada caso con el concepto de firma.



Habitacion(int n, String t): Puede existir pues nombrar los parámetros como "n" y "t" sin que se parezcan a los atributos no genera error.


Habitacion(int numero, String tipo): No puede existir junto al primer constructor, debido a que esos parámetros están siendo ocupados por el primer constructor.


Habitacion(String tipo, int numero): Puede existir junto al primer constructor debido a que primero usa el parámetro con String y luego el parámetro con int a diferencia del primer contructor que es el orden contrario.


Habitacion(int numero): Puede existir junto al primero y segundo debido a que usa parámetros distintos a ambos (al agregarse únicamente el parámentro numero y no otro).


No Supe como hacer el punto 4 :( 


# PREGUNTAS DE COMPRENSIÓN


1. ¿Qué diferencias hay entre un constructor y un método? Menciona al menos tres.

    - El constructor debe nombrarse igual que la clase
    - Un método devuelve un valor
    - El constructor se puede usar solo una vez por objeto a diferencia del método que se puede usar siempre.
  

2. ¿Por qué new Paquete() dejó de compilar en la Etapa 2? ¿Qué harías si la empresa necesitara seguir creando
paquetes sin datos?

    -Dejó de compilar porque al añadirse el constructor los objetos creados manualmente quedan obsoletos pues el constructor se encarga de inicializarlos.
   
    -Agregaría una sobrecarga al constructor sin parámetros pues permite la creación de objetos sin datos inizializados.


3. ¿Qué ocurriría si en el constructor de Paquete escribieras peso = peso; en lugar de this.peso = peso;? ¿El
programa compilaría?


    Lo que ocurre cuando se hace eso es que se le dice a Java que el parámetro quede totalmente igual, es decir en null, pues con el this se le dice a Java que utilice el atributo para inicializar el parámetro, es decir que inicie  en 0.0


4. ¿Qué es la firma de un método y por qué el tipo de retorno no sirve para distinguir dos versiones
sobrecargadas?

    La firma en un método significa como java diferencia un método de otro dentro de una clase a través de sus parámetros, el tipo de retorno no sirve para distinguir entre dos versiones sobrecargadas se puede utilizar un método sin pedirle el valor que devuelve


5. ¿Qué ventaja tiene que los constructores abreviados de Paquete deleguen con this(...) en lugar de asignar los
atributos ellos mismos?


  Esto representa evitar errores futuros a la hora de cambios futuros, pues si luego se necesitará cambiar la forma en la que se inicializan los atributos solo será necesario actualizar el código en el constructor principal
  






    
  
