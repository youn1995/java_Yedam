package stages_pack;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StageMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
//		Parent root = FXMLLoader.load(getClass().getResource("Root.fxml"));
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Root.fxml"));
		
		//controller에 stage값을 넘겨주는 처리
		Parent root = loader.load();
//		
		StageController cont = loader.getController();
//		System.out.println(cont.toString());
		cont.setPrimaryStage(primaryStage);
//		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
