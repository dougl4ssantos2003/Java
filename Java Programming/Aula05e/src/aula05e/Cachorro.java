/**
 * Nessa classe vamos definir os atributos e métodos da classe cachorro
 */
package aula05e;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Cachorro {
    
    String nome;
    String raca;
    int idade;
    double peso;
    
    //Métodos de instância 
    public void latir(){
        JOptionPane.showMessageDialog(null, this.nome+" está latindo. AU! AU! AU!");
    }
    
    public void comer(){
        JOptionPane.showMessageDialog(null, this.nome+" está comendo.");
    }
    
    public void exibirDados(){
        String msg = "Nome: "+this.nome+".\n"
                + "Raça: "+this.raca+".\n"
                + "Idade: "+this.idade+" anos.\n"
                + "Peso: "+this.peso+" Kg.";
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
