package javaexamples;
abstract class Bank{
abstract void debit();
abstract void credit();
}
class Hdfc extends Bank{
	public void debit() {
		System.out.println("HDFC Debit");
	}
	public void credit() {
		System.out.println("HDFC Credit");
	}
	
}
class Icici extends Bank{
	public void debit() {
		System.out.println("ICICI DEBIT");
	
	}
	public void credit() {
		System.out.println("ICICI CREDIT");
	}
}
public class TestBank {
	public static void main(String args[]) {
		Hdfc hd=new Hdfc();
		hd.debit();
		hd.credit();
		Icici ic=new Icici();
		ic.credit();
		ic.debit();
	}

}
