import java.util.*;


public class StudentDrawEngine{
	public static String draw(Hashtable<String, Integer> students){
		while (students.size() > 1){
			String studentToRemove = getStudentToRemove(students);
			int numberOfClasses = students.get(studentToRemove);
			if (numberOfClasses > 0){
				students.put(studentToRemove, --numberOfClasses);
			}
			else{
				students.remove(studentToRemove);
				System.out.println("Removing student: " + studentToRemove);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		return students.keys().nextElement();	
	}

	private static String getStudentToRemove(Hashtable<String, Integer> students) {
		Random rand = new Random();
		ArrayList<String> studentNames = Collections.list(students.keys());
		String student = studentNames.get(rand.nextInt(students.size()));		
		return student;
	}
}