package studymanager;

import java.util.LinkedList;

public class App2 {

	public static void main(String[] args) {
		
		
		LinkedList<String>countries = new LinkedList<>();
		countries.add("india");
		countries.add("Bangladesh");
		countries.add("japan");
		countries.add("poland");
		countries.add("usa");
		
		new App2().printList(countries);
	}
	void printList(LinkedList<String>list){
		for(String element: list){
			System.out.println("Element: " + element);
		}
		
		System.out.println("***************");
	}
  
}
