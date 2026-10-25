/**
 * Nesse programa vamos estudar a estrutra de desvio condicional if...else if 
 */
package aula02c;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula02c3 {
    
    public static void main (String args[]){
        
        String idadeStr = JOptionPane.showInputDialog(null,"Digite sua idade");
        int idade = Integer.parseInt(idadeStr);
        String msg = "";
        if(idade < 0){
            msg = "Idade Invalida";
        }else if (idade <=12){
            msg ="Você é uma Criança";
        }else if(idade <=17){
            msg = "Você é um Adolecente";
        }else if(idade<=59){
            msg = "Você é um adulto";
        }else{
            msg = "Você é um idoso";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
