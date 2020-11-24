package studymanager;

import java.util.ArrayList;

public class App {

	
static	ArrayList <String>ListNames = new ArrayList<>();

	public static void main(String[] args) {
		
		ListNames.add("ratan");
		ListNames.add("anand");
		ListNames.add("salim");
		ListNames.add("karim");
		ListNames.add("rahim");
		ListNames.add("chaand");
		
		
		App app = new App();
		app.displayList(ListNames);
		System.out.println(ListNames);
		app.removeNameByPosition(0);
		System.out.println("**************");
		System.out.println(ListNames);

	}
	
	void displayList(ArrayList<String>names){
		
	}
	void removeNameByPosition(int position){
		ListNames.remove(position);
	}

}
