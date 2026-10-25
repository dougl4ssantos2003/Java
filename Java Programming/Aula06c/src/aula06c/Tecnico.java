/**
 * Nessa classe vamos herdar os atributos e métodos da classe funcionario e implentar os atributos e métodos específicos da classe tecnico.
 */
package aula06c;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Tecnico extends Funcionario{
    
    //Atributos específicos
    String setor, cargo;
    
    //Construtor
    public Tecnico(String nome, double salario, String setor, String cargo){
        super(nome,salario);
        this.setor = setor;
        this.cargo = cargo;
    }
    
    //Métodos especificos da classe tecnico
    public void realizarManutencao(){
        JOptionPane.showMessageDialog(null,"O tecnico "+nome+" trabalha no setor "+setor);
    }        
    
    //Método herdado da classe Funcionario
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Setor: "+setor+"\nCargo: "+cargo);
    }
}
