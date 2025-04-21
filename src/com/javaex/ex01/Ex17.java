package com.javaex.ex01;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요.");
		System.out.print("금익:");
		int money = sc.nextInt();
		
		double result;
		
		if(money<=1000) {
			result = 0.09*money;
			System.out.println("소득세는" + result + " 입니다.");
			
		}else if(money>1000 && money<=4000) {
			result = 1000*0.09+0.18*(money-1000);
			System.out.println("소득세는" + result + " 입니다.");
		
		}else if(money>4000 && money<8000) {
			result = 1000*0.09 + 3000*0.18 + 0.27*(money-4000);
			System.out.println("소득세는" + result + " 입니다.");
		
		}else if(money>=8000) {
			result = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(money - 8000);
			System.out.println("소득세는" + result + " 입니다.");
		}
		
	
	sc.close();
	
	
	}

}
