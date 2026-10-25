/**
 * Nesse programa vamos estudar a estrutura de repticção do...while()
 */
package aula04a;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula04a {

    public static void main(String[] args) {

        int cont = 11;
        
        do{
            System.out.println(cont);
            cont++;
        }while(cont <= 10);
        
        String msg = "Fim do Programa";
        System.out.println("=".repeat(msg.length()));
        System.out.println(msg);
        
    }
    
}
