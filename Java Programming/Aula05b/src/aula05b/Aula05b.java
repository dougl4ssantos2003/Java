/**
 * Nesse programa vamos estudar os métodos em Java usando métodos sem retorno, mas com parâmetro.
 */
package aula05b;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula05b{
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do aluno"));
        
        //Criando objeto 'aluno' do tipo Aula05b 
        Aula05b aluno = new Aula05b();
        aluno.exibirDados(nome, idade);
        mensagem(nome);
        

    }
    
    //Método de Instância 
    public void exibirDados(String nomeAluno, int idadeAluno){
        String msg = "Aluno: "+nomeAluno+"\n"
                + "Idade: "+idadeAluno;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    //Método estático
    public static void mensagem(String nome){
        JOptionPane.showMessageDialog(null,nome+", Seja Bem vindo ao Sistema de Alunos.");
    }
}
