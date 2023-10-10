/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioAyudantia;

/**
 *
 * @author pipeg
 */
public class Ordenador extends Producto {
    
    private String marca;

    public Ordenador() {
    }

    public Ordenador(String marca, String nombre, String categoria, int precio) {
        super(nombre, categoria, precio);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "marca=" + marca + '}';
    }

    @Override
    public void listar() {
        System.out.println("Producto: "+ this.getClass().getName());
        System.out.println("Nombre: "+super.getNombre());
        System.out.println("Valor sin IVA: "+super.getPrecio());
        System.out.println("Modelo: "+this.marca);
    }
    
     

    
    
}
