/**
 * Nessa classe vamos crias os objetos do Produto, ProdutoFisico e ProdutoDigital
 */
package aula06d;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula06d {

    public static void main(String[] args) {

        String codigo ="101";
        String nome = "Notebook Lenovo";
        double preco = 3500.00;
        double peso = 2.5;
        double frete = 45.00;
        
        //Declarar objeto ProdutoFisico
        ProdutoFisico pf1 = new ProdutoFisico(codigo, nome, preco, peso, frete);
        
        pf1.exibirDados();
        System.out.println("-".repeat(50));
        System.out.println("Ganhou frete gratis");
        pf1.descontarFrete(100);
        pf1.exibirDados();
        System.out.println("-".repeat(50));
        
        codigo ="202";
        nome = "Curso Java";
        preco = 199.99;
        double tamanhoArquivo = 2.5;
        String formato = "MP4";
        
        //Declarar objeto ProdutoDigital
        ProdutoDigital pd1 = new ProdutoDigital(codigo, nome, preco, formato, tamanhoArquivo);
        pd1.exibirDados();
        
        
    }
    
}
