package curs6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList2Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> list = new ArrayList<>(Arrays.asList("rosu","galben","negru","albastru"));
		
	System.out.println(list.size());

	for(String culoare : list) {
	System.out.println(culoare);
	}

	list.subList(1, 3).clear();
	
	for(String culoare : list) {
	System.out.println(culoare);
	
		}
	String element = "rosu";
	
	if(list.contains(element)){
		System.out.println(element + "se afla in lista!");
	}else {
		System.out.println(element + "nu se afla in lista!");
	}
	list.set(0, "galben");
	}

}
