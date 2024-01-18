package simpleJavaProgrammes;

public class StringOperations {

	public static void main(String[] args) 
	{
		String name="varun dhawan";
		String name1="VARUN DHAWAN";
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name.length());
		System.out.println(name.charAt(6));
		System.out.println(name.concat(name1));
		System.out.println(name.equals(name1));
        System.out.println(name.equalsIgnoreCase(name1));
        System.out.println(name.subSequence(3, 9));
        System.out.println(name.startsWith("var"));
        System.out.println(name.endsWith("an"));
        System.out.println(name.trim());
        System.out.println(name.replace('n', 'k'));
        System.out.println(name.replace('v', 'r'));
        System.out.println(name.indexOf('n'));
	}

}
