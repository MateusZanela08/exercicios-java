import javax.swing.JOptionPane;
public class FaixaEtaria {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("digite sua idade");
        int idade = Integer.parseInt(texto);
        if(idade >= 15 && idade <= 25){
            JOptionPane.showMessageDialog(null, "aceito");
        }else{
            JOptionPane.showMessageDialog(null, "recusado");
        }
        
    }
    
}
