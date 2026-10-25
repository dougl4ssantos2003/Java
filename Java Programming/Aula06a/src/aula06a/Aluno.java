/**
 * Nessa classe vamos implementar a sobre-carga de construtores conhecida como constructor overloading
 */
package aula06a;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aluno {
    
    //Atributos
    String nome, curso;
    int idade;
    
    // Construtor 1:sem parametros
    public Aluno(){
        this.nome = "Não Informado";
        this.idade = 0;
        this.curso = "Não Informado";
    }
    
    // Construtor 2: recebe 1 parêmetro - nome
    public Aluno(String nome){
        this.nome = nome;
        this.idade = 0;
        this.curso = "Não Informado";
    }
    
    //Construtor 3  recebe 2 parâmetros - nome e idade
    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        this.curso = "Não Informado";
    }
    
    //Construtor 4  recebe 3 parâmetros - nome, idade e curso
    public Aluno(String nome, int idade, String curso){
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }
    
    public void exibirDados(){
        String msg = "Nome: "+this.nome+"\n"
                + "Idade: "+this.idade+"\n"
                + "Curso: "+this.curso+".";
        JOptionPane.showMessageDialog(null, msg, "Cadastro de alunos", 1);
    }
}
