package package1;

import java.util.Date;

public class Programmer extends Employee implements Codable{
	private String programmingLanguage;
	private int programmingLevel;
	private double bonus;
	
	public Programmer(Date hireDate, String firstName, String lastName, int age, double salary, String programmingLanguage, int programmingLevel, double bonus){
		super (hireDate, firstName, lastName, age, salary);
		this.programmingLanguage = programmingLanguage;
		this.programmingLevel = programmingLevel;
		this.bonus = bonus;	
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	public int getProgrammingLevel() {
		return programmingLevel;
	}

	public void setProgrammingLevel(int programmingLevel) {
		this.programmingLevel = programmingLevel;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public void writeCode() {
		System.out.println("Programm was writed.");
	}

	
	public void doWork() {
		writeCode();
	}
	
	
}
