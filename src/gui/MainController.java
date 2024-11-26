package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javax.persistence.EntityManager;
import javafx.fxml.Initializable;
import util.connectionFactory.ConnectionFactory;

public class MainController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		carregarConexao();		
	}
	
	private void carregarConexao() {
		System.out.println("criando conexão");
		EntityManager manager = ConnectionFactory.getConnection();
		System.out.println("conexão criada");
	}
	
}
