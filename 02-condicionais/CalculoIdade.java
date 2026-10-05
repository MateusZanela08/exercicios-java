
import javax.swing.JOptionPane;

public class CalculoIdade {

    public static void main(String[] args) {

        // Entrada de dados
        String textoAnoNascimento = JOptionPane.showInputDialog("Digite seu ano de nascimento:");
        int anoNascimento = Integer.parseInt(textoAnoNascimento);

        String textoAnoAtual = JOptionPane.showInputDialog("Digite o ano atual:");
        int anoAtual = Integer.parseInt(textoAnoAtual);

        // Verificação e cálculo
        if (anoNascimento < anoAtual) {
            int idade = anoAtual - anoNascimento;
            JOptionPane.showMessageDialog(null, "Sua idade é: " + idade);
        } else {
            JOptionPane.showMessageDialog(null, "Ano de nascimento inválido!");
        }
    }
}
