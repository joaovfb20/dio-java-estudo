public class Operadores {
    public static void main(String[] args) throws Exception {
        // Operadores Aritméticos
        int a = 10;
        int b = 5;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Módulo: " + (a % b));

        // Operadores Relacionais
        System.out.println("Igualdade: " + (a == b));
        System.out.println("Diferença: " + (a != b));
        System.out.println("Maior que: " + (a > b));
        System.out.println("Menor que: " + (a < b));
        System.out.println("Maior ou igual a: " + (a >= b));
        System.out.println("Menor ou igual a: " + (a <= b));

        // Operadores Lógicos
        boolean x = true;
        boolean y = false;

        System.out.println("E lógico: " + (x && y));
        System.out.println("Ou lógico: " + (x || y));
        System.out.println("Não lógico: " + (!x));

    }
}