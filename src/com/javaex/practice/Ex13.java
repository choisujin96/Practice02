package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

		public static void main(String[] ergs) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("첫번째 숫자:");
			int num1 = sc.nextInt();
			
			System.out.print("두번째 숫자:");
			int num2 = sc.nextInt();
			
			int small = 0;
			int big = 0;
			
			if(num1<num2) {
				small = num1;
				big = num2;
				
			}else if(num1>num2) {
				small = num2;
				big = num1;
			}
			
			
			//약수를 구할 땐 큰 수에서 작은 수 !
			if(big % small == 0) {
				System.out.println( small + "은(는) " + big + " 의 약수입니다.");
			}else {
				System.out.println( small + "은(는) " + big + " 의 약수가 아닙니다.");
			}
				
			
			sc.close();
			
			
			
		}
}
