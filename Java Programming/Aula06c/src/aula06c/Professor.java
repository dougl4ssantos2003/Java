/**
 * Nessa classe vamos herdar os atributos e métodos da classe funcionario e implentar os atributos e métodos específicos da classe professor.
 */
package aula06c;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Professor extends Funcionario{
    
    //Atributos específicos
    String disciplina, periodo;
    
    //Construtor
    public Professor(String nome, double salario, String disciplina, String periodo){
        //Chamar o construtor da super classe (classe mãe)
        super(nome, salario);
        this.disciplina = disciplina;
        this.periodo = periodo;
    }
    
    //Métodos específicos
    public void ensinar(){
        JOptionPane.showMessageDialog(null,"O professor "+nome+" leciona a matéria de "+disciplina);
    }
    
    //Método sobreposto da classe funcionário
   @Override
   public void exibirDados(){
       super.exibirDados();
       System.out.println("Disciplina: "+disciplina+"\nPeriodo: "+periodo);
   }
}
