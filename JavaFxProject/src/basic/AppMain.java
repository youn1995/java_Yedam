package basic;

import javafx.application.Application;
import javafx.application.Platform;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button; // button 은 이걸 import
import javafx.scene.control.Label; //label은 이걸 import해야함
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application {

	public AppMain() { // 첫번째
		System.out.println(Thread.currentThread().getName() + " : AppMain() 실행."); // 쓰레드 정보확인
	}

	@Override
	public void init() throws Exception { // 두번째
		System.out.println(Thread.currentThread().getName() + " : init() 실행.");

	}

	@Override
	public void start(Stage primaryStage) throws Exception { // 3번째
		System.out.println(Thread.currentThread().getName() + " : start() 실행.");
		VBox root = new VBox(); // 제일 외각에 있는걸 root //컨테이너 생성
		root.setPrefWidth(350);
		root.setPrefHeight(150);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);

		Label label = new Label();
		label.setText("Hello JavaFx");
		label.setFont(new Font(50));

		Button button = new Button();
		button.setText("확인");
//		button.setOnAction(new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
//				Platform.exit();
//			}
//		});
		button.setOnAction(event -> Platform.exit()); //람다표현식으로도 가능

		root.getChildren().add(label); // button과 label 컨트롤을 컨테이너에 붙임
		root.getChildren().add(button);

		Scene scene = new Scene(root);// 컨테이너를 신에 붙임
		primaryStage.setScene(scene); // 신을 스테이지에 붙임
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception { // 종료하면 마지막에 실행
		System.out.println(Thread.currentThread().getName() + " : stop() 실행.");
	}

	public static void main(String[] args) { // 메인이 실행되고
		Application.launch(args); // 이걸 호출하면 처리순서에 맞춰 실행됨
	}
}
