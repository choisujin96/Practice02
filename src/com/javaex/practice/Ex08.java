package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키:");
		double height = sc.nextDouble();
		
		System.out.print("몸무게:");
		double kg = sc.nextDouble();
		
		if(kg<(height-100)*0.9) {
			System.out.println("저체중입니다.");
		}else if(kg==(height-100)*0.9) {
			System.out.println("표준입니다.");
		}else {
			System.out.println("과체중입니다.");
		}
		
		System.out.println( "표준체중: "+ (height-100)*0.9 );
		
	
		sc.close();
	}
	
	
}
