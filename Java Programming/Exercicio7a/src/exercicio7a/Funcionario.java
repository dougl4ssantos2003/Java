/**
 * 
 */
package exercicio7a;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario {
    
    private String nome;
    private double salarioBase;
    
    public Funcionario(String nome, double salarioBase){
        setNome(nome);
        setSalarioBase(salarioBase);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the salarioBase
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public abstract double calcularPagamento();
}
