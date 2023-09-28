/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fgaete
 */
public abstract class Interes {
    
    protected String usuario, clave;
    protected int timpoConectado, like; // en segundos

    public Interes() {
    }

    public Interes(String usuario, String clave, int timpoConectado, int like) {
        this.usuario = usuario;
        this.clave = clave;
        this.timpoConectado = timpoConectado;
        this.like = like;
    }

   

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getTimpoConectado() {
        return timpoConectado;
    }

    public void setTimpoConectado(int timpoConectado) {
        this.timpoConectado = timpoConectado;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return "Interes{" + "usuario=" + usuario + ", timpoConectado=" + timpoConectado + ", like=" + like + '}';
    }
    
    

   
    
    public abstract void vizualizar();
    
}
