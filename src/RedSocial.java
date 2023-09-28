/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pipeg
 */
public class RedSocial extends Interes implements Like {
    
    private String nombreRs;

    public RedSocial() {
        super();
    }

    public RedSocial(String nombreRs, String usuario, String clave, int timpoConectado, int like) {
        super(usuario, clave, timpoConectado, like);
        this.nombreRs = nombreRs;
    }

    public String getNombreRs() {
        return nombreRs;
    }

    public void setNombreRs(String nombreRs) {
        this.nombreRs = nombreRs;
    }

    @Override
    public String toString() {
        return "RedSocial{" + "nombreRs=" + nombreRs + '}' + " " + super.toString();
    }
    
     public void listarRedSocial(){
        System.out.println("Usuario: "+super.getUsuario());
        System.out.println("Tiempo conectado: "+super.getTimpoConectado());
        System.out.println("Nombre Red Social: "+this.getNombreRs());
    }

    @Override
    public void vizualizar() {
        System.out.println("Usuario: "+super.getUsuario());
        System.out.println("Nombre Red Social: "+this.getNombreRs()); 
    }

    @Override
    public void likes() {
        System.out.println("Likes: "+ super.getLike());
        System.out.println("Tiempo conectado: "+super.getTimpoConectado());
    }

}
