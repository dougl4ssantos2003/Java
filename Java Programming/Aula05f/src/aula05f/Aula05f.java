/**
 * Nesse programa vamos instanciar objetos de outras classes usando o  construtor de objetos 
 */
package aula05f;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula05f {

    public static void main(String[] args) {
        
        
        Carro car1 = new Carro("Fiat", "Uno", 2000);
        car1.acelerar(300);
        car1.imprimirDados();
        car1.marca = "GM";
        car1.modelo = "Astra";
        car1.ano = 2008;
        car1.acelerar(20);
        car1.imprimirDados();
        JOptionPane.showMessageDialog(null, "O modelo foi alterado para "+car1.modelo);
    }
    
}
