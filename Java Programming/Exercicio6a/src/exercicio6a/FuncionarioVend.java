/**
 * 
 */
package exercicio6a;

/**
 *
 * @author Aluno:Douglas
 */
public class FuncionarioVend extends Funcionario{
    
    //Atributos específicos
    double totalVend, percentualComissao;
    
    //Construtor
    public FuncionarioVend(String nome, String cpf, double salario, double totalVend, double percentualComissao){
        super(nome, cpf, salario);
        this.totalVend = totalVend;
        this.percentualComissao = percentualComissao;
    }
    
    //Métodos específicos
    public void realizarVenda(double valor){
        totalVend += valor;
    }
    public void exibirComissao(){
        double comissao = totalVend * (percentualComissao / 100);
        System.out.println("Valor da Comissao: R$"+String.format("%,.2f", comissao));
    }
    
    //Métodos herdados
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Total Vendas: R$"+String.format("%,.2f", totalVend)+"\nComissao: "+percentualComissao+"%");
        
    }
}
