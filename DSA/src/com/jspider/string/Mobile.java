package com.jspider.string;

public class Mobile {
	
	static int algo1(String str) {
		char[][] arr = {
			    {' '},               
			    {'a', 'b', 'c'},     
			    {'d', 'e', 'f'},     
			    {'g', 'h', 'i'},     
			    {'j', 'k', 'l'},     
			    {'m', 'n', 'o'},     
			    {'p', 'q', 'r'},    
			    {'s', 't', 'u'},     
			    {'v', 'w', 'x'},     
			    {'y', 'z'}          
			};
		int sum=0;
	
		for(int i=0;i<str.length();i++) {
			char temp=str.charAt(i);
			for(int j=0;j<arr.length;j++) {
				for(int k=0;k<arr[j].length;k++) {
					if(arr[j][k]==temp) {
							sum+=j*(k+1);
					}
				}
			}
		}
		return sum;
	}
	
	static int algo2(String str) {
		int sum=0, count=0;
		int[] arr2= {1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2};
		
		for(int i=0;i<str.length();i++) {
			count+=arr2[str.charAt(i)-'a'];
			int digit = str.charAt(i)-'a'+1;
			if(digit<=3) sum +=count*1;
			else if(digit>=4 && digit<=6) sum+=count*2;
			else if(digit>=7 && digit<=9) sum+=count*3;
			else if(digit>=10 && digit<=12) sum+=count*4;
			else if(digit>=13 && digit<=15) sum+=count*5;
			else if(digit>=16 && digit<=18) sum+=count*6;
			else if(digit>=19 && digit<=21) sum+=count*7;
			else if(digit>=22 && digit<=24) sum+=count*8;
			else  sum+=count*9;
			count=0;
		}
		return sum;		
	}
	
	
	

	public static void main(String[] args) {
		
		
		String str="jspider";
		
		System.out.println(algo1(str));


	}

}
