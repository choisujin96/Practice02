package com.javaex.ex01;

import java.util.Scanner;

public class Ex12 {
	
		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("숫자 3개를 입력하세요.");
			System.out.print("숫자1: ");
			int num1 = sc.nextInt();
			
			System.out.print("숫자2: ");
			int num2 = sc.nextInt();
			
			System.out.print("숫자3: ");
			int num3 = sc.nextInt();
			
			int small= 0;
			
			if(num1 <= num2 && num1 <= num3) {
				small = num1;
			}else if(num2 <= num1 && num2<= num3) {
				small = num2;
			}else {
				small = num3;
			}
			
			System.out.println("가장 작은수는 " + small  + " 입니다.");
				
			sc.close();
			
		}
}
