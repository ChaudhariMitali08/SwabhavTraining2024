public class StringBuilderProgram {
	public static void main(String[] args) {
		StringBuilder name1 = new StringBuilder("Mitali");
		System.out.println(name1.hashCode());
		name1 = name1.append("Chaudhari");
		System.out.println(name1.hashCode());
	}
}