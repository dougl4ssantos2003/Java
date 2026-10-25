/**
 */
package exercicio6a;

/**
 *
 * @author Aluno:Douglas
 */
public class FuncionarioAdm extends Funcionario{
    
    //Atributos específicos
    String setor, cargo;
    
    //Construtor
    public FuncionarioAdm(String nome, String cpf, double salario, String setor, String cargo){
        super(nome, cpf, salario);
        this.setor = setor;
        this.cargo = cargo;
    }
    
    //Métodos específicos
    public void realizarTarefa(){
        System.out.println("Funcionario esta trabalhando...");
    }
    
    //Métodos herdados
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Setor: "+setor+"\nCargo: "+cargo);
    }
}
