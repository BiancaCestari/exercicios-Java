/**
 * Exercício: verificar se um número é par ou ímpar.
 */



    public class ParOuImpar {
    public static void main(String[] args) {

        int number = 1;
        String resultado;

        if (number % 2 == 0) {
            resultado = "Par";
        } else {
            resultado = "Ímpar";
        }

        System.out.println(resultado);
    }
}
