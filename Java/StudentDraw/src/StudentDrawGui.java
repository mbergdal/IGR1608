
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StudentDrawGui extends Application {

	@Override
	public void start(Stage primaryStage) {
		Button btn = new Button("OK");
		Scene scene = new Scene(btn, 200, 250);
		primaryStage.setTitle("Student Draw");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
