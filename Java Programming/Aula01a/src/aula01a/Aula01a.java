/**
 * Nesse Programa vamos estudar as variaveis do tipo primitivo
 */
package aula01a;

/**
 *
 * @author Aluno: Douglas 
 */
public class Aula01a {


    public static void main(String[] args) {
        
        System.out.println("Douglas Barbosa dos Santos\n"
                + "=".repeat(30)+"\n"
                        + "--- Tipos Primitivos ---");
        //Tipo Byte
        byte idadeAluno;
        byte temperaturaAtual;
        idadeAluno = 22;
        temperaturaAtual = -5;
        System.out.println("Idade do Aluno: "+idadeAluno+"\n"
                + "Temperatura Atual Graus: "+temperaturaAtual);
        //Tipo short -32768 à 32767
        short populacaoGuara = 18606;
        short anoInicial = 2026;
        System.out.println("Populacao de Guara: "+populacaoGuara+"\n"
                + "Ano Inicial: "+anoInicial);
        //Tipo Int -2 Bilhões à 2  Bilhões 
        int impostoSp = 1200000000;
        int premioMegaSena = 89456000;
        System.out.println("Imposto Roubado em SP: "+String.format("%,d", impostoSp)+"\n"
                + "Premio Mega Sena Papo de Mudar de Vida: "+String.format("%,d", premioMegaSena));
        //Tipo long 9 Quintilhôes
        long impostoBrasil = 2_886_000_000_000L;
        long populacaoMundial =7_800_000_000L;
        System.out.println("imposto Roubado no Brasil: "+String.format("%,d", impostoBrasil)+"\n"
        + "World Population: "+String.format("%,d",populacaoMundial));
        
        //Tipo float: Numero Decimais com 7 casas Decimais
        float altura = 1.73F;
        float microValor =0.12345678F;
        System.out.println("Altura: "+altura+"\n"
                + "Micro Valor: "+microValor);
        //Tipo double: Numero Decimais com 15 casas Decimais
        double pi = 3.14159226535978463;
        double indice = 12345.456789012345678;
        double premio = 55_000_000.00;
        /*System.out.println("PI: "+pi+"\n"
                + "Indice: "+indice+"\n"
                + "Premio: "+String.format("%,f",premio)+" ou "+premio);*/
        System.out.printf("PI: %.10f%n",pi);
        System.out.printf("Indice: %,.15f%n",indice);
        System.out.printf("Premio: %,.2f%n",premio);
        
        
    }
    
}
