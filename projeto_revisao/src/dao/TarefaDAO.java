package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import model.Tarefa;
import model.Tarefa.Status;

public class TarefaDAO {

	private String url = "jdbc:mysql://localhost:3306/projeto_revisao";
	private String usuario = "root";
	private String senha = "aluno";
	private Connection connection;
	
	public void adicionaTarefa(Tarefa tarefa) {
		
		try (Connection connection = DriverManager.
				getConnection(url, usuario, senha)){
			
			String sql = "INSERT INTO tarefa "
					+ "(id_tarefa, titulo, descricao, status) "
					+ "VALUES (?,?,?,?);";
			
			PreparedStatement preparedStatement = 
					connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, tarefa.getId_Tarefa());
			preparedStatement.setString(2, tarefa.getTitulo());
			preparedStatement.setString(3, tarefa.getDescricao());
			preparedStatement.setString(4, tarefa.getStatus().name());
			
			preparedStatement.execute();
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Tarefa> listaTarefa(){
		List<Tarefa> listaDeTarefa = new ArrayList<>();

    	// Tenta estabelecer uma conexão com o banco de dados usando as informações fornecidas.
    	try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
    	    
    	    // Define uma string SQL que representa uma consulta de seleção (SELECT) que obtém todos os registros da tabela 'pais'.
    	    String sql = "SELECT * FROM tarefa";
    	    
    	    // Cria um objeto 'PreparedStatement' a partir da conexão estabelecida, que é mais eficiente para consultas parametrizadas.
    	    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    	    
    	    // Executa a consulta SQL e obtém um conjunto de resultados (ResultSet).
    	    ResultSet resultSet = preparedStatement.executeQuery();
    	    
    	    // Itera sobre o conjunto de resultados para processar cada registro retornado.
    	    while (resultSet.next()) {
    	        // Obtém os valores das colunas 'nome' e 'capital' do registro atual no conjunto de resultados.
    	    	int id_tarefa = resultSet.getInt("id_tarefa");
    	    	String titulo = resultSet.getString("titulo");
    	        String descricao = resultSet.getString("descricao");
    	        Status status = Status.valueOf(resultSet.getString("status"));
    	        
    	        Tarefa tarefa = new Tarefa(id_tarefa, titulo, descricao, status);
    	        
    	        listaDeTarefa.add(tarefa);

    	    }
    	} catch (SQLException e) {
    	    // Captura exceções do tipo SQLException que podem ocorrer durante a execução do código no bloco 'try'.

    	    // Se ocorrer uma exceção SQL, imprime informações detalhadas sobre a exceção, incluindo a mensagem de erro e a pilha de chamadas.
    	    e.printStackTrace();
    	}

    	// Retorna a lista de países preenchida com os dados obtidos do banco de dados.
    	return listaDeTarefa;
	}
	
}
