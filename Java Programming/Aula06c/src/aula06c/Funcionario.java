/**
 * Nessa classe vamos declarar os atributos e métodos que pode ser herdados pelas classes filhas (subclasses)
 */
package aula06c;

/**
 *
 * @author Aluno: Douglas
 */
public class Funcionario {
    
    //Atributos da classe pai
    String nome;
    double salario;
    
    //Construtor
    public Funcionario (String nome, double salario){
        this.nome =  nome;
        this.salario = salario;
    }
    
    //Métodos
    public void aumentarSalario(double percentual){
        double reajuste = salario * percentual / 100;
        this.salario += reajuste;
    }
    
    public void exibirDados(){
        System.out.println("Nome: "+nome+"\nSalario: R$"+String.format("%,.2f", salario));
    }
    
}
