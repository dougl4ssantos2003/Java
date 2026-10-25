/**
 * Nessa classe vamos herdar os atributos e métodos da classe Produto e implementar os seus próprios atributos e métodos.
 */
package aula06d;

/**
 *
 * @author Aluno: Douglas
 */
public class ProdutoFisico extends Produto {
    
    double peso, frete;
    
    //Construtor
    public ProdutoFisico (String codigo, String nome, double preco, double peso, double frete){
        super(codigo, nome, preco);
        this.peso = peso;
        this.frete = frete;
    }
    
    //Métodos específicos
    public void descontarFrete(double percentual){
        double desconto = frete * percentual / 100;
        frete -= desconto;
    }
    
    //métodos herdados
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Peso: "+String.format("%,.2f", peso)+"\nFrete: "+String.format("%,.2f", frete));
    }
    
}
