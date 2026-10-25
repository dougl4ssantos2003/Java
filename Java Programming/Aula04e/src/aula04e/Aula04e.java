/**
 * Nesse programa vamos estudar o uso de array em java e manipulação
 */
package aula04e;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula04e {

    public static void main(String[] args) {

        String[] alunos = {"Gaspar", "Jorge", "Anabela", "Luiza"};// ou  String[] alunos = new String [4]

        int[] idades = new int[4]; // ou int[] idades = {20,30,16,25};
        idades[0] = 20;
        idades[1] = 30;
        idades[2] = 16;
        idades[3] = 25;

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno " + alunos[i] + " tem " + idades[i] + " nomes");
        }
    }

}
