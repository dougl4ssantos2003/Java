/**
 * Nessa classe vamos criar
 */
package aula06b;

/**
 *
 * @author Aluno
 */
public class Calculadora {

    //Método para somar dois números
    public int somar(int a, int b) {
        int soma = a + b;
        return soma;
    }

    //Método para somar três números
    public int somar(int a, int b, int c) {
        int soma = a + b + c;
        return soma;
    }
    
    //Método com sobrecarga para dois números decimais
    public double somar(double a, double b) {
        double soma = a + b;
        return soma;
    }
    
    
    
}
