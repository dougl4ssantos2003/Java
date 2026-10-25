/*
 * Nesse programa vamos estudar a estrutura de decisão switch case
 */
package aula03b;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula03b {

    public static void main(String[] args) {

        int mes = 2;
        String msg;

        switch (mes) {
            case 1:
                msg = "Janeiro";
                break;
            case 2:
                msg = "Fevereiro";
                break;
            case 3:
                msg = "Março";
                break;
            case 4:
                msg = "Abril";
                break;
            default:
                msg = "Opção Invalida";
        }
        JOptionPane.showMessageDialog(null, msg);

        int diaSemana = 7;
        switch (diaSemana) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                msg = "Dia de Trabalho";
                break;
            case 7:
                msg = "Sabado: Meio Período";
                break;
            case 1:
                msg = "Domingo: Dia de Descanso";
                break;
            default:
                msg = "Opção Inválida";
        }
        JOptionPane.showMessageDialog(null, msg);

        boolean login = true;
        String tipoUsu = "tecnico";
        switch (login) {
            case false:
                msg = "Login Invalido";
                break;
            case true:
                switch (tipoUsu) {
                    case "adm":
                        msg = "Acesso Administrativo";
                        break;
                    case "tecnico":
                        msg = "Acesso Técnico";
                        break;
                    case "usuario":
                        msg = "Acesso Usuário";
                        break;
                    default:
                        msg = "Acesso Inválido";
                }
        }
        JOptionPane.showMessageDialog(null, msg);
    }

}
