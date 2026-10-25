/*
 * Nesse programa vamos estudar a estrutura de repetição ehile para fazer uma tabuada
 */
package aula03d;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula03d {
    public static void main(String[] args) {
        
        int numero, cont;
        String msg, title;
        
        msg = "";
        title="Sistema Tabuada";
        String numeroStr = JOptionPane.showInputDialog(null,"Digite um numero para a Tabuada",title,1);
        numero = Integer.parseInt(numeroStr);
        cont = 1;
        
        while (cont <=10){
            int total = numero * cont;
            msg += numero+" X "+cont+" = "+total+" \n";
            cont++;
        }
            JOptionPane.showMessageDialog(null, msg, title,1);
        
        
        
    }
    
}
