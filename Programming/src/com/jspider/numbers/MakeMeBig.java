package com.jspider.numbers;



public class MakeMeBig {
	
	static int making(int n) {
		
		int count=0;
		int res=1;
		int num=n;
		
		while(n!=0) {
			count++;
			n/=10;
		}
		System.out.println(count);
		
		int[] arr=new int[count+1];
		
		System.out.println(num);
		for(int i=0;i<arr.length;i++) {
				int temp=num%10;
//				System.out.println(temp);
				arr[i]=temp;
				num/=10;
		}
//		System.out.println(num);
		for(int i=0;i<arr.length;i++)
			System.err.println(arr[i]);
//		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			res=res*10+arr[i];
		}
		
		return res;
		
		
	}
	
	

	public static void main(String[] args) {
		int n=4532;
		
		System.out.println(making(n));

	}

}
