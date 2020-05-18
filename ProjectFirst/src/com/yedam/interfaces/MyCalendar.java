package com.yedam.interfaces;

import java.util.Calendar;

public class MyCalendar {
	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance(); //오늘 날짜 현재시간 기준
//		System.out.println(cal);
//		cal.set(2020,6, 1);
//		System.out.println("년도: "+ cal.get(Calendar.YEAR));
//		System.out.println("월: "+ cal.get(Calendar.MONTH));
//		System.out.println("요일 " +cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println("일 "+cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println();
		showCal(2020, 5);
	}

	public static void showCal(int year, int month) {
		// 연도, 달력 출력
		int today = 1;
		int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year, month);
		System.out.printf("%10s%d년%2d월%10s", "", year, month, "");
		System.out.println();
		String[] week = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		for(int i = 0; i<week.length; i++) {
			System.out.printf("%4s" , week[i]);
		}
		System.out.println();
		for(int i=1; i<dayOfWeek; i++) {
			System.out.printf("%4s", "");
			
		}
		for (int i = 0; i < lastDay; i++) {
			
			System.out.printf("%4d", today);
			if ((today+dayOfWeek -1) % 7 == 0) {
				System.out.println();
			}
			today++;
		}
	}

	public static int getLastDay(int year, int month) {
		int lastDay = 0;
		if ((month < 7 && month % 2 == 1) || (month >= 8 && month % 2 == 0)) {
			lastDay = 31;
		} else if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				lastDay = 29;
			} else {
				lastDay = 28;
			}
		} else {
			lastDay = 30;
		}
		return lastDay;
	}
	
	public static int getDayOfWeek(int year, int month) {
		int dayOfWeek = 0;
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
	   dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		return dayOfWeek;
	}
}
