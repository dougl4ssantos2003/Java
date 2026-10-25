/**
 * Nessa classe vamos criar os objetos da classe Funcionario, professor e tecnico
 */
package aula06c;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula06c {

    public static void main(String[] args) {
        
        Funcionario func1 = new Funcionario("Gaspar",5000);
        func1.exibirDados();
        System.out.println("=".repeat(50));
        System.out.println("Aumento de 5% no salario");
        func1.aumentarSalario(5);
        func1.exibirDados();
        
        System.out.println("=".repeat(50));
        Professor prof1 = new Professor("Anabela", 4500, "TI", "Manhã");
        prof1.ensinar();
        prof1.exibirDados();
        System.out.println("=".repeat(50));
        System.out.println("Aumento de 15% no salario");
        prof1.aumentarSalario(15);
        prof1.exibirDados();
    }
    
}
