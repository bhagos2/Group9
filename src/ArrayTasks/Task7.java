package ArrayTasks;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 boolean group9 = false;
	        int number = 2;
			for (int k = 2; k <= number / 2; k++) {
	         if (number % k == 0) {
	         group9 = true;
	         break;
	          }
	          }
	         if (!group9)
	          System.out.println( "This is a prime number: "+number);
	        else
	          System.out.println(" This is not a prime number:  "+ number);
		
	}

}
