import javax.swing.JOptionPane;

public class MediaNotas {
    public static void main(String[] args) {

        float notas[] = new float[100]; // 

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));

        for (int i = 0; i < n; i++) {
            notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do aluno " + (i + 1)));
        }

        float soma = 0;
        for (int i = 0; i < n; i++) {
            soma += notas[i];
        }

        float media = soma / n;
        JOptionPane.showMessageDialog(null, "Média: " + media); // 
    }
}
