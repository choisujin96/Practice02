package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		System.out.print("숫자:");
		double x = sc.nextInt();
		
		double result;
		
		if(x>0) {
			result = 7*x+2;
			System.out.println("계산결과는 " + result + " 입니다.");
		
		}else if(x<=0){
			result = x*x*x-9*x+2;
			System.out.println("계산결과는 " + result + " 입니다.");
		}
		
		sc.close();
	}

}
