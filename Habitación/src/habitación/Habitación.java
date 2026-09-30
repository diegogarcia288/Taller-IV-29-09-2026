/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package habitación;

/**
 *
 * @author User
 */
public class Habitación {
    public int numero;
    public String tipo;
    public double precioNoche;
    public boolean ocupada;
    
    public Habitación(int numero, String tipo, double precioNoche, boolean ocupada){
        this.numero = numero;
        this.tipo = tipo;
        this.precioNoche = precioNoche;
        this.ocupada = ocupada;
    }
    
    public Habitación(int numero, String tipo) {
        this(numero, tipo, 120000.0, false);
    }
    
    public void ocupar(){
        this.ocupada = true;
    }
    
    public double calcularEstadia(int noches){
        return noches * precioNoche;
    }
    
    public double calcularEstadia(int noches, double descuento){
        double vestadia = calcularEstadia(noches);
        return vestadia - (calcularEstadia(noches) * (descuento / 100.0) );
    }
    
    public void mostrarInformacion(){
        System.out.println("Habitación : " + numero + "De tipo: " + tipo);
        System.out.println("Precio por Noche: " + precioNoche);
        System.out.println("Estado: " + ocupada);
    }
    
}
