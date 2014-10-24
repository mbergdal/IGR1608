package students;

public class Student {
	private String firstName;
	private String lastName;
	private int age;
	private char sex;
	
	public Student(String firstName, String lastName, String age, String sex) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = Integer.parseInt(age);
		this.sex = sex.charAt(0);
	}

	public String toFormattedString() {
		return String.format(
				"First name:%s, Last name:%s, Age:%d, Sex:%s", 
				firstName, 
				lastName, 
				age, 
				(sex=='f') ? "female": "male");
	}	
}
