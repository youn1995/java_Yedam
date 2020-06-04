package view_pack2;

import javafx.beans.property.SimpleStringProperty;

public class Board {
	private SimpleStringProperty title;
	private SimpleStringProperty password;
	private SimpleStringProperty publicity;
	private SimpleStringProperty exitDate;
	private SimpleStringProperty content;
	
	public Board(String title, String password, String publicity,
			String exitDate, String content) {
		this.title = new SimpleStringProperty(title);
		this.password = new SimpleStringProperty(password);
		this.publicity = new SimpleStringProperty(publicity);
		this.exitDate = new SimpleStringProperty(exitDate);
		this.content = new SimpleStringProperty(content);
	}
	
	public String getTitle() {
		return this.title.get(); //타이틀 속성에 대해 문자열을 가져옴
	}
	public String getPassword() {
		return this.password.get();
	}
	public String getPublicity() {
		return this.publicity.get();
	}
	public String getExitDate() {
		return this.exitDate.get();
	}
	public String getContent() {
		return this.content.get();
	}
	public SimpleStringProperty titleProperty() { // 타이틀 속성을 리턴
		return this.title;
	} 
	public SimpleStringProperty passwordProperty() {
		return this.password;
	}
	public SimpleStringProperty publicityProperty() {
		return this.publicity;
	}
	public SimpleStringProperty exitDateProperty() {
		return this.exitDate;
	}
	public SimpleStringProperty contentProperty() {
		return this.content;
	}
	public void setTitle(String title) { // 문자열을 가져와 타이틀 속성에 해당 문자열을 넣음
		this.title.set(title);
	} 
	public void setPassword(String password) {
		this.password.set(password);
	}
	public void setPublicity(String publicity) {
		this.publicity.set(publicity);
	}
	public void setExitDate(String exitDate) {
		this.exitDate.set(exitDate);
	}
	public void setContent(String content) {
		this.content.set(content);
	}
}
