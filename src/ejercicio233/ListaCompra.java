/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio233;

import java.util.ArrayList;

/**
 *
 * @author vina
 */
public class ListaCompra {
    
    private ArrayList<Producto> lista;

    public ListaCompra() {
        lista=new ArrayList<>();
    }
    
    
     public void agregarProducto(Producto prod)      
    {
        lista.add(prod);
    }
     
      public void listarProductos()
    {
        for (Producto producto : lista) {
            //System.out.println(producto.getDescripcion());
            producto.listar();
        }
    }
    
      public void calcularTotal(){
          int total=0,precio=0,descuento=0,totalf=0;
          for (Producto producto : lista) {
              if(producto.getClass().getName().equals(producto.getClass().getName()=="Oferta")){// agregar el nombre del paquete
                  descuento++;
                  precio=producto.getPrecio();
                  total=total+precio;
                  totalf=totalf+total*descuento/100;
              
              }else{
                 precio= producto.getPrecio();
                 total=total+precio;
              }

              
          }
          if(descuento>0){
              System.out.println("El valor Total a cancelar es de: "+total);
              System.out.println("Con un descuento de: "+descuento+"%");
              System.out.println("Queda en un valor de: "+totalf);
          }else{
              System.out.println("El Valor Total a cancelar es: "+ total);
          }
          
      }
    
}
