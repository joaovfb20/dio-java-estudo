public class OperadoresTernarios {
    public static void main(String[] args) {
        // Operador Ternário
        int a = 10;
        int b = 5;

        String resultado = (a > b) ? "A é maior que B" : "B é maior que A";
        System.out.println(resultado);

        // Operador Ternário com valor numérico
        int maior = (a > b) ? a : b;
        System.out.println("O maior valor é: " + maior);

        // Operador Ternário com valor booleano
        boolean ehMaior = (a > b) ? true : false;
        System.out.println("A é maior que B? " + ehMaior);

        // Operador Ternário com valor String
        String mensagem = (a > b) ? "A é maior" : "B é maior";
        System.out.println(mensagem);

        // Operador Ternário com valor String e concatenação  
        String mensagemCompleta = (a > b) ? "O valor de A é: " + a : "O valor de B é: " + b;
        System.out.println(mensagemCompleta);
        // Operador Ternário com valor String e concatenação e método toUpperCase
        String mensagemCompletaUpper = (a > b) ? "O valor de A é: " + a : "O valor de B é: " + b;
        System.out.println(mensagemCompletaUpper.toUpperCase());
    }
}
