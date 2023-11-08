/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pipeg
 */
public class Estamento {
    
    private int id_estamento;
    private String nomEstamento;

    public Estamento() {
    }

    public Estamento(int id_estamento, String nomEstamento) {
        this.id_estamento = id_estamento;
        this.nomEstamento = nomEstamento;
    }

    public int getId_estamento() {
        return id_estamento;
    }

    public void setId_estamento(int id_estamento) {
        this.id_estamento = id_estamento;
    }

    public String getNomEstamento() {
        return nomEstamento;
    }

    public void setNomEstamento(String nomEstamento) {
        this.nomEstamento = nomEstamento;
    }

    @Override
    public String toString() {
        return "Estamento{" + "id_estamento=" + id_estamento + ", nomEstamento=" + nomEstamento + '}';
    }
    
    
    
}
