package mysqljavajdbc;

import java.util.Scanner;
import mysqljavajdbc.interfaz.ILibroImple;

public class MysqlJavaJDBC {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean band = false;
        ILibroImple sentencias = new ILibroImple();

        System.out.println("Menu");

        do {
            System.out.println("1 - Agregar Libro");
            System.out.println("2 - Mostrar Libros");
            System.out.println("3 - Buscar por el nombre");
            System.out.println("4 - Ordenar de manera ascendente por nombre");            
            System.out.println("5 - Ordenar de manera descendente por nombre");            
            System.out.println("6 - Salir");

            System.out.println("Ingrese la opción");
            int n = leer.nextInt();

            switch (n) {
                case 1:
                    sentencias.agregar();
                    break;
                case 2:
                    sentencias.mostrarLibros();
                    break;
                case 3:
                    sentencias.buscarLikeNombre();
                    break;
                case 4:
                    sentencias.ordenarPorNombre();
                    break;
                case 5:
                    sentencias.ordenarPorNombreDesc();
                    break;
                case 6:
                    System.out.println("Salio del programa");
                    band = true;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        } while (band == false);

    }

}
