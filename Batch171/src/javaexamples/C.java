package javaexamples;
class D{
	int a=10;
	int b=20;
	public void m1(){
		System.out.println("m1 executed");

	}
 }
 class B extends D{
	int x=30;
	int y=40;
	public void m2() {
		System.out.println("m2 executed");
		System.out.println(a+b);
		}
}
public class C extends B {
public void m3() {
	System.out.println("m3 Executed");
	System.out.println(x+y);
	System.out.println(a+b);
	
}
public static void main(String args[]) {
	C obj=new C();
	obj.m1();
	obj.m2();
	obj.m3();
	
}
}
 
