import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO: 输入上次成绩(int)
		Scanner scanner=new Scanner(System.in);
		System.out.print("输入上次成绩(int):");
		int a=scanner.nextInt();
		// TODO: 输入本次成绩(int)
		System.out.print("输入本次成绩(int):");
		int b=scanner.nextInt();
		// TODO: 输出成绩提高的百分比，保留两位小数(例如:21.75%)
		System.out.printf("本次成绩比上次成绩提高了%.2f%%",(b-a)/(a*1.0)*100);
	}

}