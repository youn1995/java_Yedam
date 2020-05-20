package com.yedam.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceExample {
	public static void main(String[] args) {
//		FileInputStream fis = null;
		String paths = "src/com/yedam/exceptions/AccountExample.java";
		try(FileInputStream fis = new FileInputStream(paths);) { //try()안에 넣으면 fis.close()역활을 함
//			fis = new FileInputStream(paths);
			int readByte;
			while ((readByte = fis.read()) != -1) {
				System.out.write(readByte);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 못찾겠다");
		} catch (IOException e1) {
			System.out.println("파일을 못읽겠다");
		}
//		try {
//			fis.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

}
