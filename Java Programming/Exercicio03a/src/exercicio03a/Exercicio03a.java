/**
 *
 */
package exercicio03a;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Exercicio03a {

    public static void main(String[] args) {

        String title = "Sistema Loja";

        try {
            String msg, resultDiaP, nomeCli, nomeProd;
            double precoProd, precoParcela;
            int numParcela = 0, m = 8, y = 2026, cont = 1;
            Object[] diaVenciParcela = {"5", "10", "15", "20", "25"};

            while (true) {
                nomeCli = JOptionPane.showInputDialog(null, "Digite o nome do Cliente", title, 3);
                if (!(nomeCli.isBlank())) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Digite um nome valido!", title, 2);
                }
            }
            while (true) {
                nomeProd = JOptionPane.showInputDialog(null, "Digite o nome do produto", title, 3);
                if (!(nomeProd.isBlank())) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Digite um nome de produto valido!", title, 2);
                }
            }
            while (true) {
                try {
                    String precoProdStr = JOptionPane.showInputDialog(null, "Digite o preço do produto", title, 3);
                    precoProdStr = precoProdStr.replace(",", ".");
                    precoProd = Double.parseDouble(precoProdStr);
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Digite um numero no valor!");
                }
            }
            while (true) {
                while (true) {
                    try {
                        numParcela = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de parcelas", title, 3));
                        break;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Digite um numero na parcela!");
                    }
                }
                if (numParcela > 10) {
                    JOptionPane.showMessageDialog(null, "Numero de Parcelas Invalido, Digite no maximo 10!", title, 2);
                } else if (numParcela < 1) {
                    JOptionPane.showMessageDialog(null, "Numero de Parcelas Invalido, Digite no minimo 1!", title, 2);
                } else {
                    break;
                }
            }
            if (numParcela == 1) {
                precoProd = precoProd - (precoProd * 0.10);
            }
            precoParcela = precoProd / numParcela;
            int opt = JOptionPane.showOptionDialog(null, "Qual a data da Parcela", title, JOptionPane.YES_NO_OPTION, 3, null, diaVenciParcela, diaVenciParcela[0]);
            if (opt == 0) {
                resultDiaP = "5";
            } else if (opt == 1) {
                resultDiaP = "10";
            } else if (opt == 2) {
                resultDiaP = "15";
            } else if (opt == 3) {
                resultDiaP = "20";
            } else if (opt == 4) {
                resultDiaP = "25";
            } else {
                resultDiaP = " Não foi escolhida uma data";
            }
            msg = "Cliente: " + nomeCli + "\n"
                    + "Produto: " + nomeProd + "\n"
                    + "Valor: R$" + String.format("%,.2f", precoProd) + "\n"
                    + "Parcelas: " + numParcela + "\n"
                    + "Preço Parcela: " + String.format("%,.2f", precoParcela) + "\n"
                    + "Dia de Vencimento: " + resultDiaP;
            JOptionPane.showMessageDialog(null, msg, title, 1);

            System.out.println("=".repeat(50) + "\n"
                    + "Lojas Fantomas \n"
                    + "=".repeat(50) + "\n"
                    + msg + "\n"
                    + "=".repeat(50));
            while (cont <= numParcela) {
                m++;
                if(m >= 10){
                System.out.println("Parcela " + cont + ": " + resultDiaP + "/" + m + "/" + y + " - R$" + String.format("%,.2f", precoParcela));
                }else{
                    System.out.println("Parcela " + cont + ": " + resultDiaP + "/0" + m + "/" + y + " - R$" + String.format("%,.2f", precoParcela));
                }
                if (m >= 12) {
                    m = 0;
                    y++;
                }
                cont++;
            }
            System.out.println("=".repeat(50) + "\n"
                    + "Sistema de Loja SENAI \n"
                    + "=".repeat(50));
        } catch (java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Encerrou o Programa", title, 2);
        }
    }
}
