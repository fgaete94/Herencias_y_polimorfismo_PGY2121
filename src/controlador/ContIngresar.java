/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bbdd.Conexion;
import modelo.Proceso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.Equipo;
import java.sql.ResultSet;
import modelo.Marca;
import modelo.TipoEquipo;

/**
 *
 * @author jcifu
 */
public class ContIngresar {
    
    public boolean agregarProceso(Proceso proceso){
        try {
            Conexion conex = new Conexion();
            Connection connect = conex.obtenerConexionOracle();
            
            String query = "INSERT INTO PROCESO VALUES (PROCESO_IDPROCESO_SEC.nextval,?,SYSDATE,?,?)";
            PreparedStatement statm = connect.prepareStatement(query);
            //statm.setString(1,"PROCESO_IDPROCESO_SEC.nextval");
            statm.setString(1, String.valueOf(proceso.getId_usuario()));
            //statm.setString(3, "SYSDATE");
            statm.setString(2, String.valueOf(proceso.getId_tipo_proceso()));
            statm.setString(3, String.valueOf(proceso.getId_equipo()));
            
            statm.executeUpdate();
            statm.close();
            connect.close();
            
            return true;
            
        } catch (Exception e) {
            System.out.println("Error de SQL al insertar el equipo: " + e.getMessage());
            return false;
        }
    }
    
    public Equipo buscarEquipoEnProceso(String id_equipo){
        
        Equipo equipo = new Equipo();
        
        try {
            Conexion conex = new Conexion();
            Connection connect = conex.obtenerConexionOracle();
            
            String query = "SELECT * FROM EQUIPO WHERE id_equipo = ?";
            PreparedStatement statm = connect.prepareStatement(query);
            
            statm.setString(1, id_equipo);
            ResultSet result = statm.executeQuery();
            
            if (result.next()) {
                
                equipo.setId_equipo(result.getInt("id_equipo"));
                equipo.setId_marca(result.getInt("id_marca"));
                equipo.setNumero_serie(result.getString("numero_serie"));
                equipo.setModelo(result.getString("modelo"));
                equipo.setId_tipo_equipo(result.getInt("id_tipo_equipo"));
                
                
            }
            
//            statm.executeUpdate();
            result.close();
            statm.close();
            connect.close();
            
            
            
        } catch (Exception e) {
            System.out.println("Error de SQL al listar por id equipo" + e.getMessage());
        }
        
        return equipo;
        
    }
    
    public TipoEquipo buscarTipo(int tipoEquipo){
        
        TipoEquipo tipo = new TipoEquipo();
        
        try {
            Conexion conex = new Conexion();
            Connection connect = conex.obtenerConexionOracle();
            
            String query = "SELECT * FROM TIPO_EQUIPO WHERE id_tipo_equipo = ?";
            PreparedStatement statm = connect.prepareStatement(query);
            
            statm.setString(1, String.valueOf(tipoEquipo));
            ResultSet result = statm.executeQuery();
            
            if (result.next()) {
                
                tipo.setId_tipo_equipo(result.getInt("id_tipo_equipo"));
                tipo.setTipo_equipo(result.getString("tipo_equipó"));
            }
            
            //statm.executeUpdate();
            result.close();
            statm.close();
            connect.close();
            
            
            
        } catch (Exception e) {
            System.out.println("Error de SQL al listar por id equipo" + e.getMessage());
        }
        return tipo;
    }
    
    public Marca buscarMarca(int marcaEquipo){
        
        Marca marca = new Marca();
        
        try {
            
            Conexion conex = new Conexion();
            Connection connect = conex.obtenerConexionOracle();
            
            String query = "SELECT * FROM MARCA WHERE id_marca = ?";
            PreparedStatement statm = connect.prepareStatement(query);
            
            statm.setString(1, String.valueOf(marcaEquipo));
            ResultSet result = statm.executeQuery();
            
            if(result.next()){
                
                marca.setId_marca(result.getInt("id_marca"));
                marca.setNombre_marca(result.getString("nombre_marca"));
                
            }
            
            //statm.executeUpdate();
            result.close();
            statm.close();
            connect.close();
            
        } catch (Exception e) {
            System.out.println("Error de SQL al listar por id equipo" + e.getMessage());
            
        }
        
        return marca;
    }
    
}
