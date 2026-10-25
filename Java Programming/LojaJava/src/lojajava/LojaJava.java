/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package lojajava;

import clientes.AlterarCliente;
import clientes.CadastroCliente;
import clientes.PesquisaCliente;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Aluno
 */
public class LojaJava extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //Criar a barra de menu
        MenuBar barraMenu = new MenuBar();
        
        //Menu Cliente
        Menu menuCliente = new Menu("Clientes");
        
        //Criar a opção Cadastrar
        MenuItem itemCadastrarCliente = new MenuItem("Cadastrar Cliente");
        
        //Definir ação do Menu
        itemCadastrarCliente.setOnAction(event -> {
            CadastroCliente cadastro = new CadastroCliente();
            cadastro.abrir();
        });
        
        //Criar a opção alterar cliente
        MenuItem itemAlterarCliente = new MenuItem("Alterar Cliente");
        itemAlterarCliente.setOnAction(event -> {
            AlterarCliente alterar = new AlterarCliente();
            alterar.abrir();
        });
        
        //Criar a opção pesquisar Cliente
        MenuItem itemPesquisarCliente = new MenuItem("Pesquisar Cliente");
        itemPesquisarCliente.setOnAction(event -> {
            PesquisaCliente pesquisa = new PesquisaCliente();
            pesquisa.abrir();
        });
        
        //Criar a opção excluir Cliente 
        MenuItem itemExcluirCliente = new MenuItem("Excluir Cliente");
        itemExcluirCliente.setOnAction(event -> mostrarMensagem("Cliente", "Opção Excluir selecionada"));
        
        //Adiciona as quatro opções do menu Cliente 
        menuCliente.getItems().addAll(itemCadastrarCliente, itemAlterarCliente, itemPesquisarCliente, itemExcluirCliente);
        
        //outros Menus
        //===============================================
        
        //Adiciona menu a barra Principal
        barraMenu.getMenus().addAll(menuCliente);
        
        //Area central da Janela 
        //texto de boas Vindas
        Label msgInicial = new Label("Bem Vindo ao Sistema Loja Java");
        
        //Definir o tamnho da fonte
        msgInicial.setStyle("-fx-font-size: 22px;");
        
        BorderPane layout = new BorderPane();
        
        //Posiciona a barra de menu no top da janela
        layout.setTop(barraMenu);
        
        //Posiciona a mensagem no centro
        layout.setCenter(msgInicial);
        
        //Cria a cena com o layout de suas dimensões iniciais
        Scene cena = new Scene(layout, 800, 500);
        
        //Define Titulo da Janela
        primaryStage.setTitle("Sistema Loja Java");
        
        //Associa a cena a janela principal
        primaryStage.setScene(cena);
        
        //Exibir a janela na tela
        primaryStage.show();
    }
    
    //Método para exibir mensagem
    private void mostrarMensagem(String titulo, String msg){
        //criar uma caixa de dialogo
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        
        //Definir o titulo da janela
        alerta.setTitle(titulo);
        
        //Define o cabeçalho da mensagem
        alerta.setHeaderText(null);
        
        //define o texto da Janela
        alerta.setContentText(msg);
        
        //exibir a caixa de dialogo
        alerta.showAndWait();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
