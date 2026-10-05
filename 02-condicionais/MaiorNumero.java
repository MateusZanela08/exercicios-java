
import javax.swing.JOptionPane;

public class MaiorNumero {

    public static void main(String[] args) {
        String texto1 = JOptionPane.showInputDialog("insira o primeiro numero");
        int n1 = Integer.parseInt(texto1);

        String texto2 = JOptionPane.showInputDialog("insira o segundo numero");
        int n2 = Integer.parseInt(texto2);

        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "o primeiro é maior");
        } else if (n2 > n1) {
            JOptionPane.showMessageDialog(null, "o segundo é maior");
        } else {
            JOptionPane.showMessageDialog(null, "os dois são iguais");
        }
    }
}
