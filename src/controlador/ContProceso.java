/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bbdd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.Equipo;
import modelo.Marca;
import modelo.Proceso;
import modelo.TipoEquipo;


/**
 *
 * @author pipeg
 */
public class ContProceso {
    
    public boolean agregarProceso (Proceso proceso){
        try {
            
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionOracle();
            
            String query = "INSERT INTO PROCESO  VALUES (?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, "PROCESO_IDPROCESO_SEC.nextval");
            stmt.setString(2, String.valueOf(proceso.getId_usuario()));
            stmt.setString(3, "SYSDATE");
            stmt.setString(4, String.valueOf(proceso.getId_tipo_proceso()));
            stmt.setString(5, String.valueOf(proceso.getId_equipo()));
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            
            
            return true;
        } catch (Exception e) {
            System.out.println("Error de SQL al insertar libro" + e.getMessage());
            return false;
        }
     }
    
    public Equipo buscarenProceso (String idEquipo){
        
        Equipo equip = new Equipo();
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionOracle();
            
            String query = "SELECT * FROM EQUIPO WHERE id_equipo = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            stmt.setString(1, idEquipo);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()){
                equip.setId_equipo(rs.getInt("id_equipo"));
                equip.setNumero_serie(rs.getString("numero_serie"));
                equip.setModelo(rs.getString("modelo"));
                equip.setId_marca(rs.getInt("id_marca"));
                equip.setId_tipo_equipo(rs.getInt("id_tipo_equipo"));
                
            }
            
            rs.close();
            stmt.close();
            cnx.close();
            
            
        } catch (Exception e) {
            System.out.println("Error de SQL al listar por id equipo" + e.getMessage());
           
        }
        
        return equip;
        
    }
    
    public TipoEquipo buscartipo(int tipoEquipo){
        
        TipoEquipo tipoequipo = new TipoEquipo ();
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionOracle();   
            
            String query = "SELECT * FROM TIPO_EQUIPO WHERE id_tipo_equipo = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            stmt.setString(1, String.valueOf(tipoEquipo));
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()){
                tipoequipo.setId_tipo_equipo(rs.getInt("id_tipo_equipo"));
                tipoequipo.setTipo_equipo(rs.getString("tipo_equipó"));
                
            }
            
            rs.close();
            stmt.close();
            cnx.close();
            
                       
            
        } catch (Exception e) {
            System.out.println("Error de SQL al listar por id equipo" + e.getMessage());
        }
        return tipoequipo;
    }
    
    
    public Marca marca (int marc){
        
        Marca marca = new Marca ();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionOracle();   
            
            String query = "SELECT * FROM MARCA WHERE id_marca = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            stmt.setString(1, String.valueOf(marc));
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()){
                marca.setId_marca(rs.getInt("id_marca"));
                marca.setNombre_marca(rs.getString("nombre_marca"));
                
            }
            
            rs.close();
            stmt.close();
            cnx.close();
            
                       
            
        } catch (Exception e) {
            System.out.println("Error de SQL al listar por id equipo" + e.getMessage());
        }        
        return marca;
    }
    
}
