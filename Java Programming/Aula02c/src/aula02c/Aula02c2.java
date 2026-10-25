/**
 * Nesse Programa vamos estudar a estrutura de desvio condicional IF...Else
 */
package aula02c;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula02c2 {
    
    public static void main(String args[]){
        
        String tit  = "Senai Guraulhos-Dutra";
        String nomeAluno = JOptionPane.showInputDialog(null,"Digite o nome do Aluno",tit,3);
        String notaFinalStr = JOptionPane.showInputDialog(null,"Digite a nota final do Aluno",tit,3);
        notaFinalStr = notaFinalStr.replace(",", ".");
        double notaFinal = Double.parseDouble(notaFinalStr);
        String conceito = "";
        if(notaFinal >= 50){
            conceito = "APROVADO";
        }else {
            conceito = "REPROVADO";
        }
        String msg = "O Aluno "+nomeAluno+" foi "+conceito+".\n"
                + "Com Nota Final: "+notaFinal;
        JOptionPane.showMessageDialog(null, msg,tit,1);
        
    }
    
}
