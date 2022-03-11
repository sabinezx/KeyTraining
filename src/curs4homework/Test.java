package curs4homework;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicul masina = new Masina("Dacia", 5, 100);
		Vehicul bicicleta = new Bicicleta("Pegas", 0, 10);
		
		
		Test test = new Test();
		test.verificaMotorizare(masina);
		test.verificaMotorizare(bicicleta);
		masina.detaliiVehicul();
		bicicleta.detaliiVehicul();
		
			
	}
	public void verificaMotorizare(Vehicul v) {
		
		System.out.println("Motorizarea este " + v.motorizare() + " pentru " + v.nume());
	}

}
