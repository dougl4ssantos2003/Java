/**
 * Nesse programa vamos instanciar objetos de outras classes e definir seus atributos atraves dos métodos Setters (Encapsulamento)
 */
package aula05g;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula05g {

    public static void main(String[] args) {
        
        Pessoa people1 = new Pessoa();
        people1.setNome(JOptionPane.showInputDialog(null,"Digite o seu nome:"));
        people1.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a sua idade:")));
        people1.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o seu Salário:")));
        people1.exibirDados();
        people1.setNome("Gaspar");
        people1.setIdade(3);
        people1.setSalario(3854.25);
        String msg = "Nome: "+people1.getNome()+"\n"
                + "Idade: "+people1.getIdade()+"\n"
                + "Salario: "+String.format("%,.2f", people1.getSalario());
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
