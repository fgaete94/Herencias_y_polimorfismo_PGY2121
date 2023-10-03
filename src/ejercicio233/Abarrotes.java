/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio233;

/**
 *
 * @author vina
 */
public class Abarrotes extends Producto{
    
    
    private boolean integral;

    public Abarrotes() {
    }

    public Abarrotes(boolean integral, int codigo, int precio, String descripcion) {
        super(codigo, precio, descripcion);
        this.integral = integral;
    }

    public boolean isIntegral() {
        return integral;
    }

    public void setIntegral(boolean integral) {
        this.integral = integral;
    }

    @Override
    public String toString() {
        return "Abarrotes{" + "integral=" + integral + '}';
    }
    
    @Override
    public void listar() {
        System.out.println("Producto: "+super.getDescripcion());
        System.out.println("Precio: "+super.getPrecio());
        if (integral == true){
            System.out.println("Integral: SI");
        }else{
            System.out.println("Integral: NO");
        }
    }

    @Override
    public void agregarComentario(String coment) {
        System.out.println("Producto: "+super.getDescripcion());
        System.out.println("Comentario: "+ coment);
    }

    
}
