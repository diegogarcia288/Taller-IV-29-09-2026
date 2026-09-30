/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete;

/**
 *
 * @author User
 */
public class Paquete {
    public String codigo;
    public String destino;
    public double peso;
    public boolean asegurado;
    
    public Paquete (String codigo, String destino, double peso, boolean asegurado){  
        this.codigo = codigo;
        this.destino = destino;
        this.peso = peso;
        this.asegurado = asegurado;  
    }
    
    public Paquete (String codigo, String destino) {
        this(codigo, destino, 1.0, false);
    }
    
    public Paquete (String codigo){
        this(codigo, "Por Asignar");
    }
    
    public void mostrarInformacion(){
        System.out.println(codigo + " -> " + destino + " | " + peso + " Kg " + " |  asegurado: " + asegurado);
    }
    
    public void mostrarInformacion(String encabezado){
        System.out.println(encabezado);
        mostrarInformacion();
    }
    
    public void actualizarPeso(double peso){
        this.peso = peso;
    }
    
    public double calcularCosto(){
        double costo = peso * 5000;
        if (asegurado == true){
            costo = costo + 8000;
        }
        return costo;
    }
    
    public double calcularCosto (double tarifaPorKilo){
        double costo = peso * tarifaPorKilo;
        if(asegurado == true){
            costo = costo + 8000;
        }
        return costo;
    }
    
    public boolean esPesado(){
        return peso > 5.0;
    }
    
}
