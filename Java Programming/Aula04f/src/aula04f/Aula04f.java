/**Nesse programa vamos estudar o uso do For each com array
 */
package aula04f;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula04f {
    public static void main(String[] args) {

           int [] numeros = {10,20,30,40,50};
           
           //ForEach
           
           for (int numero : numeros){
               System.out.println(numero);
           }
           
           String alunos[] = {"Gaspar","Anabela","Jorge","Luiza"};
           
           for (String aluno:alunos){
               System.out.println(aluno);
           }
    }
    
}
