package clientes;

// Classes JDBC utilizadas para acessar o banco
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lojajava.Conexao;

public class PesquisaCliente {

    // Campo para digitar o nome ou parte do nome do cliente
    private TextField txtNome;

    // Tabela que representa os clientes encontados
    private TableView<Cliente> tabelaClientes;

    // Lista obswervável que fornece os dados da tabel
    private ObservableList<Cliente> listaClientes;

    public void abrir() {

        Stage janela = new Stage();

        janela.setTitle("Pesquisa de Clientes");

        txtNome = new TextField();
        txtNome.setPromptText("Digite o nome do cliente");
        txtNome.setPrefWidth(300);

        Button btnPesquisar = new Button("Pesquisar");
        Button btnListarTodos = new Button("Listar Todos");
        Button btnFechar = new Button("Fechar");

        //Criar a tabela que exibira os resultados
        tabelaClientes = new TableView<>();

        //Criar as colunas da tabela
        TableColumn<Cliente, Integer> colunaId = new TableColumn<>("ID");
        TableColumn<Cliente, String> colunaNome = new TableColumn<>("Nome");
        TableColumn<Cliente, String> colunaEmail = new TableColumn<>("Email");
        TableColumn<Cliente, String> colunaCidade = new TableColumn<>("Cidade");
        TableColumn<Cliente, String> colunaEstado = new TableColumn<>("Estado");

        //Definir a propriedade do objeto que alimentará a coluna
        colunaId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colunaEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colunaCidade.setCellValueFactory(new PropertyValueFactory<>("cidade"));
        colunaEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));

        //Definir a largura da coluna
        colunaId.setPrefWidth(60);
        colunaNome.setPrefWidth(200);
        colunaEmail.setPrefWidth(200);
        colunaCidade.setPrefWidth(140);
        colunaEstado.setPrefWidth(50);

        //Adicionar as colunas as tabelas 
        tabelaClientes.getColumns().addAll(colunaId, colunaNome, colunaEmail, colunaCidade, colunaEstado);

        //Criar Lista observavel que armazena os clientes
        listaClientes = FXCollections.observableArrayList();

        //Associar a lista a tabela
        tabelaClientes.setItems(listaClientes);

        //Definir ações dos botões 
        btnPesquisar.setOnAction(event -> pesquisar());
        btnListarTodos.setOnAction(event -> carregarClientes(null));
        btnFechar.setOnAction(event -> janela.close());

        //Permite pesquisar pressionando enter no campo nome
        txtNome.setOnAction(event -> pesquisar());

        HBox linhaPesquisa = new HBox(10, new Label("nome"), txtNome, btnPesquisar, btnListarTodos, btnFechar);

        //Alinha COmponentes verticalmente ao centro
        linhaPesquisa.setAlignment(Pos.CENTER_LEFT);

        VBox layout = new VBox(15, linhaPesquisa, tabelaClientes);
        layout.setPadding(new Insets(15));

        //Permitir que a tabela ocupe o espaço vertical disponivel
        VBox.setVgrow(tabelaClientes, Priority.ALWAYS);

        Scene cena = new Scene(layout, 750, 450);

        janela.setScene(cena);
        janela.show();

        //Ao abrir o formulario, carrega todos os clientes 
        carregarClientes(null);

    }

    private void carregarClientes(String nome) {

        String sql;
        if (nome == null) {
            sql = "SELECT * FROM clientes ORDER BY nome_cliente";
        } else {
            sql = "SELECT * FROM clientes WHERE nome_cliente LIKE ? ORDER BY nome_cliente";
        }

        //Limpa os resultados anteriores
        listaClientes.clear();

        try (Connection conexao = Conexao.conectar(); PreparedStatement comando = conexao.prepareStatement(sql)) {
            if (nome != null) {
                comando.setString(1, "%" +nome+ "%");
            }

            //Executa o select e recebe os registros encontrados 
            try (ResultSet resultado = comando.executeQuery()) {

                //Percorre os registros retornados pelo MySQL
                while (resultado.next()) {
                    int id = resultado.getInt("id_cliente");
                    String nomeCliente = resultado.getString("nome_cliente");
                    String email = resultado.getString("email_cliente");
                    String cidade = resultado.getString("cidade_cliente");
                    String estado = resultado.getString("estado_cliente");

                    Cliente cliente = new Cliente(id, nomeCliente, email, cidade, estado);

                    //Adiciona o cliente a lista observavel
                    listaClientes.add(cliente);

                }
            }

            if (listaClientes.isEmpty()) {
                mostrarAlerta(Alert.AlertType.INFORMATION, "Pesquisa", "Nenhum cliente encontrado");
            }

        } catch (SQLException e) {
            mostrarAlerta(Alert.AlertType.ERROR, "Erro no banco de dados", e.getMessage());
        }
    }

    private void pesquisar() {

        String nome = txtNome.getText().trim();
        if (nome.isEmpty()) {
            carregarClientes(null);
        } else {
            carregarClientes(nome);
        }

    }

    private void mostrarAlerta(Alert.AlertType tipo,
            String titulo, String mensagem) {

        // Criar a caixa de diálogo
        Alert alerta = new Alert(tipo);

        // Titulo da janela
        alerta.setTitle(titulo);

        // Remover o cabeçalho padrão da caixa de diálogo
        alerta.setHeaderText(null);

        // Definir o conteúdo da mensagem
        alerta.setContentText(mensagem);

        // Exibir a caixa de diálogo com a mensagem
        alerta.showAndWait();
    }
}
