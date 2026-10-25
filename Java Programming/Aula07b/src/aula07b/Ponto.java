/**
 * Essa é uma classe imutável. Tem seus atributos constantes, ou seja, depois de definidos os valores não podem ser alterados.
 */
package aula07b;

/**
 *
 * @author Aluno: 
 */
public final class Ponto {
    
    private final int x, y;
    
    //Construtor 
    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    //Métodos getters 
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}
