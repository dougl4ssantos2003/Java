/**
 * Crie um programa que permita ao progessor informar várias notas.
 *
 * Depois de cada nota, pergunte:
 *
 * Deseja informar outra nota?:
 * Utilize do-while para repetir a entrada e JOptionPane para entrada e saída de dados.
 *
 * Ao final, mostre a média e o conceito final do aluno (APROVADO ou REPROVADO):
 *
 * Para ser aprovado o aluno deve ter média maior ou igual a 50
 */
package exercicio04a;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Exercicio04a {

    public static void main(String[] args) {
        
        double media, somaNotas = 0;
        int cont = 0, resp;
        String msg, title = "Programa de Notas", notaStr;
        try{
        do {
            cont++;
            while (true) {
                try {
                    notaStr = JOptionPane.showInputDialog(null, "Digite uma nota", title, 3);
                    somaNotas += Double.parseDouble(notaStr.replace(",", "."));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Digite um numero!");
                }
            }
            media = somaNotas / cont;
            if (media > 50) {
                msg = "Aluno Aprovado com média = " + String.format("%.2f", media);
            } else {
                msg = "Aluno Reprovado com média = " + String.format("%.2f", media);
            }
            resp = JOptionPane.showConfirmDialog(null, "Deseja informar outra nota ?", title, JOptionPane.YES_NO_OPTION, 3);
            if (resp == 1) {
                break;
            }
        } while (true);
        JOptionPane.showMessageDialog(null, "Programa Encerrado!\n" + msg, title, 1);
        }catch(java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Encerrou o Programa", title, 2);
        }
    }

}
