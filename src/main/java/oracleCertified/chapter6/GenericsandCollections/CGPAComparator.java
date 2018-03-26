package oracleCertified.chapter6.GenericsandCollections;

import java.util.Comparator;

class CGPAComparator implements Comparator<Student> {

	public int compare(Student object1, Student object2) {
		// TODO Auto-generated method stub
		return object1.cgpa.compareTo(object2.cgpa);
	}

}
