package Default;

public class EjemploCiclosWhile2 {
    public static void main(String[] args) {
        int contador = 0;
        int total = 0;
        while (contador <= 10) { // la expresión booleana debe ser verdadera
            total = total + contador;
            contador++;
        }
        System.out.println(total);
    }
}
