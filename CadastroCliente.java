import java.util.Scanner;

public class CadastroCliente {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o email: ");
        String email = scanner.nextLine();

       
        Cliente cliente = new Cliente(nome, idade, email);

        
        cliente.exibir();

        scanner.close();
    }
}

class Cliente {

    String nome;
    int idade;
    String email;

    public Cliente(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public void exibir() {
        System.out.println("\n=== Dados cadastrados com sucesso! ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
    }
}
