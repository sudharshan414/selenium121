package javaexamples;

public class Datatype_Var {
int b=20;
static int empid=101;
public void m1() {
	int a=10;
	System.out.println("m1 Exeuted");
	System.out.println(a+"local var");
	System.out.println(b+"instance var");
}
public void m2() {
	System.out.println("m2 Execcuted");
	System.out.println(b+"instance var");
	System.out.println(empid+"static var");
}
public void m3() {
	System.out.println("m3 Executed");
	System.out.println(b+"instance var");

}
public static void st() {
	System.out.println("static method is excuted");
}
public static void main(String args[]) {
	System.out.println("main method is Exected");
	Datatype_Var m=new Datatype_Var();
	m.m1();
	m.m2();
	m.m3();
	Datatype_Var.st();
}
}
