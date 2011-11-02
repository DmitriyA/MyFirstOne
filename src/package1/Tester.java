package package1;

import java.util.Date;

public class Tester extends Employee{
	private boolean autoTester;
	public Date hireDate = new Date(System.currentTimeMillis()-100000000);
	
	public Tester(Date hireDate, String firstName, String lastName, int age, double salary, boolean autoTester){
		super (hireDate, firstName, lastName, age, salary);
		this.autoTester =autoTester;
	}

	public boolean isAutoTester() {
		return autoTester;
	}

	public void setAutoTester(boolean autoTester) {
		this.autoTester = autoTester;
	}

	
	public void doWork() {
		System.out.println("I'm testing.");
	}
/*	public Date getDate(){
		return hireDate;
	}*/
}
