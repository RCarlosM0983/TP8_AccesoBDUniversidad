
package Controles;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    private Connection conexion;
    
    private String driver="com.mysql.jdbc.Driver";
    private String usuario="root";
    private String password="";
    private String url="jdbc:mysql://localhost:3306/universidadg3";
   
/*    
// Funcion que va conectarse a mi bd de mysql
    public Connection conectar() {
        // Reseteamos a null la conexion a la bd
        conexion=null;
        try{
            Class.forName(driver);
            // Nos conectamos a la bd
            conexion= (Connection) DriverManager.getConnection(url, user, pass);
            
        }
        // Si la conexion NO fue exitosa mostramos un mensaje de error
        catch (ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null, "Error al conectar los drivers");
        }
        return conexion;
    }


    public Connection getConexion() {
        return conexion;
    }
*/
   
        public Conexion() throws ClassNotFoundException{
            Class.forName("com.mysql.jdbc.Driver");
        
    }
    
    public Conexion(String url, String user, String password) throws ClassNotFoundException {
        this.url = url;
        this.usuario = usuario;
        this.password = password;

        //Cargamos las clases de mariadb que implementan JDBC
        Class.forName("com.mysql.jdbc.Driver");

    }
    
    public Connection getConexion() throws SQLException{
        if(conexion == null){
                    // Setup the connection with the DB
            conexion = DriverManager
                .getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                        + "&user=" + usuario + "&password=" + password);
        }
        return conexion;
    
    } 
}
