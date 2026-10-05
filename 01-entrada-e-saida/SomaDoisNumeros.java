
    import javax.swing.JOptionPane;

    public class SomaDoisNumeros {
    
    public static void main(String[] args){
        
        String valor1 = JOptionPane.showInputDialog("digite o primeiro numero:");
            int n1 = Integer.parseInt(valor1);
        String valor2 = JOptionPane.showInputDialog("digite o segundo numero:");
            int n2 = Integer.parseInt(valor2);
                int soma = n1 + n2;
                JOptionPane.showMessageDialog(null, "resultado:" + soma);
            
                
    }
}
