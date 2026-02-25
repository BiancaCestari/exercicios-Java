

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



