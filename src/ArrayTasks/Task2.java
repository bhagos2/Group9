package ArrayTasks;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      Scanner scan =new Scanner(System.in);
	        String[] country = new String [5];

	        for (int i=0; i<country.length; i++) {
	            System.out.println("Please enter the country");
	            country[i] = scan.nextLine();

	            if(country[i].equals("Bangladesh")) {
	                System.out.println("The capital of Bangladesh is Dhaka");

	            }else if(country[i].equals("USA")) {
	                System.out.println("The capital of USA is Washington DC");

	            }else if (country[i].equals("Pakistan")) {
	                System.out.println(" The capital of pakistan is Islamabad");

	            }else if(country[i].equals("England")) {
	                System.out.println("The capital of England is London");

	            }else if(country[i].equals("Afghanistan")) {
	                System.out.println("The capital of Afghanistan is Kabul");
	            }
	            System.out.println("----------------------------------------------");





	        }

	    }
	    }
