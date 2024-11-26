package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import util.connectionFactory.ConnectionFactory;
import view.LoginView;

public class MainController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		carregarConexao();		
		//switchLoginView();
	}
	
	private void carregarConexao() {
		System.out.println("criando conexão");
		ConnectionFactory.getConnection();
		System.out.println("conexão criada");		
	}
	
	private void switchLoginView() {
		
		try {
			
			LoginView loginView = new LoginView();
			loginView.start(null);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
