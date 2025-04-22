package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		//aeiou - 모음

		
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 한글자(소문자)를 입력하세요.");
		System.out.print("알파벳:");
		
		char alpha = sc.next().charAt(0);
		
		switch(alpha) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("모음입니다.");
			break;
			
		default :
			System.out.println("자음입니다.");
			break;
			
		
		}
		
		sc.close();
	}

}
