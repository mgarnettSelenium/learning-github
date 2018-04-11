package learn.programming;

public class Student {
	
	String name;
	int age;
	
	Student(String hisName, int hisAge){
		name = hisName;
		age = hisAge;
	}
	

	public static void main(String[] args) {
		
		Student st1 = new Student("ilzat", 23);
		Student st2 = new Student("tazli", 32);

	}

}
