/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio233;

/**
 *
 * @author vina
 */
public class Congelado extends Producto {
    
    private int peso;

    public Congelado() {
    }

    public Congelado(int peso, int codigo, int precio, String descripcion) {
        super(codigo, precio, descripcion);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Congelado{" + "peso=" + peso + '}';
    }

    @Override
    public void listar() {
        System.out.println("Producto: "+super.getDescripcion());
        System.out.println("Precio: "+super.getPrecio());
        System.out.println("Peso: "+this.getPeso());
    }

    @Override
    public void agregarComentario(String coment) {
        System.out.println("Producto: "+super.getDescripcion());
        System.out.println("Comentario: "+ coment);
    }
    
    
    
}
