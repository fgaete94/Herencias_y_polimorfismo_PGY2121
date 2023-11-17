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

private int id_equipo,id_marca,id_tipo_equipo;

private  String modelo, numero_serie;


    public Equipo() {
    }
  
    public Equipo(int id_equipo, int id_marca, int id_tipo_equipo, String numero_serie, String modelo) {
        this.id_equipo = id_equipo;
        this.id_marca = id_marca;
        this.id_tipo_equipo = id_tipo_equipo;
        this.numero_serie = numero_serie;
        this.modelo = modelo;
    }


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

    public String getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



    @Override
    public String toString() {

        return "Equipo{" + "id_equipo=" + id_equipo + ", numero_serie=" + numero_serie + ", id_marca=" + id_marca + ", id_tipo_equipo=" + id_tipo_equipo + ", modelo=" + modelo + '}';

    }
    
    

}