package curs5.tema;

import java.util.Scanner;

public class PrinteazaLuna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String[] luni = new String[] { "ianuarie", "februarie", "martie", "aprilie", "mai", "iunie", "iulie", "august",
				"septembrie", "octombrie", "noiembrie", "decembrie" };
		do {
			System.out.println("Introduceti un numar de la 1 la 12");
			int rasp = scan.nextInt();

			if (rasp > 0 && rasp < 13) {

				// System.out.println(luni.length);
				System.out.println(luni[rasp - 1]);
				break;

			} else {
				System.out.println("Numarul este invalid!");

			}

		} while (true);

	}

}
