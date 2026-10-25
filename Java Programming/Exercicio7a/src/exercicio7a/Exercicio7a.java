/**
 *
 */
package exercicio7a;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Exercicio7a {

    public static void main(String[] args) {
        
        String msg;

        String nome = JOptionPane.showInputDialog(null,"Digite o nome do Funcionário CLT");
        String salarioStr = JOptionPane.showInputDialog(null,"Digite o sálario do Funcionário CLT");
        
        salarioStr = salarioStr.replace(",", ".");
        double salario = Double.parseDouble(salarioStr);

        FuncionarioCLT clt = new FuncionarioCLT(nome, salario);

        

        msg = "=== FUNCIONARIO CLT ===\n"
                + "Nome: " + clt.getNome() + "\n"
                + "Salario-Base: R$" + String.format("%,.2f", clt.getSalarioBase()) + "\n"
                + "Pagamento: R$" + String.format("%,.2f",clt.calcularPagamento());
        JOptionPane.showMessageDialog(null, msg);
        
        nome = JOptionPane.showInputDialog(null,"Digite o nome do Funcionário PJ");
        salarioStr = JOptionPane.showInputDialog(null,"Digite o sálario do Funcionário PJ");
        
        salarioStr = salarioStr.replace(",", ".");
        salario = Double.parseDouble(salarioStr);
        
        FuncionarioPJ pj = new FuncionarioPJ(nome, salario);
        
        msg = "=== FUNCIONARIO PJ ===\n"
                + "Nome: " + pj.getNome() + "\n"
                + "Salario-Base: R$" + String.format("%,.2f", pj.getSalarioBase()) + "\n"
                + "Pagamento: R$" + String.format("%,.2f",pj.calcularPagamento());
        JOptionPane.showMessageDialog(null, msg);

    }

}
