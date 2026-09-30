/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package habitación;

/**
 *
 * @author User
 */
public class Hotel {
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Habitación h1 = new Habitación(001 , "Normal" , 200000 , true);
        Habitación h2 = new Habitación(002 , "Premium");
        Habitación h3 = new Habitación(003 , "Pobre");
        
        h2.ocupar();
        
        h1.mostrarInformacion();
        h2.mostrarInformacion();
        h3.mostrarInformacion();
        
        System.out.println("Estadía de 3 noches con y sin descuento");
        
        double estadiaSinDescuento = h1.calcularEstadia(3);
        double estadiaConDescuento = h1.calcularEstadia(3, 45.0);
        
        System.out.println("Estadia 3 noches sin descuento: " + estadiaSinDescuento);
        System.out.println("Estadía 3 noches con descuento: " + estadiaConDescuento);
        
    }
    
}
