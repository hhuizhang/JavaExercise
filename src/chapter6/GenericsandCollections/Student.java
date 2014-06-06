package chapter6.GenericsandCollections;

class Student implements Comparable<Student>{
    
	String id;
	String name;
	Double cgpa;
	
	public Student(String studentID, String studentName, Double studentCGPA){
		id = studentID;
		name = studentName;
		cgpa = studentCGPA;
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.id);
		//return this.cgpa.compareTo(o.cgpa);
	}
	

	public String toString(){
		return " \n " + id + " \t " + name + " \t " + cgpa;
	}

}
