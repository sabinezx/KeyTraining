package curs4;

public class RoomCalculator {

	public static void main(String[] args) {

		Rectangle obiect =  new Rectangle();
		obiect.calculeazaAria();
		obiect.calculeazaPerimetru();
		
		//System.out.println(obiect.calculeazaAria());
		
		//System.out.println(obiect.nume());
		
		System.out.println(obiect.calculeazaPerimetru());
		//obiect.calculeazaPerimetru() = 8
		int num3 = obiect.calculeazaPerimetru() + 2;
		
		System.out.println(num3);
		System.out.println("string");
		System.out.println('c');
		
		obiect.metoda1(12);
		obiect.metoda1('c');
		obiect.metoda1("String");
		
		
		
		Rectangle obiect2 =  new Rectangle(3,3);
		obiect2.calculeazaAria();
		System.out.println(obiect2.calculeazaPerimetru());
		
	}

}
