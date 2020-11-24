package studymanager;

import java.util.Stack;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stack<Integer>demo = new Stack<>();
       
       
       demo.push(0);
       demo.push(1);
       demo.push(2);
       demo.push(3);
       demo.push(4);
       demo.push(100);
       
     /*  for(Integer temp:demo){
    	   System.out.println(temp);
       }*/
       
       if(demo.isEmpty()){
    	   System.out.println("stack is empepty");
       }	   else{
    	   System.out.println("stack is not empty");
    		   
       
       }
       System.out.println(demo.search(100));
       
	}

}
