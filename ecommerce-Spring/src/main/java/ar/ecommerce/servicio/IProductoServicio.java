package ar.ecommerce.controller;

import ar.ecommerce.modelo.Producto;
import ar.ecommerce.servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductoController {

    @Autowired
    private ProductoServicio productoServicio;

    // ------------------ CREATE ------------------
    @PostMapping
    public Producto createProduct(@RequestBody Producto producto) {
        return productoServicio.agregarProducto(producto);
    }

    // ------------------ READ ALL ------------------
    @GetMapping
    public List<Producto> listarProductos() {
        return productoServicio.listarProductos();
    }

    // ------------------ READ BY ID ------------------
    @GetMapping("/{id}")
    public Producto obtenerProducto(@PathVariable Integer id) {
        return productoServicio.buscarProductoPorId(id);
    }

    // ------------------ UPDATE ------------------
    @PutMapping("/{id}")
    public Producto actualizarProducto(@PathVariable Integer id, @RequestBody Producto producto) {
        Producto productoExistente = productoServicio.buscarProductoPorId(id);

        if (productoExistente == null) {
            return null; // o lanzar una excepción si querés manejarlo mejor
        }

        // Actualizá los campos que quieras (ejemplo)
        productoExistente.setNombre(producto.getNombre());
        productoExistente.setPrecio(producto.getPrecio());
        productoExistente.setStock(producto.getStock());

        return productoServicio.modificarProducto(productoExistente);
    }

    // ------------------ DELETE ------------------
    @DeleteMapping("/{id}")
    public String eliminarProducto(@PathVariable Integer id) {
        Producto producto = productoServicio.buscarProductoPorId(id);
        if (producto == null) {
            return "Producto no encontrado";
        }
        productoServicio.eliminarProducto(producto);
        return "Producto eliminado correctamente";
    }
}
