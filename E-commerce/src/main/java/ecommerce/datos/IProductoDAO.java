package ecommerce.datos;

import java.util.ArrayList;
import java.util.List;
import ecommerce.dominio.Producto;

// definomos los métodos que van a tener el comportamiento de la clase productoDAO
public interface IProductoDAO {
    //ArrayList<Producto>listarProducto();
    List<Producto> listarProducto();
    boolean buscarProductoPorId( Producto producto); //indica si se encontro el registro o no
    boolean agregarProducto(Producto producto);
    boolean modificarProducto (Producto producto);
    boolean eliminarProducto (Producto producto);

}
