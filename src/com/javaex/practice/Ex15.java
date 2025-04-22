package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호:");
		char math = sc.next().charAt(0);
		
		System.out.print("숫자1:");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2:");
		int num2 = sc.nextInt();
		
		
		double result;
		
		
		switch(math) {
	
		case '+':
			result = num1+num2;
			System.out.println("결과는" + result);
			break;
			
		case '-':
			result = num1-num2;
			System.out.println("결과는" + result);
			break;
			
		case '*':
			result = num1*num2;
			System.out.println("결과는" + result);
			break;
			
		case '/':
			if(num2 != 0) {//num2가 0이 아닐때.. 나눗셈에선 필히 사용.. 너무어렵당..
				result = num1/num2;
			System.out.println("결과는" + result);
			}else {
				System.out.println("계산할 수 없습니다.");
			}break;
			
			default:
				System.out.println("계산할 수 없는 기호입니다.");
			
			
		}
				
		sc.close();
		
		
	}

}
