package studymanager;

public class App8 {

	
	int[] m1(){
		System.out.println("this is m1 method");
		int []a = {10,20,30,40};
		return a;
		
	}
	
	void m2(double[]b){
		System.out.println("this is m2 method");
		
		for(double dd:b)
			System.out.println(dd);
		
	}
	
	public static void main(String[] args) {
	
		App8 app = new App8();
		app.m1();
		int[] x=app.m1();
	//	System.out.println(x);
		for(int xx:x){
			System.out.println(xx);
		}
		
		double[]b={10.4,20.5,30.6};
		app.m2(b);
		
		
		
	}

}
