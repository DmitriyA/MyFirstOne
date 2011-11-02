package package1;

import java.util.Date;

public class JavaProgrammer extends Programmer {
	private String technology;
	
	public JavaProgrammer(Date hireDate, String firstName, String lastName, int age,
			double salary, int programmingLevel,
			double bonus, String technology) {
		super(hireDate, firstName, lastName, age, salary, "Java", programmingLevel,
				bonus);
		this.technology = technology;
	}
	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	@Override
	public void writeCode(){
		System.out.println("Java code be done.");
	}
}
