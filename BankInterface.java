package day03;

public interface BankInterface {
	int abc =30;
	public double withDraw( double amount);
	public double deposit(double amount);
	
	//can be overridden
	default void newMethod() {
		System.out.println("Newly added default method");
		gen();
	}
	default void myMethod() {
		System.out.println("Newly added default method");
		gen();
	}
	private void gen() {
		System.out.println("private method");
		
	}
	//can not be overridden
	static void anotherNewMEthod() {
		System.out.println("Newly added static method");	
	}
}
