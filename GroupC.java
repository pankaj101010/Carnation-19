package Task1;

import java.util.Scanner;

public class GroupC {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n=input.nextInt();
		for (int i = 0; i <=n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
