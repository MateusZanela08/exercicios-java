
import java.util.Scanner;

public class CadastroAlunos {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] alunos = new String[100];

            System.out.print("Quantos alunos?: ");
            int n = scanner.nextInt();
            scanner.nextLine();

          

            for (int i = 0; i < n; i++) {
                System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
                alunos[i] = scanner.nextLine();
            }

            System.out.println("\n=== Lista de Alunos ===");
            for (int i = 0; i < n; i++) {
                System.out.println((i + 1) + ". " + alunos[i]);
            }
        }
    }
}
