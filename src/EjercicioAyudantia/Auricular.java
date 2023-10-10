/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioAyudantia;

/**
 *
 * @author pipeg
 */
public class Auricular extends Producto {
    
    private char conectividad; //A: alambrico I: inalambrico

    public Auricular() {
    }

    public Auricular(char conectividad, String nombre, String categoria, int precio) {
        super(nombre, categoria, precio);
        this.conectividad = conectividad;
    }

    public char getConectividad() {
        return conectividad;
    }

    public void setConectividad(char conectividad) {
        this.conectividad = conectividad;
    }

    @Override
    public String toString() {
        return "Auricular{" + "conectividad=" + conectividad + '}';
    }

    @Override
    public void listar() {
        System.out.println("Producto: "+ this.getClass().getName());
        System.out.println("Nombre: "+super.getNombre());
        System.out.println("Valor sin IVA: "+super.getPrecio());
        if(this.conectividad=='A'){
            System.out.println("Auricular Alambrico");
        }else{
            System.out.println("Auricular Inalambrico");
        }
        
    }
    
    
    
}
