package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    public Connection con;
    public Statement sen;
    
    public Conexion ( String host, String dbName, String user, String pass) throws SQLException{
        String protocolo = "jdbc:mysql://";
        String lineaUser = "user="+user;
        String lineaPass = "password="+pass;       
        String urlConexion = protocolo + host + "/" + dbName +"?"+ lineaUser +"&"+ lineaPass;      
        con = DriverManager.getConnection(urlConexion);
    }
    
    public void ejecutar(String query) throws SQLException{
        sen = con.createStatement();
        sen.executeUpdate(query);
        sen.close();
    }
    
    public void desconectar() throws SQLException{
        sen.close();
    }
    
    public ResultSet ejecutarSelect(String select) throws SQLException{
         sen = con.createStatement();
         return sen.executeQuery(select);
    }
}

