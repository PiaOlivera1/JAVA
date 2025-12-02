package ar.ecommerce.servicio;

import ar.ecommerce.modelo.Producto;
import ar.ecommerce.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //indica que usamos spring
public class ProductoServicio implements IProductoServicio{

    @Autowired
    private ProductoRepositorio productoRepositorio;


    @Override
    public List<Producto> listarProductos() {

        return productoRepositorio.findAll();
    }

    @Override
    public Producto buscarProductoPorId(Integer idProducto) {
        //Producto producto = productoRepositorio.findBy(idProducto).orElse(null);
        return productoRepositorio.findById(idProducto).orElse(null);
    }

    @Override
    public Producto agregarProducto(Producto producto) {
        productoRepositorio.save(producto);
    }

    @Override
    public void modificarProducto (Producto producto){productoRepositorio.save(producto);}
    @Override
    public void eliminarProducto(Producto producto) {
        productoRepositorio.delete(producto);
    }
}
