
import javax.swing.JOptionPane;

public class MultiploDeDois {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("escreva um numero");
        int n1 = Integer.parseInt(texto);
        if ((n1 % 2) == 0) {
            JOptionPane.showMessageDialog(null, "é multiplo de 2");
        } else {
            JOptionPane.showMessageDialog(null, "não é multiplo de 2");
        }
    }
}
