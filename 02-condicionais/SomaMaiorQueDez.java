
import javax.swing.JOptionPane;

public class SomaMaiorQueDez {

    public static void main(String[] args) {
        String texto1 = JOptionPane.showInputDialog("digite o primeiro numero");
        int n1 = Integer.parseInt(texto1);
        String texto2 = JOptionPane.showInputDialog("digite o segundo numero");
        int n2 = Integer.parseInt(texto2);
        int resultado = n1 + n2;
        if (resultado > 10) {

            JOptionPane.showMessageDialog(null, "é mais q 10");
        } else {
            JOptionPane.showMessageDialog(null, "a soma é: " + resultado);
        }

    }
}