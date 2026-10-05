
import javax.swing.JOptionPane;
public class AprovacaoCredito {

    public static void main(String[] args) {
    String texto = JOptionPane.showInputDialog("digite seu salario bruto");
    double salario = Double.parseDouble(texto);
    String texto1 = JOptionPane.showInputDialog("digite o seu crédito");
    double credito = Double.parseDouble(texto1);
    
    if(credito <= salario * 0.30){
        JOptionPane.showMessageDialog(null, "seu crédito foi aprovado");
    }else{
        JOptionPane.showMessageDialog(null, "crédito meuito alto para seu salario");
    }
    
    }
    
}
