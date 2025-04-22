package com.javaex.ex01;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//2023-입력값
		System.out.println("태어난 년도를 입력해 주세요.");
		System.out.print("년도:");
		int born = sc.nextInt();
		
		System.out.println(2023-born + "살 무료 예방접종 대상자 입니다.");
		  
		
		
		sc.close();
		

	}

}
