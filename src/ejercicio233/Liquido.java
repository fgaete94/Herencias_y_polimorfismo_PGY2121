/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio233;

/**
 *
 * @author vina
 */
public class Liquido extends Producto {
    
    private int volumnen;

    public Liquido() {
    }

    public Liquido(int volumnen, int codigo, int precio, String descripcion) {
        super(codigo, precio, descripcion);
        this.volumnen = volumnen;
    }

    public int getVolumnen() {
        return volumnen;
    }

    public void setVolumnen(int volumnen) {
        this.volumnen = volumnen;
    }

    @Override
    public String toString() {
        return "Liquido{" + "volumnen=" + volumnen + '}';
    }
    
    @Override
    public void listar() {
        System.out.println("Producto: "+super.getDescripcion());
        System.out.println("Precio: "+super.getPrecio());
        System.out.println("Volumen: "+this.getVolumnen());
    }

    @Override
    public void agregarComentario(String coment) {
        System.out.println("Producto: "+super.getDescripcion());
        System.out.println("Comentario: "+ coment);
    }

    
}
