package curs6;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     List <String> list = new ArrayList <>();
    
     System.out.println(list.size());
     
     list.add("Andrea");
     list.add("Ralu");
     list.add("Flori");
     list.add("Diana");
    
     
     System.out.println(list.size());
     System.out.println(list.get(0));
     
     System.out.println("--------------------");
     for (String nume: list) {
    	 System.out.println(nume);
     }
     System.out.println("Adaugat David----------------");
     
     list.add(0, "David");
     System.out.println(list.size());
     
     for (String nume: list) {
    	 System.out.println(nume);
     }
     
     System.out.println("Dupa stergere David----------------");
     	list.remove(0);
     	list.remove("Maria");
     	
     	System.out.println(list.size());
        
        for (String nume: list) {
       	 System.out.println(nume);
        }
	}
	

}
