package com.jspider.string;

public class Reverse {
	
	
	static void rev(String str) {
		String[] array=str.split(" ");
		for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
		
		 String result = "";
	        for (int i = 0; i < array.length; i++) {
	            result += array[i]; 
	            if (i < array.length - 1) {
	                result += " "; 
	        }
	     }
	        
	    System.out.println(result);
	}

	public static void main(String[] args) {
		String str="i am a web developer and my name is neel";
		rev(str);

	}

}
