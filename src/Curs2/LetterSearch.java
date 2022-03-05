package Curs2;


import java.util.Scanner;

public class LetterSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Te rog introdu un text");
Scanner scan = new Scanner (System.in);
String text = scan.next();
scan.close();

boolean letterFound =false;
int counter = 0;

for(int i =0;i<=text.length()-1;i++) {
	char currentLetter = text.charAt(i);
	if(currentLetter == 'A'|| currentLetter == 'a') {
		System.out.println("Letter 'A' is present in text at index" +i);
		letterFound = true;
		counter++;
		//break;
	} 
}
if(letterFound) {System.out.println("Letter A is found");
System.out.println("Counter present in text "+ counter +" times");
	}else {System.out.println("Letter A not found");
		}
	}

}
