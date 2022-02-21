package anagramas;

import java.util.ArrayList;

public class Anagramas {

	public static void main(String[] args) {
		
		/*
		 * : [o, o]  ,    [ov, vo] 
          [[0], [2]], [[0, 1], [1, 2]] respectivamente.
		 */
		
		String palavra = "ifailuhkqq";
		
	    ArrayList<String> anagramas = new ArrayList<String>();
	    
	    String inicio ="";
	    String fim="";
	    
	   // char lastChar = palavra.charAt(palavra.length() - 1);

       // System.out.println("Last char: " + lastChar);

	    
	    for(int i = 0; i <palavra.length(); i++) {
	    	
	        for(int j = 1; j < palavra.length(); j++) {
	        	
	          if (palavra.charAt(i) == palavra.charAt(j) && i !=j && i < j) {
	        	  
	        	  System.out.println("achou igual [" + palavra.charAt(i) + "]" + "[" + palavra.charAt(j) + "]"+
	        			  "-------["+i +"]" + "["+j+"]");  
	        	  System.out.println("substring - i,j - " + palavra.substring(i,j));
	        	  anagramas.add(palavra.substring(i,j).toString());
	        	  System.out.println(anagramas);
	        	 
	          }
	        }
	    }
	    

}

		 
		 
		
	}
		 
  