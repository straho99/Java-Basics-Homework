package homework;

import java.util.Scanner;

public class ExamScore {

	public static void main(String[] args) {
		// Problem 14:
		Scanner input=new Scanner(System.in);
		input.nextLine();
		input.nextLine();
		input.nextLine();
		
		do {
			String allData=input.nextLine();
			String[] student=allData.split("[  |]+");
			for (int i = 0; i < student.length; i++) {
				System.out.println(student[i]);
			}
		} while (input.nextLine().indexOf('-')<0);
	}

}
