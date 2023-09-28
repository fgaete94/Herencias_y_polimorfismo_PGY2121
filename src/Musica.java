/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pipeg
 */
public class Musica extends Interes implements Like{
    
    private String tipoMusica;

    public Musica() {
        super();
    }

    public Musica(String tipoMusica, String usuario, String clave, int timpoConectado, int like) {
        super(usuario, clave, timpoConectado, like);
        this.tipoMusica = tipoMusica;
    }
 
   

    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    @Override
    public String toString() {
        return "Musica{" + "tipoMusica=" + tipoMusica + '}' + " " + super.toString();
    }
     
    public void listarMusica(){
        System.out.println("Usuario: "+super.getUsuario());
        System.out.println("Tiempo conectado: "+super.getTimpoConectado());
        System.out.println("Tipo Musica: "+this.getTipoMusica());
    }

    @Override
    public void vizualizar() {
        System.out.println("Usuario: "+super.getUsuario());
        System.out.println("Tipo Musica: "+this.getTipoMusica());
    }

    @Override
    public void likes() {
        System.out.println("Likes: "+ super.getLike());
        System.out.println("Tiempo conectado: "+super.getTimpoConectado());
    }
    

 
    

    
    
    
}
