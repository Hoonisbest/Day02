package day02_variable;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age, num ;
		String name;
		
		
		System.out.print("�̸��Է� : ");
		name = input.next();
		System.out.print("�����Է� : ");
		age = input.nextInt();
		System.out.print("��ȣ�Է� : ");
		num = input.nextInt();
		System.out.print("�̸� : "+name+"\t");
		System.out.print("���� : "+age+"\t\t");
		System.out.print("��ȣ : "+num);
		
		
		
		
	}
}
