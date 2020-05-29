package fxml;

import javafx.application.Application;
//import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.Control;
//import javafx.collections.ObservableList;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox root = new HBox();
		root.setPadding(new Insets(10));
		root.setSpacing(10);
		root.setPrefSize(700, 300);

		TextField textField = new TextField();
		textField.setPrefWidth(200);
		textField.setPrefHeight(100);

		Button button1 = new Button();
		button1.setText("확인");
		button1.setPrefSize(100, 100);
		button1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				textField.setText("확인을 눌렀음");

			}
		});

		Button button2 = new Button();
		button2.setText("취소");
		button2.setPrefSize(100, 100);
		button2.setOnAction(event -> textField.setText(null));
//		ObservableList list = hbox.getChildren();
//		list.add(textField);
//		list.add(button);

		root.getChildren().add(textField);
		root.getChildren().add(button1);
		root.getChildren().add(button2);

		Scene scene = new Scene(root);

		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			@Override
			public void handle(WindowEvent event) {
				System.out.println("종료 클릭");
				System.out.println(event);
			}
		});
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
