package day02_variable;

public class Quiz01 {
	public static void main(String[] args) {
		byte b = 97;
		short sh = 20;
		char ch = 'A';
		float fl;
		
		System.out.println(sh = (short)b);
		ch = (char)b;
		sh = (short)ch;
		ch = (char)sh;
		fl = (float)5.11;
	}
}
