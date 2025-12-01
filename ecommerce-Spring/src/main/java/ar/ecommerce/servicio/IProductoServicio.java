package ar.ecommerce.servicio;

import ar.ecommerce.modelo.Producto;

import java.util.List;

public interface IProductoServicio {
    public List<Producto> listarProductos();

    public Producto buscarProductoPorId(Integer idProducto);

    public void agregarProducto(Producto producto);

    public void modificarProducto(Producto producto);

    public void eliminarProducto(Producto producto);
}
