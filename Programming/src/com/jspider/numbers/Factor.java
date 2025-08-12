package com.jspider.numbers;

class Factor{
    public static void main(String args[]){
        int n=13;
        int count=0;
        System.out.println(1);
        for(int i=2 ; i<=n/2; i++){
            if(n%i==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(n);
        System.out.println("The factores available is :"+(count+2));
    }
}
