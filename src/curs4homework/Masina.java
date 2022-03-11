package curs4homework;

public class Masina extends Vehicul {

	public Masina (String brand, int nivelPoluare, int vitezaMedie ) {
		this.setBrand(brand);
		this.setNivelPoluare(nivelPoluare);
		this.setVitezaMedie(vitezaMedie);
	}
	
	
	@Override
	public String motorizare() {
		// TODO Auto-generated method stub
		return "100";
	}
	
	@Override
	public String nume() {
		return "masina";
	}

}
