package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;

public class BoardServiceImpl2 implements BoardService2 {
	List<Board> list = new ArrayList<Board>();

	@Override
	public void insertBoard(Board board) {
		list.add(board);
	}

	@Override
	public void updateBody(int indexNum, String body) {
		list.get(indexNum).setBody(body);

	}

	@Override
	public void deleteBoard(int indexNum) {
		list.remove(indexNum);

	}

	@Override
	public void boardList() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + list.get(i).toString());
		}

	}

	@Override
	public int findBoard(String str) {
		int indexOfBoard = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(str)) {
				indexOfBoard = i;
				break;
			}
		}
		return indexOfBoard;

	}

}
