package mysqljavajdbc.interfaz;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
import mysqljavajdbc.DAO.BaseDeDatos;
import mysqljavajdbc.modelos.Libro;

public class ILibroImple implements ILibro {

    private Libro libro = new Libro();
    private Scanner leer = new Scanner(System.in);

    @Override
    public boolean agregar() {
        BaseDeDatos base = new BaseDeDatos();
        Libro l = libro.crearLibro();
        try {

            Statement stmt = base.con.createStatement();
            String sql = "INSERT INTO libro VALUES (null,'" + l.getIsbn() + "','" + l.getNombre() + "','" + l.getPrecio() + "','" + l.getSituacion() + "')";
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
        return false;
    }

    @Override
    public void mostrarLibros() {
        BaseDeDatos base = new BaseDeDatos();
        try {
            Statement stmt = base.con.createStatement();
            String sql = "SELECT * FROM libro";
            ResultSet set = stmt.executeQuery(sql);
            set.next();
            do {
                System.out.println("Codigo: " + set.getString("isbn") + " Nombre del libro: " + set.getString("isbn") + " valor: $" + set.getString("precio") + " Descripción: " + set.getString("situacion"));
            } while (set.next());
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    @Override
    public void buscarLikeNombre() {
        BaseDeDatos base = new BaseDeDatos();
        System.out.println("Ingrese el nombre del libro a buscar");
        String cadena = leer.next();
        try {
            Statement st = base.con.createStatement();
            String sql = "SELECT * FROM libro WHERE nombre LIKE '%" + cadena + "%'";
            ResultSet rt = st.executeQuery(sql);
            rt.next();
            do {
                System.out.println("Codigo: " + rt.getString("isbn") + " Nombre del libro: " + rt.getString("nombre") + " valor: $" + rt.getString("precio") + " Descripción: " + rt.getString("situacion"));
            } while (rt.next());
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    @Override
    public void ordenarPorNombre() {
        BaseDeDatos base = new BaseDeDatos();
        try {
            Statement st = base.con.createStatement();
            String sql = "SELECT * FROM libro ORDER BY nombre";
            ResultSet rt = st.executeQuery(sql);
            rt.next();
            do {
                System.out.println("Codigo: " + rt.getString("isbn") + " Nombre del libro: " + rt.getString("nombre") + " valor: $" + rt.getString("precio") + " Descripción: " + rt.getString("situacion"));
            } while (rt.next());

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    @Override
    public void ordenarPorNombreDesc() {
        BaseDeDatos base = new BaseDeDatos();
        try {
            Statement st = base.con.createStatement();
            String sql = "SELECT * FROM libro ORDER BY nombre DESC";
            ResultSet rt = st.executeQuery(sql);
            rt.next();
            do {
                System.out.println("Codigo: " + rt.getString("isbn") + " Nombre del libro: " + rt.getString("nombre") + " valor: $" + rt.getString("precio") + " Descripción: " + rt.getString("situacion"));
            } while (rt.next());

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        } }

}
