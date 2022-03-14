package curs6;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arrayNumbers = {10, 20, 30, 40, 50};
for (int i =0; i<arrayNumbers.length; i++) {
	System.out.println(arrayNumbers[i]);
}
for(int num: arrayNumbers){
	System.out.println("For each " + num);
}
	}

}
