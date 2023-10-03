/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio233;

/**
 *
 * @author vina
 */
public class Oferta extends Producto {
    
    private int descuento;

    public Oferta() {
    }

    public Oferta(int descuento, int codigo, int precio, String descripcion) {
        super(codigo, precio, descripcion);
        this.descuento = descuento;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Oferta{" + "descuento=" + descuento + '}';
    }

    @Override
    public void listar() {
        System.out.println("Producto: "+super.getDescripcion());
        System.out.println("Precio: "+super.getPrecio());
        if (descuento>0){
            System.out.println("Producto en Oferta!!");
        }else{
            System.out.println(" No esta en Oferta :(!");
        }
    }

    @Override
    public void agregarComentario(String coment) {
        System.out.println("Producto: "+super.getDescripcion());
        System.out.println("Comentario: "+ coment);
    }



 
    
    
    
}
