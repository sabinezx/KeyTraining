package curs6;

public class ForEachExample2 {

	public static void main(String[] args) {
		String [] cities = {"Iasi", "Alba", "Cluj", "Timis"};
		
		for(String city: cities){
			
			if(city.equals("Cluj")) {
				//break; --> ma scoate din for
				continue; //face skip la conditie si continua for-ul
		}
			System.out.println("For each " + city);
		}
	}

}
