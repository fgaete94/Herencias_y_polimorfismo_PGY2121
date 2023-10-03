/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio233;

/**
 *
 * @author vina
 */
public class Aseo extends Producto {
    
    private char bioDegradable; // S= para si, N para no

    public Aseo() {
    }

    public Aseo(char bioDegradable, int codigo, int precio, String descripcion) {
        super(codigo, precio, descripcion);
        this.bioDegradable = bioDegradable;
    }

    public char getBioDegradable() {
        return bioDegradable;
    }

    public void setBioDegradable(char bioDegradable) {
        this.bioDegradable = bioDegradable;
    }

    @Override
    public String toString() {
        return "Aseo{" + "bioDegradable=" + bioDegradable + '}';
    }

    @Override
    public void listar() { 
        System.out.println("Producto: "+super.getDescripcion());
        System.out.println("Precio: "+super.getPrecio());
        if (bioDegradable == 'S'){
            System.out.println("Este producto es biodegradable");
        }else{
            System.out.println("Este producto NO es biodegradable");
        }
    }

    @Override
    public void agregarComentario(String coment) {
        System.out.println("Producto: "+super.getDescripcion());
        System.out.println("Comentario: "+ coment);
    }
    
    
}
