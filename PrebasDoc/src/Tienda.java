import java.util.ArrayList;
import java.util.List;
/**
 * Esta es una clase que representa una tienda básica.
 * Puede agregar, buscar y vender producrtos.
 */

public class Tienda {

    private List<ProductoNuevo> inventario;

    /**
     * Constructor vacio por defecto.
     */

    public Tienda() {
        inventario = new ArrayList<>();
    }

    /**
     * Metodo que añade un producto al inventario,
     * @param producto producto a añadir.
     */

    public void agregarProducto(ProductoNuevo producto) {
        inventario.add(producto);
    }

    
    public ProductoNuevo buscarProducto(String nombre) {
        for (ProductoNuevo producto : inventario) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

  
    public boolean realizarVenta(String nombre, int cantidad) {
        ProductoNuevo producto = buscarProducto(nombre);
        if (producto != null && producto.getCantidadDisponible() >= cantidad) {
            producto.setCantidadDisponible(producto.getCantidadDisponible() - cantidad);
            return true;
        }
        return false;
    }
}