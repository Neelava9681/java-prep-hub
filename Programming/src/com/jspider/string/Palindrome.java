package com.jspider.string;

public class Palindrome {

    static boolean check(String str) {
        String val = "";
        for (int i = 0; i < str.length(); i++) {
            val = str.charAt(i) + val; 
        }
        System.out.println("Reversed String: " + val);
        if (str==val) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "cac";
        System.out.println(check(str)); 
        String str2 = "cac";
        System.out.println(str.equals(str2));
        System.out.println(str == str2); 
    }
}
