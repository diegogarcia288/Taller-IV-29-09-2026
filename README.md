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





    
  
