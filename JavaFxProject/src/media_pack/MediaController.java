package media_pack;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MediaController implements Initializable {

	@FXML
	MediaView mediaView;
	@FXML
	ImageView imageView;
	@FXML
	Button btnPlay, btnStop, btnPause;
	@FXML
	Label labelTime;
	@FXML
	Slider sliderVolume;
	@FXML
	ProgressBar progressBar;
	@FXML
	ProgressIndicator progressIndicator;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Media media = new Media(getClass().getResource("/medias/video.mp4").toString()); // 미디어의 상대위치를 가져오기위해 getClass를
																							// 사용함
		MediaPlayer player = new MediaPlayer(media);
		mediaView.setMediaPlayer(player);

		player.setOnReady(new Runnable() {
			@Override
			public void run() {
				btnPlay.setDisable(false);
				btnPause.setDisable(true);
				btnStop.setDisable(true);
			}
		});
		player.setOnPlaying(new Runnable() {
			@Override
			public void run() {
				btnPlay.setDisable(true);
				btnPause.setDisable(false);
				btnStop.setDisable(false);
			}
		});
		player.setOnPaused(() -> {
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(false);
		});
		player.setOnStopped(() -> {
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
		});
		player.setOnEndOfMedia(() -> {
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
//			player.stop();
//			player.seek(player.getStartTime());
		});

		btnPlay.setOnAction((event) -> player.play());
		btnStop.setOnAction((event) -> {
			player.stop();
		});
		btnPause.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				player.pause();
			}
		});

	}

}
