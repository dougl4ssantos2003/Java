/**
 * Nesse programa vamos estudar a estrutura de repetição while e o comando break para interromper o loop
 */
package aula03e;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula03e {

    public static void main(String[] args) {
        String title = "Escola SENAI";
        String msg;
        String resultado;
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno", title, 3);
        String disciplina = JOptionPane.showInputDialog(null, "Digite a Disciplina avaliada", title, 3);
        double media = 0, nota = 0, somaNotas = 0;
        int numeroNotas = 0;

        while (true) {
            String notaStr = JOptionPane.showInputDialog(null, "Digite a nota do aluno", title, 3);
            numeroNotas++;
            notaStr = notaStr.replace(",", ".");
            somaNotas += Double.parseDouble(notaStr);
            int resp = JOptionPane.showConfirmDialog(null, "Quer lançar outra nota ", title, JOptionPane.YES_NO_OPTION, 3);
            if (resp == 1) {
                break;
            }
        }
        media = somaNotas / numeroNotas;
        if (media >=6){
            resultado = "Aprovado";
        }else {
            resultado = "Reprovado";
        }
        msg = "Aluno: " + nome +"\n"
                + "Disciplina: "+disciplina+"\n"
                + "Média: "+String.format("%.1f", media)+"\n"
                + "Resultado: "+resultado;
        JOptionPane.showMessageDialog(null, msg, title, 1);
    }

}
