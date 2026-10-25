/**
 * Nessa classe vamos herdar os atributos e métodos da classe FUncionario e 
 * implementar seus métodos abstratos.
 */
package exercicio7a;

/**
 *
 * @author Aluno
 */
public class FuncionarioPJ extends Funcionario{
    
    private double salarioLiquido;
    
    public FuncionarioPJ(String nome, double salarioBase){
        super(nome, salarioBase);
    }
    
    @Override
    public double calcularPagamento(){
       return  this.salarioLiquido = this.getSalarioBase();
    }
    
}
