package Curs2;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
Scanner scan = new Scanner(System.in);


do {
	System.out.println("Enter a number: ");
	num = scan.nextInt();
	System.out.println(num*10);
}while(num!=0);
	}

}
