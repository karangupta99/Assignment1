package seleniumDemo;

import java.util.Scanner;

public class First {

	
	public static int add(int a, int b) {
		return a + b;
	}
	public static int Substraction(int a, int b) {
		return a - b;
	}
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	public static int division(int a, int b) {
		return a / b;
	}
	public static int remainder(int a, int b) {
		return a % b;
	}
	public static int cube(int a) {
		return a * a * a;
	}
	public static int square(int a) {
		return a * a;
	}
	
	public static int absolute(int a) {
		return Math.abs(a);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		First f1 = new First();
	      f1.add(a, b);
	      f1.Substraction(a, b);
	      f1.multiply(a, b);
	      f1.division(a, b);
	      f1.add(0, 0);
	      f1.square(a);
	      f1.cube(5);
	      f1.remainder(a, b);
	      f1.absolute(a);
}
}
