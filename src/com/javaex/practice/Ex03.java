package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("나이:");
		int age = sc.nextInt();
		
		if( age <= 17 ) {
			System.out.println("청소년 입니다");
		} 
		
		sc.close();
		
	}

}
