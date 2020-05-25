package com.yedam.collection.list;


public class Board {
	private String title;
	private String body;
	private String writer;
	public Board(){
		
	}
	
	public Board(String title, String body, String writer) {
		this.title = title;
		this.body = body;
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return " " + title + "  "+writer + "\n" + body ;
	}
	
		
}
