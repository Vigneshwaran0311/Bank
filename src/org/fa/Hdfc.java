package org.fa;

//****Multiple Inheritance***//
public class Hdfc implements Sbi,Bank {

	@Override
	public void loan() {
		System.out.println("1");
	}

	@Override
	public void recdep() {
		System.out.println("2");
		
	}

	@Override
	public void savings() {
		System.out.println("3");
		
	}

	@Override
	public void fixed() {
		System.out.println("4");
	}
	
	public static void main(String[] args) {
		
		Hdfc h=new Hdfc();
		h.loan();
		h.recdep();
		h.savings();
		h.fixed();
		
		
		
		
		
		
		
	}
	
	

	
	
	
	

}
