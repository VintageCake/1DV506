package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeAveraging {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\Vintage\\Desktop\\testresults.txt");
		ArrayList<String> gradeList = new ArrayList<>();

		try (Scanner sc = new Scanner(f)) {
			int iterator = 1;
			while (sc.hasNext()) {
				if (iterator != 7)
					System.out.println(sc.next());
				else {
					gradeList.add(sc.next());
					iterator = -1;
				}
				iterator++;
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		double allGrade = 0;
		for (int i = 0; i < gradeList.size(); i++) {
			allGrade += Double.parseDouble(gradeList.get(i));
		}
		System.out.println(allGrade);
		System.out.println(allGrade/gradeList.size());

	}

}
