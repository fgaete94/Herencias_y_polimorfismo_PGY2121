/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author pipeg
 */
public class Proceso {
    
    private int id_proceso, id_usuario,id_tipo_proceso,id_equipo;
    private String nombre_usuario;
    private Date fecha;

    public Proceso() {
    }

    public Proceso(int id_proceso, int id_usuario, int id_tipo_proceso, int id_equipo, String nombre_usuario, Date fecha) {
        this.id_proceso = id_proceso;
        this.id_usuario = id_usuario;
        this.id_tipo_proceso = id_tipo_proceso;
        this.id_equipo = id_equipo;
        this.nombre_usuario = nombre_usuario;
        this.fecha = fecha;
    }

    public int getId_proceso() {
        return id_proceso;
    }

    public void setId_proceso(int id_proceso) {
        this.id_proceso = id_proceso;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_tipo_proceso() {
        return id_tipo_proceso;
    }

    public void setId_tipo_proceso(int id_tipo_proceso) {
        this.id_tipo_proceso = id_tipo_proceso;
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Proceso{" + "id_proceso=" + id_proceso + ", id_usuario=" + id_usuario + ", id_tipo_proceso=" + id_tipo_proceso + ", id_equipo=" + id_equipo + ", nombre_usuario=" + nombre_usuario + ", fecha=" + fecha + '}';
    }

    
}
