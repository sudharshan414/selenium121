package javaexamples;


class A{
	
public void test() {
	System.out.println("hai....");
	System.out.println("parent class");
}
}

public class Single extends A{
	public static void main(String[]args) {
		Single s=new Single();
		s.test();
	}

}
