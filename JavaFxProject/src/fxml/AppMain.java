package fxml;


import javafx.application.Application;
import javafx.application.Platform;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.Control;
//import javafx.collections.ObservableList;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox root = new HBox();
		root.setPadding(new Insets(10));
		root.setSpacing(10);
		
		TextField textField = new TextField();
		textField.setPrefWidth(200);
		
		Button button = new Button();
		button.setText("확인");
		button.setOnAction(event -> Platform.exit());
		
//		ObservableList list = hbox.getChildren();
//		list.add(textField);
//		list.add(button);
		
		root.getChildren().add(textField);
		root.getChildren().add(button);
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
