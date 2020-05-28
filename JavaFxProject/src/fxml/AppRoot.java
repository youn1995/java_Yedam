package fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppRoot extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {				//다른경로에 있으면 상대경로를 넣어줘야함
		//HBox의 상위 클래스인 Parent를 이용해 다른 클래스들도 올수있도록함					//현재클래스 기준으로 리소스를 가져오겠다.
		Parent root = FXMLLoader.load(getClass().getResource("Root.fxml")); // fxmlloader를 이용해서 fxml파일을 가져오기 리소의경우 파일이나 디렉토리
		Scene scene = new Scene(root); // 컨테이너가 매게값으로 들어가야함
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("FXML Sample");

	}

	public static void main(String[] args) {
		launch(args);
	}
}
