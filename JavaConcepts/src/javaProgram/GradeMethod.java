package javaProgram;

public class GradeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//gradeFinder("Azlan", 90);
		String studentName;
		String grade;
		studentName="Azlan";
		grade= gradeFinder(95);
		dataPrinter(studentName, grade);
		studentName="Altaf";
		grade=gradeFinder(10);
		dataPrinter(studentName, grade);
		
	}
	
	/*public static void gradeFinder(String studentName, int score) {
     String grade = null;
		
		if(score >= 90 && score <=100) {
			grade= "A";
				}
		else if (score >= 80 && score <90) {
			grade="B";
		}
		else {
			grade="C";
		}
		
		System.out.println(studentName +" got grade as " + grade);
	}*/
	
	public static String gradeFinder(int score) {
		String grade;
		if(score >= 90 && score <=100) {
			grade= "A";
				}
		else if (score >= 80 && score <90) {
			grade="B";
		}
		else {
			grade="C";
		}
		return grade;
	}
	public static void dataPrinter(String studentName, String grade) {
		System.out.println(studentName +" got grade as " + grade);
		
	}
	
}

