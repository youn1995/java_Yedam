package com.yedam.api.arrays;

import java.util.Arrays;

public class EqualsExample {
	public static void main(String[] args) {
		int[][] original = {{1,2},{3,4}};
		
		
		int[] ori = {1,2};
		int[] ori1 = new int[2];
		ori1[0] = 1; ori1[1] = 2;
		
//		int[] clo = Arrays.copyOf(ori, ori.length);
//		System.out.println(Arrays.equals(ori, clo));
		System.out.println(Arrays.equals(ori, ori1));
		
		
		
		
		System.out.println("얕은 복제후 비교");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("배열번지비교" +original.equals(cloned1));
		System.out.println("1차배열항목값비교" + Arrays.equals(original, cloned1));
		System.out.println("중첩배열항목비교"+ Arrays.deepEquals(original, cloned1));
		
		System.out.println("깊은 복제후 비교");
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		
		System.out.println("배열번지비교" +original.equals(cloned2));
		System.out.println("1차배열항목값비교" + Arrays.equals(original, cloned2));
		System.out.println("중첩배열항목비교"+ Arrays.deepEquals(original, cloned2));
		
	}
}
