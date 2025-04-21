package com.javaex.ex01;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자)를 입력하세요.");
		System.out.print("알파벳:");
		
		String alpha = sc.nextLine();
		
		if(alpha.equals("a")) {
			System.out.println("모음입니다.");
		
		}else if(alpha.equals("e")) {
			System.out.println("모음입니다.");
		
		}else if(alpha.equals("i")) {
			System.out.println("모음입니다.");
		
		}else if(alpha.equals("o")) {
			System.out.println("모음입니다.");
		
		}else if(alpha.equals("u")) {
			System.out.println("모음입니다.");
		
		} else {
			System.out.println("자음입니다.");
		}
	
	
	
		
		
	sc.close();
	
	}

}
