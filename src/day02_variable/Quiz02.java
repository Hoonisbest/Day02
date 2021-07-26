package day02_variable;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int kor, eng ,mat, sum ;
	
		System.out.print("이름입력 : ");
		name = input.next();
		System.out.print("국어점수 입력 : ");
		kor = input.nextInt();
		System.out.print("수학점수 입력 : ");
		mat = input.nextInt();
		System.out.print("영어점수 입력 : ");
		eng = input.nextInt();
		sum = kor+eng+mat;
		
		System.out.println("====================");
		System.out.println("이름 : "+name);
		System.out.println("====================");
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+mat);
		System.out.println("====================");
		System.out.println("합계 : "+sum);
		System.out.println("====================");
	}
}
