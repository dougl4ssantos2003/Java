/**
 * Você foi contratado para criar um programa que verifica o índice de massa corporal de uma pessoa(IMC).
 * Seu programa deve solicitar o peso e a altura do cliente, calcular o IMC e retornar o indice de acordo
 * com a tabela de Classificação:
 * IMC             Classificação
 * menor que 18,5   Magreza
 * Entre 18,5 e 24,9 Normal
 * Entre 25,0 e 29,9 Sobrepeso
 * Entre 30,0 e 34,9 Obesidade Grau I
 * Entre 35,0 e 39,9 Obesidade Grau II
 * Maior que 40,0 Obesidade Grau III
 * Formula do IMC:
 * imc = peso/(altura * altura)
 *
 */
package aula02c;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Exercicio02c {

    public static void main(String args[]) {

        try {
            String nomeStr;
            String pesoStr;
            String alturaStr;
            while (true) {
                nomeStr = JOptionPane.showInputDialog(null, "Digite o nome do Cliente", "IMC", 3);
                pesoStr = JOptionPane.showInputDialog(null, "Digite o peso do Cliente", "IMC", 3);
                alturaStr = JOptionPane.showInputDialog(null, "Digite a altura do Cliente", "IMC", 3);
                if (nomeStr.isBlank() || pesoStr.isBlank() || alturaStr.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "IMC", 3);
                } else {
                    break;
                }
            }
            pesoStr = pesoStr.replace(",", ".");
            alturaStr = alturaStr.replace(",", ".");
            double peso = Double.parseDouble(pesoStr);
            double altura = Double.parseDouble(alturaStr);
            double imc = peso / (altura * altura);
            String indice;

            if (imc < 18.5) {
                indice = "Magreza";
            } else if (imc < 24.9) {
                indice = "Normal";
            } else if (imc < 34.9) {
                indice = "Sobrepeso";
            } else if (imc < 24.9) {
                indice = "Obesidade I";
            } else if (imc < 39.9) {
                indice = "Obesidade II";
            } else {
                indice = "Obesidade III";
            }
            String msg = "Nome: " + nomeStr + "\n"
                    + "Altura: " + String.format("%.2f", altura) + "\n"
                    + "Peso: " + String.format("%.2f", peso) + "\n"
                    + "IMC: " + String.format("%.2f", imc) + "\n"
                    + "Índice: " + indice;
            JOptionPane.showMessageDialog(null, msg, "IMC", 1);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Peso ou Altura invalida", "IMC", 3);
        }
    }

}
