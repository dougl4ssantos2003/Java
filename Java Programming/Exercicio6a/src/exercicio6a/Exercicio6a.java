/**
 * 
 */
package exercicio6a;

/**
 *
 * @author Aluno: Douglas
 */
public class Exercicio6a {

    public static void main(String[] args) {
        
        //Atributos Funcionario Administração
        String nome = "Ana Souza";
        String cpf = "111.111.111-11";
        double salario = 3000.00;
        String setor = "Recursos Humanos";
        String cargo = "Auxiliar Administrativo";
        
        //Objeto FuncionarioAdm
        FuncionarioAdm funcAdm = new FuncionarioAdm(nome, cpf, salario, setor, cargo);
        System.out.println("======== Funcionario de Administrativo ========");
        funcAdm.exibirDados();
        funcAdm.realizarTarefa();
        funcAdm.reajustarSalario(13);
        System.out.println("-".repeat(50));
        funcAdm.exibirDados();
        System.out.println("=".repeat(50));
        
        //Atributos Funcionario Vendas
        nome = "Carlos Santos";
        cpf = "222.222.222-22";
        salario = 2500.00;
        double totalVend = 0;
        double percentualComissao = 10;
        
        //Objeto FuncionarioVend
        FuncionarioVend funcVend = new FuncionarioVend(nome, cpf, salario, totalVend, percentualComissao);
        System.out.println("======== Funcionario de Vendas ========");
        funcVend.exibirDados();
        funcVend.realizarVenda(500.00);
        funcVend.realizarVenda(750.00);
        funcVend.realizarVenda(300.00);
        System.out.println("-".repeat(50));
        funcVend.exibirDados();
        funcVend.exibirComissao();
        
    }
    
}
