package studymanager;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App5 {

	public static void main(String[] args) {
	List<String>countries = new LinkedList<>();
	countries.add("India");
	countries.add("Bangladesh");
	countries.add("Egypt");
	countries.add("Thiland");
	countries.add("Poland");
	new App5().printList(countries);
	

	}
	void printList(List<String>list){
		ListIterator<String> iterator = list.listIterator();
		
		while(iterator.hasNext()){
			System.out.println("Element:"+ iterator.next());
		}
	}

}
