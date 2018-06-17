
public class  Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal myCal = new Cal();
		 System.out.println("Adding 5 and 4 = "+myCal.addition(5, 4));
		
		 System.out.println("10 divided by 2 = "+ myCal.division(10,2));
		 
		 System.out.println("7 multiplied with 2 = "+ myCal.multiplication(7,2));
		 
	}
	public int addition(int x, int y) {
		int A = x;
		int B = y;
		int total1 = A + B;
		return total1;

	}

	private int division(double x, double y) {
		return (int) (x/y);

	}

	public double multiplication(double X, double Y)
		   {
			   double D= X *Y;
			   return D;
			  
		   }

}
