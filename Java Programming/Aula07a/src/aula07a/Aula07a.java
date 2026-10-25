/**
 * Nesse
 */
package aula07a;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula07a {

    public static void main(String[] args) {

        //Pessoa
        String nome = JOptionPane.showInputDialog(null, "Digite o Nome do Visitante:");
        int idade = 0;
        while (true) {
            try {
                idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do Aluno:"));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite uma idade valida!");
            }
        }
        Pessoa pessoa1 = new Pessoa(nome, idade);
        pessoa1.exibirMensagem();

        //Aluno
        nome = JOptionPane.showInputDialog(null, "Digite o Nome do Aluno:");
        while (true) {
            try {
                idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do Aluno:"));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite uma idade valida!");
            }
        }
        String curso = JOptionPane.showInputDialog(null, "Digite o Curso do Aluno:");
        String periodo = JOptionPane.showInputDialog(null, "Digite o Periodo do Aluno:");
        double n[] = new double[3];
        for (int i = 0; i < 3; i++) {
            String strNota = JOptionPane.showInputDialog(null, "Digite a °" + (i + 1) + " do Aluno:");
            strNota = strNota.replace(",", ".");
            n[i] = Double.parseDouble(strNota);
        }

        Aluno aluno1 = new Aluno(nome, idade, curso, periodo);
        aluno1.calcularMedia(n[0], n[1], n[2]);
        aluno1.exibirMensagem();

    }

}
