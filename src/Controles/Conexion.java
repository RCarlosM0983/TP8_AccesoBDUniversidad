
package Controles;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    
    private Connection conexion = null;
    
    public Connection conectar() throws SQLException {

       try {
           Class.forName("com.mysql.cj.jdbc.Driver");

           conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"universidadg3"+"?useUnicode=true&use"+
            "JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&"+
            "serverTimezone=UTC", "root", "");
       } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog(null, "Error al conectar los drivers");
       }
        return conexion;
    }

    public Connection getConexion() {
        return conexion;
    }

      
}
