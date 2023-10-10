/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioAyudantia;

/**
 *
 * @author pipeg
 */
public class Main {
    public static void main(String[] args) {
        
        Ordenador ord = new Ordenador("HP", "Laptop", "PC", 125600);
        Telefono tel = new Telefono("11", "Apple", "telefno", 865000);
        Auricular ar = new Auricular('A', "JBL", "audifono", 45600);
        
        ListaVenta list = new ListaVenta();
        
        list.agregarProdcuto(ord);
        list.agregarProdcuto(tel);
        list.agregarProdcuto(ar);
        
        
        list.listarprd();
    }
    
}
