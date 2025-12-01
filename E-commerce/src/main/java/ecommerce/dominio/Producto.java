package ecommerce.dominio;

import java.util.Objects;

public class Producto {
    private int id;

    private String nombre;
    private double precio;
   // private int stock;
    //private boolean tieneDescuento;
    //private int cantidad;
    private String descripcion;
    private String categoria;

   public Producto(){}


    public Producto( int id){
        this.id =id;
   }

   public Producto (String nombre, double precio, String descripcion, String categoria){
       this.nombre= nombre;
       this.precio = precio;
       this.descripcion = descripcion;
       this.categoria = categoria;
   }

    public Producto (int id,String nombre, double precio, String descripcion, String categoria){
        this(nombre,precio,descripcion,categoria);
        this.id =id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return id == producto.id && Double.compare(precio, producto.precio) == 0 && Objects.equals(nombre, producto.nombre) && Objects.equals(descripcion, producto.descripcion) && Objects.equals(categoria, producto.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, precio, descripcion, categoria);
    }
}

