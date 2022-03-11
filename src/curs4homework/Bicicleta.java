package curs4homework;

public class Bicicleta extends Vehicul{
	
public Bicicleta (String brand, int nivelPoluare, int vitezaMedie ) {
	this.setBrand(brand);
	this.setNivelPoluare(nivelPoluare);
	this.setVitezaMedie(vitezaMedie);
}
@Override
public String motorizare() {
	// TODO Auto-generated method stub
	return "10";
}

@Override
public String nume() {
	return "bicicleta";
}


}
