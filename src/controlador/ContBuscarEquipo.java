package controlador;

import bbdd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Equipo;
import modelo.Marca;
import modelo.Proceso;
import modelo.TipoEquipo;
import modelo.TipoProceso;
import modelo.Usuario;
import vistas.Buscar;

/*
 *
 * @author Ariel Mathias
 */

// Buscar estado de Equipo ingresado
public class ContBuscarEquipo {

    public ArrayList<Proceso> buscarEquipoLista() {

        //Proceso proceso = new Proceso();
        ArrayList<Proceso> listaProceso = new ArrayList<>();

        try {
            // Aquí creamos el objeto conexion de la Clase Conexion
            Conexion conexion = new Conexion();
            Connection cnt = conexion.obtenerConexionOracle();
            
            String query = "SELECT * FROM PROCESO";
            PreparedStatement pstmt = cnt.prepareStatement(query);

            ResultSet rst = pstmt.executeQuery();

            while (rst.next()) {
                Proceso proceso = new Proceso();
                proceso.setId_equipo(rst.getInt("id_equipo"));
                proceso.setId_proceso(rst.getInt("id_proceso"));
                proceso.setId_tipo_proceso(rst.getInt("id_tipo_proceso"));
                proceso.setId_usuario(rst.getInt("id_usuario"));
                listaProceso.add(proceso);
            }

//                if (rst.next()) {
//                    proceso1.setId_equipo(rst.getInt("id_equipo"));
//                    proceso1.setId_proceso(rst.getInt("id_proceso"));
//                    proceso1.setId_tipo_proceso(rst.getInt("id_tipo_proceso"));
//                    proceso1.setId_usuario(rst.getInt("id_usuario"));
//                }
            rst.close();
            pstmt.close();
            cnt.close();
           
        } catch (Exception e) {
            System.out.println("Error de SQL al insertar equipo" + e.getMessage());
        }

        return listaProceso;
    }
    
    public Proceso buscarEquipo (String idEquip){
        Proceso proceso = new Proceso();
  
        try {
            // Aquí creamos el objeto conexion de la Clase Conexion
            Conexion conexion = new Conexion();
            Connection cnt = conexion.obtenerConexionOracle();
            String query = "SELECT * FROM PROCESO WHERE id_equipo = ? ORDER BY 3 DESC";
            PreparedStatement pstmt = cnt.prepareStatement(query);

            pstmt.setString(1, String.valueOf(idEquip));
            ResultSet rst = pstmt.executeQuery();

            if (rst.next()) {
                proceso.setId_proceso(rst.getInt("id_proceso"));
                proceso.setId_usuario(rst.getInt("id_usuario"));
                proceso.setFecha(rst.getDate("fecha"));
                proceso.setId_tipo_proceso(rst.getInt("id_tipo_proceso"));
                proceso.setId_equipo(rst.getInt("id_equipo"));
            }
            
            rst.close();
            pstmt.close();
            cnt.close();

        } catch (Exception e) {
            System.out.println("Error de SQL al consultar proceso" + e.getMessage());
        }
        return proceso;    
        
        
    }
//    public ArrayList<Proceso> buscarEquipo(String idEquipo) {
//        ArrayList<Proceso> listaProceso = new ArrayList<>();
//
//        try {
//            // Aquí creamos el objeto conexion de la Clase Conexion
//            Conexion conexion = new Conexion();
//            Connection cnt = conexion.obtenerConexionOracle();
//            String query = "SELECT * FROM PROCESO WHERE id_equipo = ?";
//            PreparedStatement pstmt = cnt.prepareStatement(query);
//
//            pstmt.setString(1, idEquipo);
//            ResultSet rst = pstmt.executeQuery();
//
//            // Itera sobre los resultados y agrega cada proceso a la lista
//            while (rst.next()) {
//                Proceso proceso = new Proceso();
//                proceso.setId_equipo(rst.getInt("id_equipo"));
//                proceso.setId_proceso(rst.getInt("id_proceso"));
//                proceso.setId_tipo_proceso(rst.getInt("id_tipo_proceso"));
//                proceso.setId_usuario(rst.getInt("id_usuario"));
//                listaProceso.add(proceso);
//            }
//
//            // Cierra los recursos
//            rst.close();
//            pstmt.close();
//            cnt.close();
//
//        } catch (Exception e) {
//            System.out.println("Error de SQL al insertar equipo" + e.getMessage());
//        }
//
//        return listaProceso;
//    }

