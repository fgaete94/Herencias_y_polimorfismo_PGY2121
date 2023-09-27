/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pipeg
 */
public class Musica extends User {
    
    private String tipoMusica;

    public Musica() {
        super();
    }

    public Musica(String tipoMusica, String usuario, String clave, int timpoConectado) {
        super(usuario, clave, timpoConectado);
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
        return "Musica{" + "tipoMusica=" + tipoMusica + '}';
    }
    
    //listar

    @Override
    public void listar() {
        
        System.out.println("Usuario: "+super.getUsuario());
        System.out.println("Tiempo Conectado: "+ super.getTimpoConectado());
        System.out.println("Tipo de Musica: "+ this.getTipoMusica());
        
    }

    @Override
    public void acumulaLike() {
       System.out.println("El usuario: "+ super.getUsuario());
       System.out.println("Tiene: "+ like + " likes");
       System.out.println("Tiempo: "+ super.getTimpoConectado());
    }

    
    
    
}
