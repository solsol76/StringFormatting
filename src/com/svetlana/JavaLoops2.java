package com.svetlana;

import java.util.Scanner;

public class JavaLoops2 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            
	           
		        int sum = (int) (a + Math.pow(2, 0)*b);
		        String s ="" +  sum + " ";       
		       
		        
		        for(int j = 1; j < n; j++ )
		        {
		        	
		        	sum = (int) (sum + (Math.pow(2, j)*b));
		        	
		        	s = s + sum + " ";
		        	
		        }
		        
		        System.out.println(s);
	        }
	        in.close();
	        
	         

	}

}
