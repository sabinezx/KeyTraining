package curs4homework;

public class Vehicul {

	private String brand;
	private int nivelPoluare;
	private int vitezaMedie;
	
	
	//public Vehicul(String brand, int nivelPoluare, int vitezaMedie) {
		
		//this.brand = brand;
		//this.nivelPoluare = nivelPoluare;
		//this.vitezaMedie = vitezaMedie;
	//}

	public String nume() {
		return "vehicul";
	}
	
	public String motorizare() {
		return "Unknown";
	}
	
	public void detaliiVehicul () {
		System.out.println("Nivelul de poluare pentru masina " +getBrand() + " este " + getNivelPoluare() +" si viteza medie atinsa este " + getVitezaMedie() + " km/h");
		// : “Nivelul de poluare pentru masina Dacia este :5 si viteza
		//medie atinsa este de 180 km/h”
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNivelPoluare() {
		return nivelPoluare;
	}

	public void setNivelPoluare(int nivelPoluare) {
		this.nivelPoluare = nivelPoluare;
	}

	public int getVitezaMedie() {
		return vitezaMedie;
	}

	public void setVitezaMedie(int vitezaMedie) {
		this.vitezaMedie = vitezaMedie;
	}
	
}
