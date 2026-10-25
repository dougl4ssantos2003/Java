/**
 * Nessa classe vamos definir os atributos e métodos da classe carro e criar um construtor de objetos
 */
package aula05f;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Carro {
    
    String marca, modelo;
    int ano;
    //Construtor
    public Carro(String marcaC, String modeloC, int anoC){
        this.marca = marcaC;
        this.modelo = modeloC;
        this.ano = anoC;
    }
    public void acelerar(int potencia){
        JOptionPane.showMessageDialog(null, "O carro "+this.modelo+" está acelerando a "+potencia+" km/h");
    }
    public void imprimirDados(){
        String msg = "Marca: "+this.marca+"\n"
                + "Modelo: "+this.modelo+"\n"
                + "Ano de Fabricação: "+this.ano;
        JOptionPane.showMessageDialog(null, msg);
    }
}