    // Buscar el tipo de proceso que tiene el equipo
    public TipoProceso buscarTipoProceso(int id_tipo) {

        TipoProceso tipo = new TipoProceso();

        try {
            // Aquí creamos el objeto conexion de la Clase Conexion
            Conexion conexion = new Conexion();
            Connection cnt = conexion.obtenerConexionOracle();
            String query = "SELECT * FROM TIPO_PROCESO WHERE id_tipo_proceso = ?";
            PreparedStatement pstmt = cnt.prepareStatement(query);

            pstmt.setString(1, String.valueOf(id_tipo));
            ResultSet rst = pstmt.executeQuery();

            if (rst.next()) {
                tipo.setId_tipo_proceso(rst.getInt("id_tipo_proceso"));
                tipo.setNombre(rst.getString("nombre"));
            }
            rst.close();
            pstmt.close();
            cnt.close();

        } catch (Exception e) {
            System.out.println("Error de SQL al insertar equipo" + e.getMessage());
        }
        return tipo;
    }

    // Buscar el modelo del Equipo
    public Equipo buscarEquipo(int idEquipo) {

        Equipo equipo = new Equipo();

        try {
            Conexion conexion = new Conexion();
            Connection cnt = conexion.obtenerConexionOracle();
            String query = "SELECT * FROM EQUIPO WHERE id_equipo = ?";
            PreparedStatement pstmt = cnt.prepareStatement(query);

            pstmt.setString(1, String.valueOf(idEquipo));
            ResultSet rst = pstmt.executeQuery();
            if (rst.next()) {
                equipo.setId_equipo(rst.getInt("id_equipo"));
                equipo.setNumero_serie(rst.getString("numero_serie"));
                equipo.setModelo(rst.getString("modelo"));

            }
            rst.close();
            pstmt.close();
            cnt.close();

        } catch (Exception e) {
            System.out.println("Error de SQL al insertar equipo" + e.getMessage());
        }
        return equipo;
    }

    // Buscar la marca del equipo
    public Marca buscarMarca(int marca) {

        Marca mrc = new Marca();

        try {

            Conexion conexion = new Conexion();
            Connection cnt = conexion.obtenerConexionOracle();
            String query = "SELECT * FROM MARCA WHERE id_marca = ?";
            PreparedStatement pstmt = cnt.prepareStatement(query);

            pstmt.setString(1, String.valueOf(marca));
            ResultSet rst = pstmt.executeQuery();

            if (rst.next()) {

                mrc.setId_marca(rst.getInt("id_marca"));
                mrc.setNombre_marca(rst.getString("nombre_marca"));

            }
            rst.close();
            pstmt.close();
            cnt.close();

        } catch (Exception e) {
            System.out.println("Error de SQL al insertar equipo" + e.getMessage());
        }
        return mrc;
    }

    // Buscar el Tipo del Equipo
    public TipoEquipo buscarTipoEquipo(int tipoEquipo) {

        TipoEquipo tipoEqui = new TipoEquipo();

        try {

            Conexion conexion = new Conexion();
            Connection cnt = conexion.obtenerConexionOracle();
            String query = "SELECT * FROM TIPO_EQUIPO WHERE id_tipo_equipo = ?";
            PreparedStatement pstmt = cnt.prepareStatement(query);

            pstmt.setString(1, String.valueOf(tipoEquipo));
            ResultSet rst = pstmt.executeQuery();

            if (rst.next()) {
                tipoEqui.setId_tipo_equipo(rst.getInt("id_tipo_equipo"));
                tipoEqui.setTipo_equipo(rst.getString("tipo_equipo"));
            }
            rst.close();
            pstmt.close();
            cnt.close();

        } catch (Exception e) {
            System.out.println("Error de SQL al buscar tipo equipo" + e.getMessage());
        }
        return tipoEqui;
    }
    
    public Usuario buscarUsuario (int idUsuario){

        Usuario user = new Usuario();

        try {

            Conexion conexion = new Conexion();
            Connection cnt = conexion.obtenerConexionOracle();
            String query = "SELECT * FROM USUARIO WHERE id_usuario = ?";
            PreparedStatement pstmt = cnt.prepareStatement(query);

            pstmt.setString(1, String.valueOf(idUsuario));
            ResultSet rst = pstmt.executeQuery();

            if (rst.next()) {
                user.setId_usuario(rst.getInt("id_usuario"));
                user.setNombre_usuario(rst.getString("nombre_usuario"));
                user.setId_estamento(rst.getInt("id_estamento"));
            }
            rst.close();
            pstmt.close();
            cnt.close();

        } catch (Exception e) {
            System.out.println("Error de SQL al buscar usuario" + e.getMessage());
        }
        return user; 
    }
    
