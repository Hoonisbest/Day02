package day02_variable;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int kor, eng ,mat, sum ;
	
		System.out.print("�̸��Է� : ");
		name = input.next();
		System.out.print("�������� �Է� : ");
		kor = input.nextInt();
		System.out.print("�������� �Է� : ");
		mat = input.nextInt();
		System.out.print("�������� �Է� : ");
		eng = input.nextInt();
		sum = kor+eng+mat;
		
		System.out.println("====================");
		System.out.println("�̸� : "+name);
		System.out.println("====================");
		System.out.println("���� : "+kor);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+mat);
		System.out.println("====================");
		System.out.println("�հ� : "+sum);
		System.out.println("====================");
	}
}
