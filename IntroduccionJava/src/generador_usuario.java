public class generador_usuario {
    public static void main(String[] args) {
        var nombre = "Lucas Lopez";
        var DNI = "45948832";

        var nombre2 = nombre.strip().toLowerCase();

        var usuario = nombre2.substring(0,3);

        var usuario2 = DNI.substring(DNI.length()-3);

        var usuarioCompleto = usuario + usuario2;


        System.out.println(usuarioCompleto);

    }
}
