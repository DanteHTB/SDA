package ro.unitbv.prelucrare;

import java.util.Arrays;

public class AddNumberEx1 {

      public int[] addX(int n, int arr[], int x, int pos) 
	    { 
	        int i; 
	  
	      
	        int newarr[] = new int[n+1];
	  
	     
	        for (i = 0; i < pos; i++) 
	            newarr[i] = arr[i]; 
	       
	  
	        newarr[pos] = x;
	        
	        for (i = pos+1; i <= n; i++) 
	  
	            newarr[i] = arr[i-1]; 
	    
	      
	  
	        return newarr; 
	    } 
}
