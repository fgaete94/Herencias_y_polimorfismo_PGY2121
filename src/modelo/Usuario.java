/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pipeg
 */
public class Usuario {
    
    private int id_usuario,id_estamento;
    private String nombre_usuario;

    public Usuario() {
    }

    public Usuario(int id_usuario, int id_estamento, String nombre_usuario) {
        this.id_usuario = id_usuario;
        this.id_estamento = id_estamento;
        this.nombre_usuario = nombre_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_estamento() {
        return id_estamento;
    }

    public void setId_estamento(int id_estamento) {
        this.id_estamento = id_estamento;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", id_estamento=" + id_estamento + ", nombre_usuario=" + nombre_usuario + '}';
    }
    
    
    
}
