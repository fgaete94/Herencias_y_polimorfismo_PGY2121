/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioAyudantia;

/**
 *
 * @author pipeg
 */
public class Telefono extends Producto {
    
    private String modelo;

    public Telefono() {
    }

    public Telefono(String modelo, String nombre, String categoria, int precio) {
        super(nombre, categoria, precio);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Telefono{" + "modelo=" + modelo + '}';
    }

    @Override
    public void listar() {
        System.out.println("Producto: "+ this.getClass().getName());
        System.out.println("Nombre: "+super.getNombre());
        System.out.println("Valor sin IVA: "+super.getPrecio());
        System.out.println("Modelo: "+this.modelo);
        
    }
    
    
    
}
