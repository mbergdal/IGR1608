package students;
import java.util.Scanner;

public class StudentRegister {
	static Student[] students = new Student[20];
	static int studentCount = 0;

	public static void main(String[] args) {
		getInputFromUser();
	}

	private static void getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		while(true){
			promtUser();
			String input = scanner.nextLine();
			if (input.toLowerCase().startsWith("list")){
				listAllStudents();
			}
			else if (input.toLowerCase().startsWith("add")){
				addStudent(input.substring(3, input.length()));
			}
			else if (input.toLowerCase().startsWith("quit")){
				return;
			}
			else{
				System.out.println("Invalid input");
			}			
		}
	}

	private static void addStudent(String userInput) {
		String[] parts = userInput.split(",");		
		Student newStudent = new Student(
				parts[0].trim(), 
				parts[1].trim(), 
				parts[2].trim(), 
				parts[3].trim());		
		students[studentCount] = newStudent;
		studentCount++;
	}

	private static void listAllStudents() {
		int emptyCount = 0;
		for (int i = 0; i < students.length; i++){
			Student student = students[i];
			if (student != null){
				System.out.println(student.toFormattedString());
			}else{
				emptyCount++;
			}
		}

		if (emptyCount == students.length){
			System.out.println("List is empty");
		}
	}

	private static void promtUser() {
		System.out.println(
				"Enter 'list' to list all students or" + 
						" 'add <FirstName>,<LastName>,<Age>,<[m||f]>' to add new student." + 
				" 'quit' to quit");
	}
}
