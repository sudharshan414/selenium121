package javaexamples;

public class Nestedif {
public static void main(String args[]) {
	int a=50;
	int b=60;
	if(a==40) {		
	if(a==50) {
				System.out.println("a value is 40 & b value is 50");
			}
			else {
				System.out.println("else stmt of 2nd cond");
			}
}
else {
	System.out.println("else stmt 1st cond");
}
}
}