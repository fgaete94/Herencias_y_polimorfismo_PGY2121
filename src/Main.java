/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pipeg
 */
public class Main {
    
    public static void main(String[] args) {
        
        Musica mus = new Musica ("Rock", "admin", "admin", 120, 1000);
        Streaming st = new Streaming ("suspenso", "jmaureira", "teamo", 300, 20);
        RedSocial re = new RedSocial ("Instagram", "letelier", "cotito", 50, 5);
        
        Coleccion col = new Coleccion();
        col.agregarInteres(mus);
        col.agregarInteres(st);
        col.agregarInteres(re);
        
        col.masLikes();
        col.masTiempo();
    }
    
}
