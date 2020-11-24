package studymanager;

import java.util.ArrayList;

public class App3 {
	
	static ArrayList<String>listNames = new ArrayList<>();


	public static void main(String[] args) {
		
		listNames.add("annad");
		listNames.add("rahul");
		listNames.add("karim");
		listNames.add("rahim");
		listNames.add("pooja");
		
		App3 app = new App3();
		app.displaylist(listNames);
		System.out.println("**************");
		int position =  app.search("pooja");
		
		if(position !=-1){
			app.modifyNames(position, "Emma");
			app.displaylist(listNames);
			
		}else{
			System.out.println("invalid entry");
		}
	}
	
   void displaylist(ArrayList<String>names){
	   
	   for(String name: names){
		   System.out.println(names);
	   }
   }
   
   void modifyNames (int position,String newName){
	   listNames.set(position, newName);
   }
	   
	   int search(String name){
		   return listNames.indexOf(name);
	   }
   }

