package curs3.mostenire;

public class TesterInheritance extends TesterAutomat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TesterAutomat tester = new TesterAutomat();
		
		tester.setProgrammingLanguage("Java"); // clasa Tester Automat
		tester.setDepartment("QA"); // clasa tester 
		tester.setSeniority("Junior");// clasa Tester
		tester.setEmail("tester@g.mail"); // clasa Angajat
		tester.setName("Tester"); // clasa Angajat
		
		
		
		System.out.println("Numele angajatului "+tester.getName());

	}

}
