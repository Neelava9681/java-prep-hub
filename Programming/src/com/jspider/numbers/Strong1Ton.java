package com.jspider.numbers;

//public class Strong1Ton {
//	static int fact(int n) {
//		int mul=1;
//		while(n!=1) {
//			mul*=n;
//			n-=1;
//		}
//		
//		return mul;
//	}
//	
//	
//	static boolean strong(int n) {
//		int res=n;
//		int sum=0;
//		while(n!=0) {
//			int temp=n%10;
//			sum+=fact(temp);
//			n/=10;
//		}
//		
//		return res==sum;
//	}
//
//
//	public static void main(String[] args) {
//		int a=2;
//		int b=146;
//		
//		for(int i=a; i<=b; i++) {
//			if(strong(i)) {
//				System.out.println(i);
//			}
//		}
//		System.out.println(strong(145));
//		
//
//	}
//
//}


////it is the efficient way cause the previous one cal the fact method every time

public class Strong1Ton {

    static int[] factorials = new int[10];

    // Precompute factorials for digits 0-9
    static void computeFactorials() {
        factorials[0] = 1;
        for (int i = 1; i < 10; i++) {
            factorials[i] = i * factorials[i - 1];
        }
    }

    static boolean strong(int n) {
        int res = n;
        int sum = 0;
        while (n != 0) {
            int temp = n % 10;
            sum += factorials[temp];
            n /= 10;
        }
        return res == sum;
    }

    public static void main(String[] args) {
        computeFactorials();  // Precompute factorials once

        int a = 2;
        int b = 146;

        for (int i = a; i <= b; i++) {
            if (strong(i)) {
                System.out.println(i);
            }
        }
    }
}
