package chapter6.GenericsandCollections;

import java.util.Arrays;

class ComparatorTest {
	public static void main(String []args){
		Student []students = { new Student("cs011", "Lenon    ", 3.1 ),
				new Student("cs021", "McCartney", 3.4),
				new Student("cs012", "Harrison ", 2.7),
				new Student("cs022", "Starr    ", 3.7)};
		
		System.out.println("Before sorting by student id: ");
		System.out.println("Student-ID\t Name \t CGPA(for 4.0)");
		System.out.println(Arrays.toString(students));
		
		Arrays.sort(students);
		
		System.out.println("After sorting by student id: ");
		System.out.println("Student-ID\t Name  \t CGPA(for 4.0)");
		System.out.println(Arrays.toString(students));
			
		Arrays.sort(students, new CGPAComparator());
		
		System.out.println("After sorting by student CGPA: ");
		System.out.println("Student-ID\t Name \t CGPA(for 4.0)");
		System.out.println(Arrays.toString(students));
		
	}
}
