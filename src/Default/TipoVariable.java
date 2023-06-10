package Default;

public class TipoVariable {
    public static void main(String[] args) {

        // enteros
        int edad = 28;
        System.out.println(edad);

        edad = 46 + 88;
        System.out.println(edad);
        System.out.println("Mi edad es: "+edad); // concatenación de valores

        // double

        double salario = 1250.50;
        double salarioMitad = salario/2;
        double edad2 = 28;
        int division = 1250/3;
        System.out.println("El salario es: "+salario);
        System.out.println("La edad es: "+edad2);
        System.out.println(salarioMitad);
        System.out.println(division);

        // conversiones
        double variable1 = 230.89;
        int variableEntero = (int) variable1; // cast
        // este metodo imprime en consola
        System.out.println(variableEntero);

        long prueba = 122222222222222222L;
        short numeroPequeno = 13555;
        byte numeroAunMasPequeno = 15;// notación camelCase
        float numeroDecimalPequeno = 2.5F;

        int resultado = (int) (variable1 + variableEntero);
        System.out.println(resultado);
    }
}
