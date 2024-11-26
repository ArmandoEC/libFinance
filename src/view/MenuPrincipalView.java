package view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MenuPrincipalView extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			
			primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MenuPrincipal.fxml"));
			Parent parent = loader.load();
			Scene mainScene = new Scene(parent);
			mainScene.getStylesheets().add(getClass().getResource("/gui/menuPrincipal.css").toExternalForm());
			primaryStage.setScene(mainScene);
			primaryStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
