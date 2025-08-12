package com.jspider.string;

public class SwapFirstAndLastChar {

    public static void main(String[] args) {
        String str = "hello hi bye"; // Input string
        
        String[] arr = str.split(" "); // Split the string into words
        
        String rev = ""; // Initialize the result string
        
        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];
            char[] arr2 = temp.toCharArray();
            
            // Swap the first and last characters
            char a = arr2[0];
            arr2[0] = arr2[arr2.length - 1];
            arr2[arr2.length - 1] = a;
            
            // Append the modified word to the result string
            for (int j = 0; j < arr2.length; j++) { // Fix: Increment `j` here
                rev += arr2[j];
            }
            rev += " "; // Add a space after each word
        }
        
        System.out.println(rev.trim()); // Print the result without trailing space
    }
}
