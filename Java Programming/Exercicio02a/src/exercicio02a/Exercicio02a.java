/**
 * 1. Crie um novo projeto chamado `Exercicio02a.java`.
   2. Declare uma variável `String` chamada `frase` com o valor "A linguagem Java é poderosa.".
   3. Usando os métodos de `String`, faça e imprima o seguinte:
    - Imprima o comprimento da frase.
    - Imprima a frase em letras maiúsculas.
    - Verifique e imprima se a frase contém a palavra "Java".
    - Substitua e imprima a palavra 'poderosa' por 'incrível'
 */
package exercicio02a;

/**
 *
 * @author Aluno: Douglas
 */
public class Exercicio02a {

    public static void main(String[] args) {
        
      String frase = "A linguagem Java e Poderosa.";
      System.out.println("O tamanho da Frase 'A linguagem Java e poderosa.' = "+frase.length());
      System.out.println("A frase em letras Maiusculas fica assim: "+frase.toUpperCase());
      System.out.println("A frase tem a palavra Java: "+frase.contains("Java"));
      System.out.println(frase.replace("Poderosa", "Incrivel"));
    }
    
}
