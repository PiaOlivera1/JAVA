package ecommerce.datos;

import ecommerce.conexion.Conexion;
import ecommerce.dominio.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static ecommerce.conexion.Conexion.getConexion;

public class ProductoDAO implements IProductoDAO{


    @Override
    public List<Producto> listarProducto() {
        List<Producto> productos = new ArrayList<>();
        PreparedStatement ps; //prepara la sentencia de sql que vamos a ejecutar de la bd
        ResultSet rs;
        Connection con =getConexion();
        var sql = "SELECT * FROM producto ORDER BY id";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){ // si tiene registor a iterar entra al ciclo
                var producto = new Producto();
                producto.setId(rs.getInt("id"));
                producto.setNombre(rs.getString("Nombre"));
                producto.setPrecio(rs.getDouble("Precio"));
                producto.setDescripcion(rs.getString("Descripcion"));
                producto.setCategoria(rs.getString("Categoria"));
                productos.add(producto);
            }
        } catch (Exception e) {
            System.out.println("Error al listar clientes: "+e.getMessage());
        }
        finally { //cerramos la conexion
            try{
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar conexion" +e.getMessage());
            }
        }

        return productos;
    }


    @Override
    public boolean buscarProductoPorId(Producto producto) {
        PreparedStatement ps;
        ResultSet rs; // recibe el resultado de la bd
        Connection con = getConexion();
        String sql = "SELECT * FROM producto WHERE id = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,producto.getId()); //el id se coloca en el signo de pregunta del sql
            rs = ps.executeQuery(); //Recibe el resultado de sql
            if(rs.next()){ // método "next" consulta si tenemos un registro a leer
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("Precio"));
                producto.setDescripcion(rs.getString("Descripcion"));
                producto.setCategoria(rs.getString("Categoria"));
                return true;
            }
        }catch (Exception e){
            System.out.println("Error al buscar producto por Id: " +e.getMessage());
        }
        finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar conexion: "+e.getMessage());
            }
        }
        return false;
    }


    @Override
    public boolean agregarProducto(Producto producto) {
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "INSERT INTO producto (Nombre, Precio, Descripcion, Categoria) "
                + "VALUES (?, ?, ?, ?) ";
        try {
            ps= con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setDouble(2,producto.getPrecio());
            ps.setString(3,producto.getDescripcion());
            ps.setString(4, producto.getCategoria());

            ps.executeUpdate();
            return true;
        }catch (Exception e){
            System.out.println("Error al agregar producto: "+e.getMessage());
        }
        finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar la conexion: "+e.getMessage());
            }
        }

        return false;
    }

    @Override
    public boolean modificarProducto(Producto producto) {
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "UPDATE producto SET Nombre=?, Precio=?, Descripcion=?, Categoria=? "+
               "WHERE id=?";
        try {
            ps =con.prepareStatement(sql);
            ps.setString(1,producto.getNombre());
            ps.setDouble(2, producto.getPrecio());
            ps.setString(3,producto.getDescripcion());
            ps.setString(4, producto.getCategoria());
            ps.setInt(5, producto.getId());
            ps.execute();
            return true;

        }catch (Exception e){
            System.out.println("Error al modificar el producto");
        }
        finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar la conexion: "+e.getMessage());
            }
        }

        return false;
    }


    @Override
    public boolean eliminarProducto(Producto producto) {
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "DELETE FROM producto WHERE id=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,producto.getId());
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("Error al eliminar producto: "+ e.getMessage());
        }
        finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar la conexion" +e.getMessage());
            }
        }

        return false;
    }

    public static void main(String[] args) {
        IProductoDAO productoDAO= new ProductoDAO();
        //Listar productos
//        System.out.println("Listar productos");

//        var productos = productoDAO.listarProducto();
//        productos.forEach(System.out::println);

        //Buscar por id
//        var producto1 = new Producto(2);
//        System.out.println("Producto antes de la busqueda:"  +producto1);
//
//        var encontrado =productoDAO.buscarProductoPorId(producto1);
//        if (encontrado)
//            System.out.println("Producto encontrado: "+ producto1);
//        else
//            System.out.println("No se encontro producto: "+producto1.getId());
//
         // agregar producto
//        var nuevoProducto = new Producto("PS5",750, "Consola digita","Tecnologia" );
//        var agregado = productoDAO.agregarProducto(nuevoProducto);
//        if (agregado)
//            System.out.println("Producto agregado: "+nuevoProducto);
//        else
//            System.out.println("No se agrego producto: "+nuevoProducto);

        //MODIFICAR CLIENTE
//        var modificarProducto = new Producto(4,"PS4", 250, "Consola","Tecnologia");
//        var productoModificado = productoDAO.modificarProducto(modificarProducto);
//        if (productoModificado)
//            System.out.println("Producto modificado con exito: "+modificarProducto);
//        else
//            System.out.println("No se modifico el producto: "+modificarProducto);
        //Eliminar producto
        var productoEliminado = new Producto(4);
        var eliminado = productoDAO.eliminarProducto(productoEliminado);
        if (eliminado)
            System.out.println("Se elimino con exito el producto: "+productoEliminado);
        else
            System.out.println("Error al eliminar el producto: "+productoEliminado);

        // Listar productos
          System.out.println("Listar productos");

        var productos = productoDAO.listarProducto();
        productos.forEach(System.out::println);

    }
}
