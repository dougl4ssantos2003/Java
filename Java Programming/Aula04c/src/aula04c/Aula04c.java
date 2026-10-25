/**
 * Nesse programa vamos criar um jogo de advinhação, onde o jogador deve advinhar um número sorteado
 * pelo sistema. O jogador tera tres chances de descobrir o número. A cada palpite errado, o sistema
 * fornece uma dica dizendo se o palpite é maior ou menor do que o número sorteado
 */
package aula04c;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Aula04c {

    public static void main(String[] args) {

        Random rd = new Random();
        do {
            int nSecreto = rd.nextInt(10) + 1;
            int tent = 3;
            boolean acertou = false;
            String title = "Jogo Advinhação";

            do {
                int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o seu palpite.", title, 1));
                if (n == nSecreto) {
                    acertou = true;
                    break;
                } else if (n > nSecreto) {
                    JOptionPane.showMessageDialog(null, "Seu palpite é Maior do que o número secreto", title, 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Seu palpite é Menor do que o número secreto", title, 1);
                }
                tent--;
                if (tent >= 1) {
                    JOptionPane.showMessageDialog(null, "Tente Novamente!", title, 1);
                }
            } while (tent >= 1);
            if (tent == 3 && acertou) {
                JOptionPane.showMessageDialog(null, "PARABÉNS!\n você acertou de Primeira!", title, 1);
            } else if (acertou) {
                JOptionPane.showMessageDialog(null, "PARABÉNS!\n você acertou o número secreto!", title, 1);
            } else {
                JOptionPane.showMessageDialog(null, "GAME OVER!\nNumero de tentativas Acabou! \nNúmero secreto é " + nSecreto, title, 1);
            }
            int resp = JOptionPane.showConfirmDialog(null, "Deseja Jogar novamente", title, JOptionPane.YES_NO_OPTION, 3);
            if (resp == 1) {
                break;
            }
        } while (true);
    }

}
