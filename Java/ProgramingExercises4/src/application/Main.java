package application;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	AnchorPane root;
	
	@Override
	public void start(Stage primaryStage) {
		initView(primaryStage);
		
	}
	
	public void initView(Stage primaryStage){
		FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("View.fxml"));
		try {
			root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 250, 250);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
