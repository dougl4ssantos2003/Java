/**
 * Nesse programa vamos estudar os métodos em Java usando métodos com retorno e parâmetro.
 */
package aula05d;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Doglas
 */
public class Aula05d {

    public static void main(String[] args) {
        
        double preco = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preço do produto."));
        double percentual = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o percentual de desconto."));
        Aula05d venda = new Aula05d();
        double precoDesconto = venda.calcularDesconto(preco, percentual);
        JOptionPane.showMessageDialog(null, "Preço com desconto: "+String.format("%,.2f", precoDesconto));
        JOptionPane.showMessageDialog(null, "A comissão do vendedor é "+String.format("%,.2f", calcularComissao(preco)));
        
        
    }
    //Método instância
    public double calcularDesconto(double preco, double percentual){
        
        double desconto = preco * (percentual/100);
        return preco - desconto;
    }
    
    //Método estático
    public static double calcularComissao(double preco){
        double comissao = preco * 0.05;
        return comissao;
    }
    
}
