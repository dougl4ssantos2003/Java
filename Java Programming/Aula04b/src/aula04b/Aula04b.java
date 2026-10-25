/**
 * Nesse programa vamos estudar vamos usar a estrutura de repetição do while para verificar a senha do usuario
 */
package aula04b;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno: Douglas
 */
public class Aula04b {

    public static void main(String[] args) {
        
        String senhaCorreta = "1234";
        String senha; 
        int tent = 3;
        
        do{
            senha = JOptionPane.showInputDialog(null,"Digite a senha:","Login",3);
            if(senha.equals(senhaCorreta)){
                JOptionPane.showMessageDialog(null, "Acesso permitido.");
                break;
            }else{
                JOptionPane.showMessageDialog(null, "Senha Invalida.\n"
                        + "Numero de tentivas = "+tent);
            }
            tent--;
        }while (!senhaCorreta.equals(senha) && tent >= 1);
        if(tent <= 1){
            JOptionPane.showMessageDialog(null, "Numero de tentativas excedido!", "Login",0);
        }
        
        
    }
    
}
