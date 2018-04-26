
public class Recursion {
	
	public int power ( int base , int exp) {
		
		if( exp == 0 ) {
			return 1;
		 }
		
	     return base * power(base , exp-1); 
	}
	
	public int sum (int number )	{
		
		if(number == 0) {
			return 0;
		}
		
		return number+sum(number-1);
	}
	
	public int factorial ( int number) {
		
		if( number == 1 ) {
			return 1;
		}
		
		return number * factorial(number-1);
		
	}
	
	public void print (int [] arr , int index) {
		
		if(index < 0 ) {
			return;
		}else {
			print(arr, index -1 );
			System.out.println(arr[index]);
			}
		
        }

   }
