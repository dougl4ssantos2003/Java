/**
 * Nesse programa
 */
package aula06a;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula06a {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.exibirDados();
        aluno1.nome = "Gaspar";
        aluno1.idade = 8;
        aluno1.curso = "JAVA";
        aluno1.exibirDados();

        Aluno aluno2 = new Aluno("Anabela");
        aluno2.exibirDados();
       

        Aluno aluno3 = new Aluno("Luiza", 10);
        aluno3.exibirDados();

        String nome = "Gaspar";
        int idade = 8;
        String curso = "JAVA";
        Aluno aluno4 = new Aluno(nome, idade, curso);
        aluno4.exibirDados();

    }
}
