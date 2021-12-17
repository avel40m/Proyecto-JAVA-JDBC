package mysqljavajdbc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDeDatos {
   public Connection con;
    
    public void conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tutorial","root","newroot");
        } catch (Exception e) {
            System.out.println("No se pudo conectar");
        }
    }
    
    public BaseDeDatos(){
        conectar();
    }
    
    public static void main(String[] args) {
        new BaseDeDatos();
    }
}
