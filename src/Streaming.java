/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pipeg
 */
public class Streaming extends User {
    
    private String genero;

    public Streaming() {
        super();
    }

    public Streaming(String genero, String usuario, String clave, int timpoConectado) {
        super(usuario, clave, timpoConectado);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Streaming{" + "genero=" + genero + '}';
    }
    
    //listar
    
    @Override
    public void listar() {
        
        System.out.println("Usuario: "+super.getUsuario());
        System.out.println("Tiempo Conectado: "+ super.getTimpoConectado());
        System.out.println("Genero vizualizado: "+ this.getGenero());
    }
    
    
    // LIKES
    
    @Override
    public void acumulaLike() {
       System.out.println("El usuario: "+ super.getUsuario());
       System.out.println("Tiene: "+ like + " likes");
       System.out.println("Tiempo: "+ super.getTimpoConectado());
    }

}
