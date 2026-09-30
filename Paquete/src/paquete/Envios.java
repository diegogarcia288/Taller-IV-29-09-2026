/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

/**
 *
 * @author User
 */
public class Envios {
    public static void main(String[] args) {
            
            Paquete p1 = new Paquete("P-001", "Manizales", 6.0, true);
            p1.mostrarInformacion();
            
            Paquete p2 = new Paquete("P-002", "Pereira");
            
            Paquete p3 = new Paquete("P-003");
            
            p2.mostrarInformacion();
            p3.mostrarInformacion();
            
            p3.actualizarPeso(2.5);
            
            double total = p1.calcularCosto() + p2.calcularCosto() + p3.calcularCosto();
            
            System.out.println("Costo total de los envíos: " + total);
            
            System.out.println(p1.calcularCosto (4000));
            System.out.println(p2.calcularCosto (4000));
            
            if(p1.esPesado()){
                System.out.println("El paquete requiere un manejo especial pues supera los 5kg");
            }
    } 
}
