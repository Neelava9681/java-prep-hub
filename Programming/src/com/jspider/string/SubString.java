package com.jspider.string;

import java.util.Scanner;

public class SubString {
    public static void getSmallestAndLargest(String s, int k) {
        String smallest = "";
        
        String largest = "";
        for(int i=0; i<k;i++){
            smallest+=s.charAt(i);
        }
        int count=1;
        int i=s.length()-1;
        
        while(count!=k+1){
            char ch=s.charAt(i);
            largest=largest+ch;
            i--;
            count++;
        }
       
     
        
       System.out.println(largest);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        getSmallestAndLargest(s, k);
    }
}