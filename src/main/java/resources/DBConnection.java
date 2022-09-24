/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dagyus
 */
public class DBConnection {
    
    private static Connection conexion;
    private PreparedStatement sentencia;
    private ResultSet resultado;
    
    public static void conectar() throws ClassNotFoundException, SQLException {
        try {
			Class.forName(IDBConnectionProperties.driver);
		} catch (ClassNotFoundException e) {
			throw new ClassNotFoundException("Error de driver " + e.getMessage());
		}
		try {
                        String urlFinal=IDBConnectionProperties.url+IDBConnectionProperties.servidor+":"+
                                        String.valueOf(IDBConnectionProperties.puerto)+"/"+
                                        IDBConnectionProperties.BD+"?autoReconnect=true&useSSL=false";
                        conexion=DriverManager.getConnection(urlFinal,
                                        IDBConnectionProperties.usuario,
					IDBConnectionProperties.password);
			setConexion(conexion);
		} catch (SQLException e) {
			throw new SQLException("Error en la conexion \n codigo"
					+ e.getErrorCode() + "Explicacion:" + e.getMessage());
		}
    }
    
    public static void desconectar() throws SQLException{
        conexion.close();
    }
    
    public static Connection getConexion() {
        return conexion;
    }

    /**
     * @param otherConnection
     */
    public static void setConexion(Connection otherConnection) {
        conexion=otherConnection;
    }

    /**
     * @return the sentencia
     */
    public PreparedStatement getSentencia() {
        return sentencia;
    }

    /**
     * @param sentencia the sentencia to set
     */
    public void setSentencia(PreparedStatement sentencia) {
        this.sentencia = sentencia;
    }

    /**
     * @return the resultado
     */
    public ResultSet getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(ResultSet resultado) {
        this.resultado = resultado;
    }// </editor-fold>
}
