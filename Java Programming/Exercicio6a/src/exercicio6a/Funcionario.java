/**
 *  
 */
package exercicio6a;

/**
 *
 * @author Aluno: Douglas
 */
public class Funcionario {
    
    //Atributos Genéricos
    String nome, cpf;
    double salario;
    
    //Construtor
    public Funcionario (String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    //Métodos Genéricos
    public void exibirDados(){
        System.out.println("Nome: "+nome+"\nCPF: "+cpf+"\nSalario: R$"+String.format("%,.2f", salario));
    }
    public void reajustarSalario(double porcentual){
        salario += salario * (porcentual/100);
    }
}
