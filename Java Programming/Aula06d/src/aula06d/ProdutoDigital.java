/**
 * Nessa classe vamos herdar os atributos e métodos da classe Produto e implementar os seus próprios atributos e métodos.
 */
package aula06d;

/**
 *
 * @author Aluno: Douglas
 */
public class ProdutoDigital extends Produto{
    
    //Atributos específicos
    String formato;
    double tamanhoArquivo;
    
    //Construtor
    public ProdutoDigital(String codigo, String nome, double preco, String formato, double tamanhoArquivo){
        super(codigo, nome, preco);
        this.formato = formato;
        this.tamanhoArquivo = tamanhoArquivo;
    }
    //Métodos herdados da superclasse
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Formato: "+formato+"\nTamanho do Arquivo: "+tamanhoArquivo);
    }
    
}
