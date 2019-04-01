import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner scanner = input();
		System.out.print("Input your name: ");
		try{
			String name = scanner.nextLine();
			System.out.print("Input your age: ");
			int age = scanner.nextInt();
			System.out.println("Hi, " + name + ", you are " + age);
		}catch(Exception e){
			System.out.println("age must be a number!");
		}
		
		
	}
	
	static Scanner input(){
		return new Scanner(System.in);
	}

}
