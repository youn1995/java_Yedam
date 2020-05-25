package com.yedam.collection.list;

import java.util.List;

public interface BoardService {
	public void insertBoard(List<Board> list, Board board);
	
	public void updateBody(List<Board> list, int indexNum, String body);
	
	public void deleteBoard(List<Board> list, int indexNum);
	
	public void boardList(List<Board> list);
	
	public int findBoard(List<Board> list, String str);
}
