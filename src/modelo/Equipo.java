/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pipeg
 */
public class Equipo {

private int id_libro,numero_serie,id_marca,id_tipo_equipo;
private  String modelo;

    public Equipo() {
    }

    public Equipo(int id_libro, int numero_serie, int id_marca, int id_tipo_equipo, String modelo) {
        this.id_libro = id_libro;
        this.numero_serie = numero_serie;
        this.id_marca = id_marca;
        this.id_tipo_equipo = id_tipo_equipo;
        this.modelo = modelo;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public int getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(int numero_serie) {
        this.numero_serie = numero_serie;
    }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public int getId_tipo_equipo() {
        return id_tipo_equipo;
    }

    public void setId_tipo_equipo(int id_tipo_equipo) {
        this.id_tipo_equipo = id_tipo_equipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Equipo{" + "id_libro=" + id_libro + ", numero_serie=" + numero_serie + ", id_marca=" + id_marca + ", id_tipo_equipo=" + id_tipo_equipo + ", modelo=" + modelo + '}';
    }


    
}
