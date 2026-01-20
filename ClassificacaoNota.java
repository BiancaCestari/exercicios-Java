/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


        public class ClassificacaoNota {
    public static void main(String[] args) {

        int nota = 5;
        String resultado;

        if (nota < 5) {
            resultado = "Reprovado!";
        } else if (nota >= 5 && nota < 7) {
            resultado = "Recuperação";
        } else {
            resultado = "Aprovado!";
        }

        System.out.println(resultado);
    }
}



