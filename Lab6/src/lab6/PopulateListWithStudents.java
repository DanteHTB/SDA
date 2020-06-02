package lab6;

import java.util.ArrayList;
import java.util.List;

public class PopulateListWithStudents {

	private ArrayList<StudentDetails> listOfStudents = new ArrayList<StudentDetails>();
	
	public ArrayList<StudentDetails> getAListOfStudents()
	{
		StudentDetails student1 = new StudentDetails("Angelescu", "Alexandru", new double[] {10, 10, 10}, new double[] {10, 10, 10});
		StudentDetails student2 = new StudentDetails("Angelescu", "Alexandru1", new double[] {10, 10, 10}, new double[] {10, 10, 10});
		StudentDetails student3 = new StudentDetails("Angelescu", "Alexandru2", new double[] {10, 10, 10}, new double[] {10, 10, 10});
		StudentDetails student4 = new StudentDetails("Angelescu", "Alexandru3", new double[] {10, 10, 10}, new double[] {10, 10, 10});
		StudentDetails student5 = new StudentDetails("Angelescu", "Alexandru4", new double[] {10, 10, 10}, new double[] {10, 10, 10});
		StudentDetails student6 = new StudentDetails("Angelescu", "Alexandru5", new double[] {10, 10, 10}, new double[] {10, 10, 10});
		StudentDetails student7 = new StudentDetails("Angelescu", "Alexandru6", new double[] {10, 10, 10}, new double[] {10, 10, 10});
		StudentDetails student8 = new StudentDetails("Angelescu", "Alexandru7", new double[] {10, 10, 10}, new double[] {10, 10, 10});
		StudentDetails student9 = new StudentDetails("Angelescu", "Alexandru8", new double[] {10, 10, 10}, new double[] {10, 10, 10});
		StudentDetails student10 = new StudentDetails("Angelescu", "Alexandru9", new double[] {10, 10, 10}, new double[] {10, 10, 10});
		
		listOfStudents.add(student1);
		listOfStudents.add(student2);
		listOfStudents.add(student3);
		listOfStudents.add(student4);
		listOfStudents.add(student5);
		listOfStudents.add(student6);
		listOfStudents.add(student7);
		listOfStudents.add(student8);
		listOfStudents.add(student9);
		listOfStudents.add(student10);
		
		return listOfStudents;
	}
}
