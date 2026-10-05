

import javax.swing.JOptionPane;

public class SomaComWhile {

    public static void main(String[] args) {
        int soma = 0;
     int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero postivio ou -1"));
        while(n>0) {
                  soma = soma + n;
                n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero positivo ou -1"));
                System.out.println(soma);
    }
    }
}
