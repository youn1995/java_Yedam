package com.yedam.multithreads;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
//		Thread thread = new BeepThread();

//		Thread thread = new Thread() {
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for (int i = 0; i < 10; i++) {
//					toolkit.beep();
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//
//			}
//		};

		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 10; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		thread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("BEEP");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
