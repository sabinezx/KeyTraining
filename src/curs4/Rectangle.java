package curs4;

public class Rectangle {
	
	//variable
	//private --> inseamna ca sunt disponibile doar in interiorul clasei in care se afla
	private int lenght;//0
	private int width; //0
	
	
	//contructorul defaul pe care daca nu il scriem il scrie JAVA
	public Rectangle() {}
	
	//contructor cu parametrii
	public Rectangle(int num1, int num2) {
		setLenght(num1);// method call
		setWidth(num2);
	}
	
	//getter --> metode specifice care returneaz valoarea unei variabile privata
	public int getLenght() {
		return lenght;
	}
	//setter --> metode specifice care seteaza valoarea unei variabile privata
	private void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getWidth() {
		return width;
	}
	private void setWidth(int width) {
		this.width = width;
	}
	
	//metoda java  accesmodifier(public) returnType(void) numeMetoda(aici se afla parametrii metodei) { aici se afla logica metodei}
	//void --> inseamna ca nu returneaza nimic
	// metoda asta va fi chemata:  numeObj.calculeazaAria() -->type este obiect
	public void calculeazaAria() {
	
		System.out.println("Aria este:" + lenght * width);

	}

	//metoda java
	//return int
	// metoda asta va fi chemata:  numeObj.calculeazaPerimetru() -->type este int
	//la exectuie numeObj.calculeazaPerimetru() = (2*lenght) + (2*width) = 8;
	public int calculeazaPerimetru() {
		
		return(2*lenght) + (2*width);
	}
	
	public String nume() {
		return "Ceva";
		
	}
	
	public void metoda1(String text) {
		System.out.println(text);
	}
	
	public void metoda1(int num) {
		System.out.println(num);
	}
	
	
	

}
