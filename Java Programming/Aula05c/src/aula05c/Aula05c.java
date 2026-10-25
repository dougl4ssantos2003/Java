/**
 * Nesse programa vamos estudar os métodos em Java usando métodos com retorno, mas sem parâmetro.
 */
package aula05c;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula05c {

    public static void main(String[] args) {
        
        Aula05c people = new Aula05c();
        people.receberNome();
        int idade = calcularIdade();
        JOptionPane.showMessageDialog(null,"Nome cadastrado com sucesso !");
        JOptionPane.showMessageDialog(null,"O aluno tem "+idade+" anos.");
    }
    
    public String receberNome(){
        
        String nome = JOptionPane.showInputDialog(null,"Digite o nome do aluno:");
        return nome;
        
    }
    
    public static int calcularIdade(){
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        String anoNascimento = JOptionPane.showInputDialog(null, "Digite o ano de Nascimento do Aluno.");
        int idade = anoAtual - Integer.parseInt(anoNascimento);
        return idade;
    }
    
}
