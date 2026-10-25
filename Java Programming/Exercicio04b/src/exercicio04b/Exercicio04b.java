/**
 * Crie um Array de numeros inteiros com 5 elementos. Usando o for e a biblioteca Random, atribua um número
 * aleatorio entre 1 e 100 a cada item da array.Imprima todos elementos da array.
 */
package exercicio04b;

import java.util.Random;

/**
 *
 * @author Aluno: Douglas
 */
public class Exercicio04b {

    public static void main(String[] args) {
        
        int numeros[] = new int[5];
        
        Random rd = new Random();
        
        for( int i = 0; i <numeros.length; i++){
            numeros[i] = rd.nextInt(100)+1;
            System.out.print(numeros[i]+" ");
        }
        
    }
    
}
