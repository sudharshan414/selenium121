package javaexamples;

public class Dt_Var {
int b=20;//instance var
static int empid=101;
public void m1() {
	int a=10;//local var
	System.out.println("m1 Executed");
	//int string
	System.out.println(a+"local var");
System.out.println(b+"instance var");
}
public void m2() {
	System.out.println("m2 Executed");
	System.out.println(b+"instane var");
	System.out.println(empid+"static var");
}
public void m3() {
	System.out.println("m3 Executed");
	System.out.println(b+"instance var");
}
public static void main(String args[]) {
	System.out.println("main method executed");
	Dt_Var m=new Dt_Var();
	m.m1();
	m.m2();
	m.m3();
}
}
