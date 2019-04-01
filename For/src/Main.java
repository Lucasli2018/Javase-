
public class Main {

	public static void main(String[] args) {
		int[] ns = { 1, 4, 9, 16, 25 };
		for (int i = 0; i < ns.length; i++) {
			System.out.println(ns[i]);
		}
		System.out.println("foreach---------->");
		//foreach
		for (int i :ns) {
			System.out.println(i);
		}
	}

}
