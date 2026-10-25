/**
 * Nesse vamos estudar os tipos de "Cast" para a conversão de tipos primitivos 
 */
package aula02a;

/**
 *
 * @author Aluno: Douglas 
 */
public class Aula02a {

    public static void main(String[] args) {

        byte n1 = 100;
        short n2 = n1;
        System.out.println("Byte: "+n1+"\n"
                + "Short: "+n2+"\n"
                + "-".repeat(50));
        short n3 = 100;
        byte n4 = (byte)n3;
        System.out.println("Short: "+n3+"\n"
                + "Byte: "+n4+"\n"
                + "-".repeat(50));
        int n5 = 30000;
        short n6 = (short)n5;
        System.out.println("Int: "+n5+"\n"
                + "Short: "+n6+"\n"
                + "-".repeat(50));
        long n7 = 2000000000L;
        int n8 = (int)n7;
         System.out.println("Long: "+n7+"\n"
                + "Int: "+n8+"\n"
                + "-".repeat(50));
         float n9 = 123.45f;
         double n10 = n9;
         System.out.println("Float: "+n9+"\n"
                + "Double: "+n10+"\n"
                + "-".repeat(50));
         double n11 = 0.123456789;
         float n12 = (float)n11;
         System.out.println("Double: "+n11+"\n"
                + "Float: "+n12+"\n"
                + "-".repeat(50));
         double n13 = 10.99;
         int n14 = (int)n13;
         System.out.println("Double: "+n13+"\n"
                + "Int: "+n14+"\n"
                + "-".repeat(50));
         int n15 = 123;
         double n16 = n15;
         System.out.println("Double: "+n16+"\n"
                + "Int: "+n15+"\n"
                + "-".repeat(50));
    }
    
}
