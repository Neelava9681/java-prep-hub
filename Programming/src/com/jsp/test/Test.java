package com.jsp.test;

public class Test {
	    static boolean evaluate(int left, int right, int result, String operator) {
	        switch (operator) {
	            case "+":
	                return left + right == result;
	            case "-":
	                return left - right == result;
	            case "*":
	                return left * right == result;
	            case "/":
	                return right != 0 && left / right == result;
	            default:
	                return false;
	        }
	    }
	 public static int findMissingDigit(String equation) {
	        
	        String[] parts = equation.split(" ");
	        String left = parts[0];
	        String operator = parts[1];
	        String right = parts[2];
	        String result = parts[4];

	        // Iterate through all possible digits (0-9) to replace 'x'
	        for (int i = 0; i <= 9; i++) {
	            String digit = String.valueOf(i);
	           
	            String newLeft = left.replace("x", digit);
	            String newRight = right.replace("x", digit);
	            String newResult = result.replace("x", digit);
	            
	            try {
	                
	                int leftValue = Integer.parseInt(newLeft);
	                int rightValue = Integer.parseInt(newRight);
	                int resultValue = Integer.parseInt(newResult);
	                
	          
	                if (evaluate(leftValue, rightValue, resultValue, operator)) {
	                    return i; 
	                }
	            } catch (NumberFormatException e) {
	                // Ignore invalid numbers (e.g., if x results in a leading zero)
	            }
	        }

	        return -1; // No solution found
	    }


	public static void main(String[] args) {
		System.out.println(findMissingDigit("4 - 2 = x")); // Output: 2
        System.out.println(findMissingDigit("1x0 * 12 = 1200")); // Output: 0
        System.out.println(findMissingDigit("3x + 12 = 46")); // Output: 4

	}

}
