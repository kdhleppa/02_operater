package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int input1 = sc.nextInt();
				
		System.out.print("사탕 개수 : ");
		int input2 = sc.nextInt();
		
		System.out.println();
		
		int result1 = input2 / input1;
		int result2 = input2 % input1;
		
			
		System.out.println("1인당 사탕 개수 : " + result1);
		System.out.println("남는 사탕 개수 : " + result2);
		System.out.println();
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String input1 = sc.next();
		
		System.out.print("학년(정수만) : ");
		int input2 = sc.nextInt();
		
		System.out.print("반(정수만) : ");
		int input3 = sc.nextInt();
		
		System.out.print("번호(정수만) : ");
		int input4 = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : ");
		String input5 = sc.next();
		
			
		String s;
		
		switch (input5) {
			case "남학생":
				s = "남학생";
				break;
			
			case "여학생":
				s = "여학생";
				break;
			
			default:
				s = "알수없는성별";
				
		}
				
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double input6 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다\n", input2, input3, input4, input1, s, input6);
		System.out.println();		
	}
	
	

	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int input1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int input2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int input3 = sc.nextInt();
		
		int result1 = input1 + input2 + input3;
		
		double result2 = result1 / 3;
		
		System.out.println();
		
		System.out.printf("합계 : %d\n", result1);
		System.out.printf("평균 : %.1f\n", result2);
		
		//String result3 = (result2 >= 60) && (input1 >= 40) && (input2 >= 40) && (input3 >= 40) ? "합격" : "불합격";
		boolean result3 = (result2 >= 60) && (input1 >= 40) && (input2 >= 40) && (input3 >= 40);
		
		// System.out.println( result3 );
		System.out.println( result3 ? "합격" : "불합격");
		
	}

}
