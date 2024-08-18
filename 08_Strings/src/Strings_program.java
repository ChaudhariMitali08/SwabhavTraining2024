
public class Strings_program {
	public static void main(String[] args) {
		String name3 = "B";
		System.out.println(name3.hashCode());
		name3 = name3 + "M";
		System.out.println(name3.hashCode());
		
		 String name1 =new String("AT");
		 String name2 =new String("AT");
		 System.out.println(name1.hashCode());
		 System.out.println(name2.hashCode());
		System.out.println(name1 == name2);

	}

}
