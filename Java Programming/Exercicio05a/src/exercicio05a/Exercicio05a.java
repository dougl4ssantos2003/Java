/**
 * Uma escola desejar criar um pequeno sistema para calcular a média dos alunos. Crie um método sem retorno
 * e com parâmetro para receber o nome do aluno e imprimir a mensagem: "Fulano Localizado no Sistema".
 * Crie um método com retorno e com parâmetro para receber as três notas, calcular a média e retornar
 * para o método chamador (main). imprima a média do aluno
 */
package exercicio05a;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Exercicio05a {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno.");
        exibir(nome);
        double n[] = new double[3];
        for (int i = 0; i < 3; i++) {
            while (true) {
                try {
                    n[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a °" + (i + 1) + " do aluno."));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Digite uma nota valida!");
                }
            }
        }
        Exercicio05a media = new Exercicio05a();
        JOptionPane.showMessageDialog(null, "A média do Aluno é " + String.format("%.2f", media.calcularMedia(n[0], n[1], n[2])));

    }
    
    public static void exibir(String nome) {
        JOptionPane.showMessageDialog(null, nome + ", localizado no sistema.");
    }

    public double calcularMedia(double n1, double n2, double n3) {
        double media = (n1 + n2 + n3) / 3;
        return media;
    }
}
