
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Coleccion {
    
    private ArrayList <Interes> listaIntereses;

    public Coleccion() {
        listaIntereses = new ArrayList<>();
    }
    
    public boolean agregarInteres(Interes interes){
        return listaIntereses.add(interes);
    }
    
    
    public  void masLikes(){
        int mayor=0;
        String mayorInteres ="";
        for (Interes interes : listaIntereses) {
            if(interes.getLike() > mayor){
                mayor = interes.getLike();
                mayorInteres = interes.getClass().getName();
            }
            
        }
//        
//        switch (mayorInteres){
//            case 
//        }
        System.out.println("El mayor Interes es: "+mayorInteres);
    }
    
    public  void masTiempo(){
      int mayor=0;
      String mayorTiempo ="";
      for (Interes interes : listaIntereses) {
          if(interes.getTimpoConectado() > mayor){
              mayor = interes.getTimpoConectado();
              mayorTiempo = interes.getClass().getName();
          }

      }
//        
//        switch (mayorInteres){
//            case 
//        }
      System.out.println("Y El mayor Interes es: "+mayorTiempo);
  }
}
