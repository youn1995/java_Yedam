package com.yedam.collection.list;

import java.util.List;

public class BoardServiceImpl implements BoardService {

	@Override
	public void insertBoard(List<Board> list, Board board) {
		list.add(board);
	}

	@Override
	public void updateBody(List<Board> list, int indexNum, String body) {
		list.get(indexNum).setBody(body);
	}

	@Override
	public void deleteBoard(List<Board> list, int indexNum) {
		list.remove(indexNum);
	}

	@Override
	public void boardList(List<Board> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1) + list.get(i).toString());
		}
	}

	@Override
	public int findBoard(List<Board> list, String str) {
		int indexOfBoard = -1;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(str)) {
				indexOfBoard = i;
				break;
			}
		}
		return indexOfBoard;
	}

}
