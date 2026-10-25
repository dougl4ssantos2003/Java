/**
 * Nesse Programs vamos estudar o uso do IF
 */
package aula02c;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno:Douglas
 */
public class Aula02c {

    public static void main(String[] args) {
        String tit = "Lojas Peruanas";
        String nomeCliente = JOptionPane.showInputDialog(null,"Digite o nome do cliente: ",tit,3);
        int clientVip = JOptionPane.showConfirmDialog(null, "Esse Cliente é VIP ?",tit,JOptionPane.YES_NO_OPTION,3);
        String valorStr = JOptionPane.showInputDialog(null,"Digite o valor a Pagar: ", tit, 3);
        valorStr = valorStr.replace(".", "");
        valorStr = valorStr.replace(",", ".");
        double valor = Double.parseDouble(valorStr);
        if(clientVip == JOptionPane.YES_OPTION){
            valor =  valor - (valor * 10/100);
        }
        JOptionPane.showMessageDialog(null,"Valor a Pagar: "+String.format("%,.2f", valor));
        
        
        
    }
    
}
