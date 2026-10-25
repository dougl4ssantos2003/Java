/**
 * Nessa classe vamos herdar os métodos e atributos da classe mãe.
 */
package aula07a;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aluno extends Pessoa {

    private String curso, periodo;
    private double media;

    //Construtor
    public Aluno(String nome, int idade, String curso, String periodo) {
        super(nome, idade);
        setCurso(curso);
        setPeriodo(periodo);
    }

    //Métodos getters e setters
    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the periodo
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public double getMedia() {
        return this.media;
    }

    //Método especifíco do Aluno
    public void calcularMedia(double n1, double n2, double n3) {
        this.media = (n1 + n2 + n3) / 3;
    }

    //Sobrecarga do Método exibirMensagem
   @Override
    public void exibirMensagem() {
        String msg = "Nome: "+this.getNome()+"\n"
                + "Idade: "+this.getIdade()+"\n"
                +"Curso: " + this.curso + "\n"
                + "Periodo: " + this.periodo + "\n"
                + "Média: " + String.format("%.1f", getMedia());
        JOptionPane.showMessageDialog(null, msg);
    }

}
