package studymanager;

import java.util.LinkedList;

public class App4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   LinkedList<Integer>list = new LinkedList<Integer>();
   
          list.add(1);
          list.add(2);
          list.add(3);
          list.add(4);
          list.add(5);
          list.add(6);
   System.out.println(list);
   list.add(1, 2);
   System.out.println(list);
   list.remove(0);
   System.out.println(list);
   
	}

}
