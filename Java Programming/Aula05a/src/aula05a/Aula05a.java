/**
 *  Nesse programa vamos estudar os métodos (funções) em Java, comçando com métodos sem retorno e sem parâmetro
 */
package aula05a;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula05a {

    public static void main(String[] args) {
    // Para chamar o método de instância precisamos criar um objeto 
    Aula05a pessoa = new Aula05a();
    pessoa.apresentar();
    
    //Para chamar um método estatico não precisa criar um objeto
    mensagem();
    }
    
    //Método de isntância  pode ser usado fora da classe.
    public  void apresentar(){
        JOptionPane.showMessageDialog(null, "Óla. Essa mensagem pertence a um  método.");
    }
    
    // Método estático (static) somente dentro da classe. 
    public static void mensagem(){
        JOptionPane.showMessageDialog(null, "Bem Vindo ao programa feito em Java.");
    }
    
}
