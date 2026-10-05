
import javax.swing.JOptionPane;

public class Fatorial {

    public static void main(String[] args) {

        int numero = Integer.parseInt(
                JOptionPane.showInputDialog("Digite um número inteiro:")
        );

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
