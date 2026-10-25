/*
 * Nesse Programa vamos realizar uma revisão de if, else if, else e operador ternário.
 */
package aula03a;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas Barbosa dos Santos
 */
public class Aula03a {

    public static void main(String[] args) {

        int idade = 20;

        String resultado = idade >= 18 ? "Maior de Idade" : "Menor de Idade";
        System.out.println("Aluno: " + resultado);

        boolean ehAluno = false;
        System.out.println((ehAluno) ? "Aluno Ativo" : "Aluno Ausente");

        //Desvio Condicional
        String title = "Senai Guarulhos Dutra";
        String horaStr = JOptionPane.showInputDialog(null, "Digite a hora de entrada no Formato 'HH':", title, 3);
        int hora = Integer.parseInt(horaStr);
        
        String msg;
        if (hora >= 7 && hora <= 12) {
            msg = "Turno: Manhã";
        } else if (hora >= 13 && hora <= 17) {
            msg = "Turno: Tarde";                 
        } else if (hora >= 18 && hora <= 23) {
            msg = "Turno: Noite";
        } else {
            msg = "Hora Inválida";
        }
        JOptionPane.showMessageDialog(null, msg, title,1);
        
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja Continuar", title, JOptionPane.YES_NO_CANCEL_OPTION, 3);
        if (resposta == 0){
            JOptionPane.showMessageDialog(null, "Continuando...");
        }else if(resposta == 1){
            JOptionPane.showMessageDialog(null, "Finalizando...");
        }else if(resposta == 2){
            JOptionPane.showMessageDialog(null, "Cancelando...");
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum Botão selecionado.");
        }
        
        Object[] cursos = {"Java", "Python", "C#", "C++"};
        
        int opt = JOptionPane.showOptionDialog(null, "Qual curso deseja fazer? ", title, JOptionPane.YES_NO_OPTION, 3, null, cursos, cursos[0]);
        if(opt == 0){
            msg = "Java!";
        } else if(opt == 1){
            msg = "Python!";
        } else if(opt == 2){
            msg = "C#!";
        } else if(opt == 3){
            msg = "C++!";
        } else {
            msg = "Invalido";
        }
        JOptionPane.showMessageDialog(null, "O curso escolhido é "+msg);
    }
}
