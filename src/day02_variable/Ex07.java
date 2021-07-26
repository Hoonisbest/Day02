package day02_variable;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age, num ;
		String name;
		
		
		System.out.print("이름입력 : ");
		name = input.next();
		System.out.print("나이입력 : ");
		age = input.nextInt();
		System.out.print("번호입력 : ");
		num = input.nextInt();
		System.out.print("이름 : "+name+"\t");
		System.out.print("나이 : "+age+"\t\t");
		System.out.print("번호 : "+num);
		
		
		
		
	}
}
