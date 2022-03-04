package javaexamples;
import java.util.Scanner;
public class SwitchExp {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.ADD");
		System.out.println("2.SUB");
		System.out.println("3.MUL");
		System.out.println("4.DIV");
		System.out.println("ENter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
			default:
				System.out.println("invalid choice");
			
		}
	}

}
