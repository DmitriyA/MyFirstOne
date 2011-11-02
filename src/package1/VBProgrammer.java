package package1;

import java.util.Date;

public class VBProgrammer extends Programmer {
	private double experience;

	public VBProgrammer(Date hireDate, String firstName, String lastName, int age,
			double salary, String programmingLanguage, int programmingLevel,
			double bonus, double experience) {
		super(hireDate, firstName, lastName, age, salary, programmingLanguage, programmingLevel,
				bonus);
		this.experience = experience;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

}
