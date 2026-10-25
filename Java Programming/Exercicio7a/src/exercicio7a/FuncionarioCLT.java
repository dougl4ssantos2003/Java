/**
 * Nessa classe vamos herdar os atributos e métodos da classe FUncionario e 
 * implementar seus métodos abstratos.
 */
package exercicio7a;

/**
 *
 * @author Aluno
 */
public class FuncionarioCLT extends Funcionario{
    
    public FuncionarioCLT(String nome, double salarioBase){
        super(nome, salarioBase);
    }
    
    @Override
    public double calcularPagamento(){
        
        double desconto = getSalarioBase() * 0.10;
        return  getSalarioBase() - desconto;
    }
    
}
