package com.jun;

public class Prime {

	public static void main(String[] args) {
		boolean Prime;
		  
		  for(int i = 2;i <= 1000;i++){
		   Prime=true;
		   
		   for(int j = 2;j < i;j++){

		    if(i % j==0){
		     Prime=false;
		    
		    }
		   }
		   
		   if(Prime){
		    System.out.print( i +" ");
		    
		   }
		   
		  }

	}
}
