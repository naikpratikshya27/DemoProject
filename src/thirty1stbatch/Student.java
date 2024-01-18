package thirty1stbatch;

public class Student {
	public Student()
	{
		System.out.println("Engineering Students");
	}
	public Student(int id,String Stream)
	{
		System.out.println("My id is:" + id);
		System.out.println("My Stream is:" + Stream);
	}
	public Student(char Div)
	{
		System.out.println("My division is:" + Div);
	}

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student(11,"ECE");
		Student s3 = new Student('A');
		
		s1.toString();//extra
		s2.toString();//not part of the code
		s3.toString();//extra not part of the code
		
	
// Constructor overloading is possible.....
	}

}
