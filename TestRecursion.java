

public class TestRecursion {
	
	public static void main (String [] args) {
		
	
	
		Recursion x = new Recursion ();
		
	System.out.println(x.power(2,3));
	
	System.out.println(x.sum(5));
	
	
	try {
		int a = x.factorial(5) ;
		System.out.println(a);
		}
	catch(Exception e) {
			System.out.println("Error");
		}
	
	
	int []f;
	f = new int [3];
	f[0]=10;
	f[1]=20;
	f[2]=30;
	
	
	x.print(f, 2);
	
	
	
	
	
	
	
	
	}
	

}
