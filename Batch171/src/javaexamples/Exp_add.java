package javaexamples;
import java.util.Scanner;

public class Exp_add {
public static void main(String args[]) {
	int a,b,c;
	System.out.println("Enter a & b values");
	Scanner object = new Scanner(System.in);
	a=object.nextInt();
	b=object.nextInt();
	c=a+b;
	System.out.println("Additon of two values"+c);
	
}
}
