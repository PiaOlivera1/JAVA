public class Aritmetica {
    int operando1; //atributo
    int operando2; //atributo

    public Aritmetica(){ //constructor
        System.out.println("Ejecutando constructor...");
    }

    void sumar (){// metodo
        var resultado = operando1 + operando2;
        System.out.println("Resultado de la suma: "+ resultado);
    }
    void resta (){ //metodo
        var resultado = operando1 - operando2;
        System.out.println("Resultado de la resta: "+ resultado);
    }

    public static void main(String[] args) {
        var aritmetica = new Aritmetica();
        aritmetica.operando1 =5;
        aritmetica.operando2=3;
        aritmetica.sumar();
        aritmetica.resta();

    }
}
