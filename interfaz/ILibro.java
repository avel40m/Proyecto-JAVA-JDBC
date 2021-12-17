
package mysqljavajdbc.interfaz;

public interface ILibro {
    public boolean agregar();
    public void mostrarLibros();
    public void buscarLikeNombre();
    public void ordenarPorNombre();
    public void ordenarPorNombreDesc();
}
