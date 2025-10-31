public class Persona {
    String nombre;  //Atributos
    String apellido;
    //String email;
    //long celular;

    void mostrarPersona(){ //método
        System.out.println("Nombre: "+nombre +"\nApellido: "+apellido);
    }

    public static void main(String[] args) {
        var persona1 = new Persona();
        System.out.println("*** Creación de clases y objetos ***");
        persona1.nombre ="Julia";
        persona1.apellido ="Rodriguez";
        persona1.mostrarPersona();
    }
}



