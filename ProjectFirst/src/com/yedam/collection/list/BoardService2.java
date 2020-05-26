package com.yedam.collection.list;


public interface BoardService2 {
	public void insertBoard(Board board);

	public void updateBody(int indexNum, String body);

	public void deleteBoard(int indexNum);

	public void boardList();

	public int findBoard(String str);
}
