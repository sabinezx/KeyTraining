package curs6;

import java.util.Scanner;

public class ForEachExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean condition = true;
		
		while (condition) {
	 
			int dice1 = (int)(Math.random()*6+1);
			int dice2 = (int)(Math.random()*6+1);
			int sum = dice1+dice2;
			
			System.out.println("Ai dat " + sum);
			
			if(sum==2 || sum == 6 || sum ==12) {
				System.out.println("Imi pare rau ai dat: " + sum + "Ai pierdut partida!");
				break;
			}
			else if (sum==7 || sum == 11 ) {
				System.out.println("Ai dat: " + sum + "Ai castigat!");
				break;
				
			}
			else if (sum==3 || sum == 10 ) {
				System.out.println("Ai dat: " + sum + "Ai castigat!");
				continue;
				
			}
			
			
			//Math.random returneaza valoare de tip double
			
			System.out.println("Mai dai o data?");
			Scanner scan = new Scanner(System.in);
			condition = scan.nextBoolean();
			
		}
	}
	
}
