/**
 * Nesse programa vamos estudar a estrutura de reptição for
 */
package aula04d;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula04d {

    public static void main(String[] args) {

        int i = 0;
        
        for (i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println("=".repeat(30));
        
        for (i =2 ; i <= 10; i+=2){
            System.out.println(i);
        }
        System.out.println("=".repeat(30));
        
        for (i = 10; i > 0; i--){
            System.out.print(i+"...");
        }
        System.out.println("FOGO !!!");
        System.out.println("=".repeat(30));
        
        int numero =1;
        for(i = 1; i <= 10; i++){
            int total = i * numero;
            System.out.println(i+" X "+numero+" = "+total);
        }
    }
    
}
