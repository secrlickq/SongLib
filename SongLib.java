package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class SongLib extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("LibView.fxml"));
		
		AnchorPane root = (AnchorPane)loader.load();
		
		Controller controller = loader.getController();
		controller.start();
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);;
		primaryStage.setTitle("SongLib App");
		primaryStage.setResizable(false);
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
