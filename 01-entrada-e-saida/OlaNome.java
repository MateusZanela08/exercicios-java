
import javax.swing.JOptionPane;

public class OlaNome{
    
    public static void main(String[] args){
        
        String nome =JOptionPane.showInputDialog("digite seu nome:");
        
        JOptionPane.showMessageDialog(null, "Ola, " + nome);
    }
    
}