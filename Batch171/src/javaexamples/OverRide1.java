package javaexamples;

public class OverRide1 extends OverRide{
public void add(int a,int b) {
	System.out.println(a-b);
	System.out.println("child-New car");
}
public static void main(String args[]) {
	OverRide obj=new OverRide();
	obj.add(10, 20);
}
}
