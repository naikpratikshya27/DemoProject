//Constructor with no Argument and With Argument Program
package thirty1stbatch;

public class DemoCons {
	public DemoCons()
	{
		System.out.println("This is no Argument Constructor...");
	}
	
	public DemoCons(String s)
	{
		System.out.println("I am a Parameterized Constructor in " + s);
	}

	public static void main(String[] args) {
		DemoCons a=new DemoCons();
		DemoCons b=new DemoCons("CoreJava");
		a.getClass();//not a part of the code
		b.getClass();//not a part of the code 

	}

}
