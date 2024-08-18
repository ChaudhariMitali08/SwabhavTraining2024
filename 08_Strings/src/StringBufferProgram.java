
public class StringBufferProgram {
	public static void main(String[] args) {
		StringBuffer name1 = new StringBuffer("Mitali");
		System.out.println(name1.hashCode());
		name1 = name1.append("Chaudhari");
		System.out.println(name1.hashCode());
	}
}
