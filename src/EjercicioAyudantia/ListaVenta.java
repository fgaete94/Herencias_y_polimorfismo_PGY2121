/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioAyudantia;

import java.util.ArrayList;

/**
 *
 * @author pipeg
 */
public class ListaVenta implements Iventa {
    
    private ArrayList <Producto> listaDeVenta; 

    public ListaVenta() {
        listaDeVenta = new ArrayList <>();
    }
    
    
    public boolean agregarProdcuto(Producto prod){
        return listaDeVenta.add(prod);
    }
    
    public void listarprd(){
        int tot=0;
        System.out.println("Articulo\t\tPrecio");
        for (Producto producto : listaDeVenta) {
            tot=tot+producto.getPrecio();
            System.out.println(producto.nombre+"\t\t\t"+producto.getPrecio());
            
        }
        System.out.println("---------------------------");
        System.out.println("\t\t\tTotal Venta: "+tot);
        System.out.println("\t\t\tIVA: "+tot*Iventa.IVA);
        System.out.println("\t\t\tTotal Final: "+(tot+tot*Iventa.IVA));
    }
    
}
