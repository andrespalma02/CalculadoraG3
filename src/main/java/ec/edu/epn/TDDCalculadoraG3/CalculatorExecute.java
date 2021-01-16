package ec.edu.epn.TDDCalculadoraG3;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("== Calculator Execute ==");

        Calculator c = new Calculator();
        int addition = c.addition(4,7);
        System.out.println("El resultado de llamar al metodo addition con parametros " +
                "4 y 7 retorna " + addition);

        int subtraction = c.subtraction(7,1);
        System.out.println("El resultado de llamar al metodo subtraction con parametros " +
                "7 y 1 retorna " + subtraction);

        int product = c.product(4,5);
        System.out.println("El resultado de llamar al metodo product con parametros " +
                "4 y 5 retorna " + product);


        System.out.println("== It is a change !! ==");

    }
}
