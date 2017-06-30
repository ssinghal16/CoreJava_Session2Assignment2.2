/*Write a program to print the following pattern:

	   a
	  aba
	 abcba
      	  aba
           a
 */
//Package deckaration 
package com.acadgild.assignment2;
//Class declaration 
public class Assignmnet2 {

	//Main Method 
	public static void main(String[] args) {
		int j;
		for(int i = 1; i <= 3; i++) //for 3 loops
		{
			for(j = 1; j <= 4-i; j++) //for spaces
				System.out.print(" ");
			for(j = 1; j <= 2*i-1; j++)
				if(j <= i)
					System.out.print((char)(char)(j+96)+""); //for printing values
				else
					System.out.print((char)(char)(2*i-j+96)+"");
					System.out.println(); //for line break
		}
		
		for(int i1 = 2; i1 >= 1; i1--) //for 3 loops
		{
			for(int j1 = 1; j1 <= 4-i1; j1++)
				System.out.print(" "); //for spaces
				for(int j1 = 1; j1<= 2*i1-1; j1++)
					if(j1 <= i1)
						System.out.print((char)(char)(j1+96)+""); //for printing values
					else
						System.out.print((char)(char)(2*i1-j1+96)+""); //for printing values
						System.out.println(); //for line break
		}
	
	}
	

}
