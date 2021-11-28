package org.practice;

public class Practice {
	public static void main(String[] args) {
		
		int s [] [] = new int [3][2];
		s [0][0]=10;     s [0][1]=20;
		s [1][0]=30;     s [1][1]=40;
		s [2][0]=50;     s [2][1]=60;
		for (int[] g : s) {
			for (int r : g) {
				System.out.println(r);
				
			}
			
		}
	}

}
