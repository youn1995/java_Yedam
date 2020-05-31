package com.yedam.multithreads;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
//		Runnable beepTask = new BeepTask();
//		Thread thread = new Thread(beepTask);

//		Thread thread = new Thread(new Runnable() {		
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for(int i =0; i<10; i++) {
//					toolkit.beep();
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		});

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
