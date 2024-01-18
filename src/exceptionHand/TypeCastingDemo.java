package exceptionHand;

public class TypeCastingDemo {

	public static void main(String[] args) {
		int i=10;
		double d =i;
		System.out.println(d);//up casting
		double d1=10.5;
		int i1=(int) d1;
		System.out.println(i1); //down casting
	}

}
