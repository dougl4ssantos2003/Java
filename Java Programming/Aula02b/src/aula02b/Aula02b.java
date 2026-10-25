/**
 * Nesse progama vamos estudar o uso do tipo de classe String.
 */
package aula02b;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula02b {

    public static void main(String[] args) {
        
        String nome = "Gaspar";
        String sobrenome ="Galego";
        String nomeCompleto = nome+" "+sobrenome;
        System.out.println(nomeCompleto);
        
        //numero de carcteres das Strings (inclusive espaços em branco)
        int tamanho = nomeCompleto.length();
        System.out.println("O nome completo tem "+tamanho+" Caracteres.");
        //Exibir em letras maiusculas
        System.out.println("Maiusculo: "+nomeCompleto.toUpperCase());
        //Exibir em Letras miusculas
        System.out.println("Minusculas: "+nomeCompleto.toLowerCase());
        //Vereficar se existe um conteudo na variavel
        System.out.println("Existe 'Gaspar' na variavel: "+nomeCompleto.contains("Gaspar"));
        System.out.println("Existe 'Jorge' na variavel: "+nomeCompleto.contains("Jorge"));
        //Verificar inicio da variavel 
        System.out.println("Variavel comeca com 'Gasp':" +nomeCompleto.startsWith("Gasp"));
        //Verificar termino da variavel
        System.out.println("Variavel termina com 'lego':" +nomeCompleto.endsWith("lego"));
        //Comparar duas Strings 
        String nome2 = "Gaspar Galego";
        System.out.println("As vairaveis nomeCompleto e nome são iguais: "+nomeCompleto.equals(nome2));
        nome2 = nome2.toUpperCase();
        System.out.println("As vairaveis nomeCompleto e nome são iguais independente da caixa alta ou baixa: "+nomeCompleto.equalsIgnoreCase(nome2)); 
        nomeCompleto ="     "+nomeCompleto+"     ";
        System.out.println("Nome Completo com espacaos em branco: "+nomeCompleto);
        //Retira os espaços em bracos do inicio e final do texto 
        nomeCompleto = nomeCompleto.trim();
        System.out.println("Nome Completo sem espacos: "+nomeCompleto);
        //Substituir parte do texto
        nomeCompleto = nomeCompleto.replace("G", "R");
        System.out.println("Nome Completo com letras alteradas: "+nomeCompleto);
        //Extrair parte do texto
        String parteNome = nomeCompleto.substring(0,6);
        System.out.println("Parte do texto: "+parteNome);
        String vazia ="";
        String emBranco = "     ";
        //Verificar se a string está vazia
        System.out.println("Variavel vazia: "+vazia.isEmpty());
        //Verificar se a string está em branco
        System.out.println("Variavel em Branca: "+emBranco.isBlank());
        String nomeCompleto2 = nomeCompleto;
        System.out.println("Nome Completo: "+nomeCompleto);
        System.out.println("Nome Completo 2: "+nomeCompleto2);
        nomeCompleto = "Gaspar Galego";
        System.out.println("Nome Completo: "+nomeCompleto);
        System.out.println("Nome Completo 2: "+nomeCompleto2);
    }
    
}
