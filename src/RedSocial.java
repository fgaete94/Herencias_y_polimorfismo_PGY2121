/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pipeg
 */
public class RedSocial extends User {
    
    private String nombreRs;

    public RedSocial() {
        super();
    }

    public RedSocial(String nombreRs, String usuario, String clave, int timpoConectado) {
        super(usuario, clave, timpoConectado);
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
        return "RedSocial{" + "nombreRs=" + nombreRs + '}';
    }
    
    //listar
    
    @Override
    public void listar() {
        
        System.out.println("Usuario: "+super.getUsuario());
        System.out.println("Tiempo Conectado: "+ super.getTimpoConectado());
        System.out.println("Nombre Red Social: "+ this.getNombreRs());
    }

    
}
