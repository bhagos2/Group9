package ArrayTasks;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int x = 10;//20
        int y = 20;//10
        System.out.println("first x ="+x );
        System.out.println("first y ="+y );

        // put y into x and x put in to y

        x=x+y; 
        y=x-y; 
        x=x-y; 
         System.out.println("Second x = "+x);
        System.out.println("Second y = "+y);
    }


}
