package mysqljavajdbc.modelos;

import java.util.Scanner;

public class Libro {
    private int isbn;
    private String nombre;
    private double precio;
    private String situacion;

    public Libro(){
        
    }
    
    public Libro(int isbn, String nombre, double precio, String situacion) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.precio = precio;
        this.situacion = situacion;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro(){
        Libro l = new Libro();
        System.out.println("Ingrese el I.S.B.N.");
        l.setIsbn(leer.nextInt());
        System.out.println("Ingrese el nombre del libro");
        l.setNombre(leer.next());
        System.out.println("Ingrese el precio del libro");
        l.setPrecio(leer.nextDouble());
        System.out.println("Ingrese la situacion del mismo");
        l.setSituacion(leer.next());
        return l;
    }
    
    
}
