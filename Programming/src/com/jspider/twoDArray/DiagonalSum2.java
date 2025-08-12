package com.jspider.twoDArray;
import java.util.Scanner;
public class DiagonalSum2 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int a,b;
		int sum=0;
		a=sn.nextInt();
		b=sn.nextInt();
		int[][] arr=new int[a][b];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sn.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if((i==j)||(i+j==arr.length-1)) {
					sum +=arr[i][j];
				}
			}
		}
		System.out.println(sum+"it is");
		sn.close();
	}
}
