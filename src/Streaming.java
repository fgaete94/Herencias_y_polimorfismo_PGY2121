/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pipeg
 */
public class Streaming extends Interes implements Like {
    
    private String genero;

    public Streaming() {
        super();
    }

    public Streaming(String genero, String usuario, String clave, int timpoConectado, int like) {
        super(usuario, clave, timpoConectado, like);
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
        return "Streaming{" + "genero=" + genero + '}' + " " + super.toString();
    }
    
     public void listarStreaming(){
        System.out.println("Usuario: "+super.getUsuario());
        System.out.println("Tiempo conectado: "+super.getTimpoConectado());
        System.out.println("Genero Streaming: "+this.getGenero());
    }

    @Override
    public void vizualizar() {
       System.out.println("Usuario: "+super.getUsuario());
       System.out.println("Genero Streaming: "+this.getGenero());
    }

    @Override
    public void likes() {
        System.out.println("Likes: "+ super.getLike());
        System.out.println("Tiempo conectado: "+super.getTimpoConectado());
    }

}
