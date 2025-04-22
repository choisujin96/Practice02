package com.javaex.ex01;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 년도를 입력 받습니다.");
		System.out.print("년도:");
		int born = sc.nextInt();
		int result;
		
		if(2023-born<15) {
			result = 2023-born;
			System.out.println(result + "살 무료예방접종 대상자 입니다.");
		}else if(2023-born>=65) {
			result = 2023-born;
			System.out.println(result + "살 무료예방접종 대상자 입니다.");
		}else {
			result = 2023-born;
			System.out.println(result + "살 무료예방접종 대상자가 아닙니다.");
		}
		
	}

}
