/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pipeg
 */
public class TipoEquipo {
    
    private  int id_tipo_equipo;
    private String tipo_equipo;

    public TipoEquipo() {
    }

    public TipoEquipo(int id_tipo_equipo, String tipo_equipo) {
        this.id_tipo_equipo = id_tipo_equipo;
        this.tipo_equipo = tipo_equipo;
    }

    public int getId_tipo_equipo() {
        return id_tipo_equipo;
    }

    public void setId_tipo_equipo(int id_tipo_equipo) {
        this.id_tipo_equipo = id_tipo_equipo;
    }

    public String getTipo_equipo() {
        return tipo_equipo;
    }

    public void setTipo_equipo(String tipo_equipo) {
        this.tipo_equipo = tipo_equipo;
    }

    @Override
    public String toString() {
        return "TipoEquipo{" + "id_tipo_equipo=" + id_tipo_equipo + ", tipo_equipo=" + tipo_equipo + '}';
    }
    
    
    
}