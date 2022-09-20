package ArrayTasks;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] num= {-1,200,200, -3, 30,55,88,400};
         int max=num[0];
         int   min=num[0]; 
         for (int n:num) {
             if(n>max) {max=n;}
             if (n<min) {min=n;}
         }; 

         System.out.println("the max number in this array is"+ max);
         System.out.println("the min number in this array is"+ min);

         // 2d array additional example

	}
}