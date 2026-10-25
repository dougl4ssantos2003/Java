/**
 * Nesse programa vamos instânciar objetos de outras classes
 */
package aula05e;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula05e {

    public static void main(String[] args) {
        
        Cachorro cao1 = new Cachorro();
        cao1.nome = "Bruce";
        cao1.raca = "Labrador";
        cao1.idade = 3;
        cao1.peso = 20;
        cao1.latir();
        cao1.comer();
        cao1.exibirDados();
    }
    
}