    public Proceso buscarproceso (int idproceso){
           Proceso proce = new Proceso();

        try {

            Conexion conexion = new Conexion();
            Connection cnt = conexion.obtenerConexionOracle();
            String query = "SELECT * FROM PROCESO WHERE id_proceso = ?";
            PreparedStatement pstmt = cnt.prepareStatement(query);

            pstmt.setString(1, String.valueOf(idproceso));
            ResultSet rst = pstmt.executeQuery();

            if (rst.next()) {
                proce.setId_proceso(rst.getInt("id_proceso"));
                proce.setId_usuario(rst.getInt("id_usuario"));
                proce.setFecha(rst.getDate("fecha"));
                proce.setId_tipo_proceso(rst.getInt("id_tipo_proceso"));
                proce.setId_equipo(rst.getInt("id_equipo"));
            }
            rst.close();
            pstmt.close();
            cnt.close();

        } catch (Exception e) {
            System.out.println("Error de SQL al buscar usuario" + e.getMessage());
        }
        return proce; 
    }
    
//    public ArrayList<Proceso> buscarTodos() {
//
//        //Proceso proceso = new Proceso();
//        ArrayList<Proceso> listaProceso = new ArrayList<>();
//
//        try {
//            // Aquí creamos el objeto conexion de la Clase Conexion
//            Conexion conexion = new Conexion();
//            Connection cnt = conexion.obtenerConexionOracle();
//            
//            String query = "SELECT * FROM PROCESO";
//            PreparedStatement pstmt = cnt.prepareStatement(query);
//
//            ResultSet rst = pstmt.executeQuery();
//
//            while (rst.next()) {
//                Proceso proceso = new Proceso();
//                proceso.setId_equipo(rst.getInt("id_equipo"));
//                proceso.setId_proceso(rst.getInt("id_proceso"));
//                proceso.setId_tipo_proceso(rst.getInt("id_tipo_proceso"));
//                proceso.setId_usuario(rst.getInt("id_usuario"));
//                listaProceso.add(proceso);
//            }
//
////                if (rst.next()) {
////                    proceso1.setId_equipo(rst.getInt("id_equipo"));
////                    proceso1.setId_proceso(rst.getInt("id_proceso"));
////                    proceso1.setId_tipo_proceso(rst.getInt("id_tipo_proceso"));
////                    proceso1.setId_usuario(rst.getInt("id_usuario"));
////                }
//        } catch (Exception e) {
//            System.out.println("Error de SQL al insertar equipo" + e.getMessage());
//        }
//
//        return listaProceso;
//    }
    
//     public void cargarprcoeso() {// no funciona aca
//        Buscar tabla = new Buscar();
//        DefaultTableModel modelo =   (DefaultTableModel) tabla.jtab_buscarProceso.getModel();
////        modelo.addColumn("ID Equipo");
////        modelo.addColumn("Nombre Equipo");
////        modelo.addColumn("Número de Serie");
////        modelo.addColumn("Nombre Marca");
////        modelo.addColumn("Nombre Proceso");
////        modelo.addColumn("Nombre Usuario");
//        modelo.setRowCount(0);
//
//        try {
//            // Aquí creamos el objeto conexion de la Clase Conexion
//            Conexion conexion = new Conexion();
//            Connection cnt = conexion.obtenerConexionOracle();
//            String query = "SELECT id_proceso,id_usuario,to_char(fecha,'dd/MM/yyyy hh24:mi'),id_tipo_proceso,id_equipo FROM PROCESO";
//            PreparedStatement pstmt = cnt.prepareStatement(query);
//            ResultSet rst = pstmt.executeQuery();
//
//            while (rst.next()) {
//                Vector v = new Vector();
//                v.add(rst.getInt(1));
//                v.add(rst.getInt(2));
//                v.add(rst.getString(3));
//                v.add(rst.getInt(4));
//                v.add(rst.getInt(5));
//                modelo.addRow(v);;
//
//            }
//            tabla.jtab_buscarProceso.setModel(modelo);
//
//            rst.close();
//            pstmt.close();
//            cnt.close();
//
//        } catch (Exception e) {
//            System.out.println("Error de SQL al consultar proceso" + e.getMessage());
//        }
//    }
    
 
    
}
