/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio233;

/**
 *
 * @author vina
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Abarrotes aba1 = new Abarrotes(true, 112546, 1200, "Arroz");
        Abarrotes aba2 = new Abarrotes(false, 55486, 1000, "fideos");
        Aseo aseo1 = new Aseo('S', 5478215, 600, "Bolsa de Basura");
        Aseo aseo2 = new Aseo('N', 778845, 2000, "Mata Mosquitos");
        Congelado conge1 = new Congelado(2, 651541826, 8000, "Salmon");
        Congelado conge2 = new Congelado(1, 665482, 2000, "Choclo");
        Liquido liq1 = new Liquido(1, 668452, 10500, "Ron");
        Liquido liq2 = new Liquido(2, 447885, 1500, "Bebida");
        Oferta ofe1 = new Oferta(1, 8978156, 1000, "Pisco en Bolsa");
        //Oferta ofe2 = new Oferta();
        
        ListaCompra lista1 = new ListaCompra();
        ListaCompra lista2 = new ListaCompra();
        
        lista1.agregarProducto(aba1);
        lista1.agregarProducto(aseo1);
        lista1.agregarProducto(conge1);
        lista1.agregarProducto(liq1);
        lista1.agregarProducto(ofe1);
        
        lista2.agregarProducto(aba2);
        lista2.agregarProducto(aseo2);
        lista2.agregarProducto(conge2);
        lista2.agregarProducto(liq2);
        
        System.out.println("Lista de Compras");
        lista1.listarProductos();
        lista1.calcularTotal();
        System.out.println("\nLista de Compras");
        lista2.listarProductos();
        lista2.calcularTotal();
        System.out.println("\n**************");
        aba1.agregarComentario("Mal sabor");
        System.out.println("\n*********");
        aseo2.agregarComentario("no mata los mosquitos");
        
    }
    
}
