package ArrayTasks;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] arr= {
                {10, 20, 30, 40, 77, 97}, 
                {100, 200, 300, 400, 437, 607}, 
                {1, 2, 3, 4, 5, 7} 
        };

        for(int r=0; r<arr.length; r=r+1) { 

            for(int c=0; c<arr[r].length; c=c+1) {

                if(arr[r][c] % 2 == 0)
                    System.out.println(arr[r][c]);
            }
        }
    }


}
