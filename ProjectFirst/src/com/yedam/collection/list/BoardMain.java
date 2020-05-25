package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMain {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		BoardService service = new BoardServiceImpl();
		List<Board> boards = new ArrayList<>();
		int menuNum = 0;
		int indexNum = -1;
		String title = null;
		String body = null;
		String writer = null;
		while (true) {
			System.out.println("---------------예담게시판---------------");
			System.out.println("1.게시글 리스트");
			System.out.println("2.게시글 작성");
			System.out.println("3.게시글 수정");
			System.out.println("4.게시글 삭제");
			System.out.println("5.게시판 나가기");
			System.out.println();
			System.out.print("번호를 입력하세요. > ");
			menuNum = checkMenuUserInput(5);
			if (menuNum == 1) {
				System.out.println("---------------전체게시글---------------");
				service.boardList(boards);
			} else if (menuNum == 2) {
				System.out.println("---------------게시글작성---------------");
				System.out.print("제목을 입력하세요 > ");
				title = scn.nextLine();
				System.out.println("내용을 입력하세요 > ");
				body = scn.nextLine();
				System.out.print("작성자를 입력하세요 > ");
				writer = scn.nextLine();
				Board board = new Board(title, body, writer);
				service.insertBoard(boards, board);
			} else if (menuNum == 3) {
				System.out.println("---------------게시글수정---------------");
				System.out.print("수정하고 싶은 게시글 제목을 입력하세요 > ");
				title = scn.nextLine();
				System.out.println("");
				indexNum = service.findBoard(boards, title);
				if(indexNum != -1) {
					System.out.println("수정하고 싶은 내용을 작성하세요 > ");
					body = scn.nextLine();
					service.updateBody(boards, indexNum, body);
				} else if(indexNum == -1) {
					System.out.println("해당 게시글이 없습니다.");
				}
				
			} else if (menuNum == 4) {
				System.out.println("---------------게시글삭제---------------");
				System.out.println("삭제하고 싶은 게시글의 제목을 입력하세요 > ");
				title = scn.nextLine();
				indexNum = service.findBoard(boards, title);
				if(indexNum != -1) {
					service.deleteBoard(boards, indexNum);
				} else if(indexNum == -1) {
					System.out.println("해당 게시글이 없습니다.");
				}
				
			} else if (menuNum == 5) {
				break;
			}

		} // end of while
	}// end of main

	public static int checkMenuUserInput(int sumOfMenu) {
		int checkInput = 0;
		while (true) {
			try {
				checkInput = scn.nextInt();
				scn.nextLine();
				if (checkInput >= 1 && checkInput <= sumOfMenu) {
					break;
				} else {
					scn = new Scanner(System.in);
					System.out.print("Enter Correct Number > ");
				}
			} catch (Exception e) {
				scn = new Scanner(System.in);
				System.out.print("Enter Only Number > ");
			}
		}
		return checkInput;
	}
}
