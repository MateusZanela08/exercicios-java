import java.util.Scanner;

public class RepetirFrase {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            String frase;
            int vezes;
            
            System.out.print("Digite uma frase: ");
            frase = scanner.nextLine();
            
            System.out.print("Quantas vezes deseja exibir a frase? ");
            vezes = scanner.nextInt();
            
            System.out.println("\nResultado:");
            
            for (int i = 1; i <= vezes; i++) {
                System.out.println(i + ". " + frase);
            }
        }
    }
}
