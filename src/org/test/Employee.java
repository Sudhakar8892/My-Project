package org.test;

public class Employee {
	private void add() {
		byte age=127;
		short rollno=32563;
		int applno= 3889227;
		long phno=8892123405l;
		float salary =35000.34566f;
		double prvsal =25000.4367475;
		char gender= 'm';
		String name ="raju";
		
		System.out.println(age);
		System.out.println(rollno);
		System.out.println(applno);
		System.out.println(phno);
		System.out.println(salary);
		System.out.println(prvsal);
		System.out.println(gender);
		System.out.println(name);
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.add();
	}
}
