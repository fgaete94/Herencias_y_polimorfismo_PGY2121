/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bbdd;

import java.nio.file.Paths; // IMPORTACION DE ORACLE
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties; // IMPORTACION DE ORACLE

/**
 *
 * @author pipeg
 */
public class Conexion {
    
    // DE ACA COMIENZA LA CONEXION A ORACLE
    private static final String WALLET_PATH = "C:\\Users\\pipeg\\OneDrive\\Escritorio\\proyecto software\\wallet prueba";
    private static final String WALLET_PASSWORD = "ClaseMDY3131-";
    private static final String JDBC_URL = "jdbc:oracle:thin:@wbtqioyafg8c13yv_high"; // - REEMPLAZA 'testdb_high' EN EL ARCHIVO TNSNAMES.ORA APARECE AL INICIO [NOMBRE DE LA DB]_HIGH";

    public Connection obtenerConexionOracle() throws Exception {
        // Configuración del wallet
        String trustStorePath = Paths.get(WALLET_PATH, "truststore.jks").toString();
        String keyStorePath = Paths.get(WALLET_PATH, "keystore.jks").toString();

        System.setProperty("oracle.net.tns_admin", WALLET_PATH);
        System.setProperty("javax.net.ssl.trustStore", trustStorePath);
        System.setProperty("javax.net.ssl.trustStorePassword", WALLET_PASSWORD);
        System.setProperty("javax.net.ssl.keyStore", keyStorePath);
        System.setProperty("javax.net.ssl.keyStorePassword", WALLET_PASSWORD);

        Properties properties = new Properties();
        properties.put("user", "PRUEBAENDO");
        properties.put("password", WALLET_PASSWORD);

        return DriverManager.getConnection(JDBC_URL, properties);
    
    }
}
