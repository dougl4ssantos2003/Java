/**
 * Nesse programa vamos estudar o operador ternário
 */
package aula02c;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula02c4 {
    
    public static void main(String args[]){
        
        boolean ehAluno = false;
        System.out.println((ehAluno ?"E aluno":"Nao e Aluno"));
        
       String nome = "Gaspar Galego Neve";
       System.out.println((nome.contains("Neve") ? "Contem o nome":"Nao contem o nome"));
       int idade = 18;
       String msg = idade >= 18? "Maior de Idade" : "Menor de idade";
       System.out.println(msg);
       
    }
    
}
