
public class Main1 {

	public static void main(String[] args) {
		String[] names = { "Java", "Python", "Ruby", "PHP" };
		/*
		TODO: 请输出“序号: 名称”，即：
		  1: Java
		  2: Python
		  3: Ruby
		  4: PHP
		序号从1开始
		*/
		// for (...) {
		// }
		for (int i = 0; i < names.length; i++) {
			System.out.printf("%d: %s\n",i+1,names[i]);
		}
	}

}
