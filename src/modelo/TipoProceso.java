/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pipeg
 */
public class TipoProceso {
    
    private  int id_tipo_proceso;
    private  String nombre;

    public TipoProceso() {
    }

    public TipoProceso(int id_tipo_proceso, String nombre) {
        this.id_tipo_proceso = id_tipo_proceso;
        this.nombre = nombre;
    }

    public int getId_tipo_proceso() {
        return id_tipo_proceso;
    }

    public void setId_tipo_proceso(int id_tipo_proceso) {
        this.id_tipo_proceso = id_tipo_proceso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "TipoProceso{" + "id_tipo_proceso=" + id_tipo_proceso + ", nombre=" + nombre + '}';
    }
    
      
}