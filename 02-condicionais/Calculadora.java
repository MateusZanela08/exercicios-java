import javax.swing.JOptionPane;
public class Calculadora {
    public static void main(String[] args) {
        double controle;
        double resultado, n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero da operação"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero da operação"));
        controle = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                qual opera\u00e7\u00e3o vc quer fazer?
                                                                 1 - adi\u00e7\u00e3o 
                                                                 2 - subtra\u00e7\u00e3o 
                                                                 3 - multiplica\u00e7\u00e3o 
                                                                 4 - divis\u00e3o"""));
        switch((int) controle){
            case 1 -> {
                resultado = n1 + n2;
                JOptionPane.showMessageDialog(null, "o resultado é: " + resultado);
            }
            case 2 -> {
                resultado = n1 - n2;
                JOptionPane.showMessageDialog(null, "o resultado é: " + resultado);
            }
            case 3 -> {
                resultado = n1 * n2;
                JOptionPane.showMessageDialog(null, "o resultado é: " + resultado);
            }
            case 4 -> {
                resultado = n1 / n2;
                JOptionPane.showMessageDialog(null, "o resultado é: " + resultado);
            }
            default -> JOptionPane.showMessageDialog(null, "opção inválida");
        }
    }
}
