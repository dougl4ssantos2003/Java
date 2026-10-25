/**
 * Nessa classe vamos especificar os atributos e métodos genéricos dos produtos de um sistema comercial
 * proxímo da realidade.
 */
package aula06d;

/**
 *
 * @author Aluno
 */
public class Produto {
    
    //Atributos
    String codigo;
    String nome;
    double preco;
    
    //Costrutor
    public Produto(String codigo, String nome, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }
    
    //Métodos genéricos
    public void exibirDados(){
        System.out.println("Codigo: "+codigo+"\nNome: "+nome+"\nPreco: "+String.format("%,.2f", preco));
    }
    
    public void aplicarDesconto(double percentual){
        double desconto = preco * percentual /100;
        preco -= desconto;
    }
    
    public void alterarPreco(double novoPreco){
        preco -= novoPreco;
    }
    
    
}
