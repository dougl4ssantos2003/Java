/**
 * Nessa classe vamos implementar os métodos com sobrecarga da classe calculadora
 */
package aula06b;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula06b {

    public static void main(String[] args) {

        Calculadora calc1 = new Calculadora();

        //Char somar (int, int)
        int result1 = calc1.somar(13, 29);

        //Char somar (int, int, int)
        int result2 = calc1.somar(13, 30, 45);

        //Char somar (double, double, double)
        double result3 = calc1.somar(10.5, 20);

        JOptionPane.showMessageDialog(null, "Resultado 1: " + result1);
        JOptionPane.showMessageDialog(null, "Resultado 2: " + result2);
        JOptionPane.showMessageDialog(null, "Resultado 3: " + result3);
        
        int total = 0;
        while (true) {
            String numeroStr = JOptionPane.showInputDialog(null, "Digite um numero inteiro ou = para encerrar");
            if(numeroStr.equals("=")){
                break;
            }else{
                int numero = Integer.parseInt(numeroStr);
                total = calc1.somar(total, numero);
            }
        }
        JOptionPane.showMessageDialog(null, "Total: "+total);
    }

}
