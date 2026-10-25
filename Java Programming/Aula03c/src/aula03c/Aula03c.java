/**
 * Nesse programa vamos o uso da estrutura de repetição while
 */
package aula03c;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula03c {

    public static void main(String[] args) {
        
        String frase = "E PIQUE";
        int cont = 1;
        
        while (cont <= 5){
            System.out.println(frase);
            cont++;
        }
        cont = 1;
        frase = "E HORA";
        while (cont <= 5){
            System.out.println(frase);
            cont++;
        }
        frase = "RA-TIM-BUM";    
        System.out.println(frase);
        System.out.println("=".repeat(30));
        
    }
    
}
