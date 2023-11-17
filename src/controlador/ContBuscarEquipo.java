package controlador;

import bbdd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Equipo;
import modelo.Marca;
import modelo.Proceso;
import modelo.TipoEquipo;
import modelo.TipoProceso;

/*
 *
 * @author Ariel Mathias
 */

// Buscar estado de Equipo ingresado
public class ContBuscarEquipo {

    public ArrayList<Proceso> buscarEquipo(String idEquipo) {

        Proceso proceso = new Proceso();
        ArrayList<Proceso> listaProceso = new ArrayList<>();
        for (Proceso proceso1 : listaProceso) {

            try {
                // Aquí creamos el objeto conexion de la Clase Conexion
                Conexion conexion = new Conexion();
                Connection cnt = conexion.obtenerConexionOracle();
                String query = "SELECT *FROM PROCESO WHERE id_equipo = ?";
                PreparedStatement pstmt = cnt.prepareStatement(query);

                pstmt.setString(1, idEquipo);
                ResultSet rst = pstmt.executeQuery();

                if (rst.next()) {
                    proceso.setId_equipo(rst.getInt("id_equipo"));
                    proceso.setId_proceso(rst.getInt("id_proceso"));
                    proceso.setId_tipo_proceso(rst.getInt("id_tipo_proceso"));
                    proceso.setId_usuario(rst.getInt("id_usuario"));
                }

            } catch (Exception e) {
                System.out.println("Error de SQL al insertar equipo" + e.getMessage());
            }

        }
        return listaProceso;
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

        } catch (Exception e) {
            System.out.println("Error de SQL al insertar equipo" + e.getMessage());
        }
        return tipo;
    }

    // Buscar el modelo del Equipo
    public Equipo buscarEquipo(int modelo) {

        Equipo equipo = new Equipo();

        try {
            Conexion conexion = new Conexion();
            Connection cnt = conexion.obtenerConexionOracle();
            String query = "SELECT * FROM EQUIPO WHERE id_equipo = ?";
            PreparedStatement pstmt = cnt.prepareStatement(query);

            pstmt.setString(1, String.valueOf(modelo));
            ResultSet rst = pstmt.executeQuery();
            if (rst.next()) {
                equipo.setId_equipo(rst.getInt("id_equipo"));
                equipo.setNumero_serie(rst.getString("numero_serie"));
                equipo.setModelo(rst.getString("modelo"));

            }

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

        } catch (Exception e) {
            System.out.println("Error de SQL al insertar equipo" + e.getMessage());
        }
        return tipoEqui;
    }
}
