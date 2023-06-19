package additionalFunc;
import java.lang.reflect.Array;
import java.util.Stack;
import java.util.Arrays;

public class AdditionalFuncHW1 {
	
///////  1  //////
	
//////////////////////////////////////////////
//Longest Subsequence
//
//Write method 
//public static int maxSubsequenceLength(int[] arr)
//
//The method accepts array of integers and returns 
//the length of longest sub-sequence, consisting of repeating number.
//
//For example, if input is
//1,3,3,2,8,8,8,5,6,6
//the result is 3 - the length of longest subsequence 8,8,8
//
//The non-repeating number would  be considered as "subsequence of length 1".
//The result for empty array would be 0.
//
//Think how to write it in one pass through array.
//
//Implement the tests.
	
	public static int maxSubsequenceLength(int[] arr) {
		int res=1;
		int count=1;
		int i;
		if (arr.length==0) 
			return 0;
			else {
				for (i=0; i < arr.length-1; i++) {
					if(arr[i]==arr[i+1])
						count++;
					else 
						if(res<count) {
							res=count;
							count=1;
						}
									
				}
			}
		return res;
	}
	///// 2 ////
	//1) Write class NumberConvertor with method toBinaryStr, as follows:
	//
    //	    public static String toBinaryStr(int number)
	//
	//   which converts non-negative integer number to String with binary form of the given number.
	//   Please DON'T use the existing method Integer.toBinaryString()
	//
	//2) Write tests checking the proper work of toBinaryStr() method with different numbers,
	//   comparing its results with results of Integer.toBinaryString()
	public static String toBinaryStr(int number) {
		String str  = "";
		do {
			str = number%2 + str;
			number = number/2;
		} while (number > 0);
		return str;
	}
	
	///////task 02  ( 01 )///////// AD-03///////////////////
	
	public static boolean isAnagram (String str1, String str2) {
		if ( str1.length() != str2.length()) {
			return false;
		}
		
		String lowStr1 = str1.toLowerCase();
		String lowStr2 = str2.toLowerCase();
		int len = str1.length();

		// Declare helper array for letter counters   
		int [] helper = new int[26];

		// Count all letters at str1
		for (int i = 0; i < len; i++) {
			int helperIndex = letterIndex(lowStr1.charAt(i));
			if (helperIndex < 0 || helperIndex > 25)
				return false;
			++helper[helperIndex];
		}
		
		// Go over all letters in str2
		for (int i = 0; i < len; i++) {
			int helperIndex = letterIndex(lowStr2.charAt(i));
			if (helperIndex < 0 || helperIndex > 25)
				return false;
			--helper[helperIndex];
			if (helper[helperIndex] < 0)
				return false;
		}
		
		return true;
	}
	
		
	public static int letterIndex(char letter)
	{
	    return (int)letter - (int)'a';
	}

	
	
	////////////// AD-04 ////////////////////
	
	public static boolean hasValidBrackets(String text) {
		
		Stack<Integer> stack = new Stack<>();
		
		for (int i= 0; i < text.length(); i++ ) {
		
			// Get next char from string
			char letter = text.charAt(i);
			// Check if the char is a bracket
			int bracketType = getBaracketType(letter);
			if (bracketType == 0)
				continue; // The char is not a bracket
			
			// If we got closing bracket (negative type) and the stack is empty
			// then expression is invalid
			if (stack.isEmpty() && (bracketType < 0))
				return false;
			
			if (bracketType > 0) {  // Opening bracket
			
				stack.push(bracketType);
			}
			else { // closing bracket
				// retrieve last opening bracket from the stack
				int lastBracketType = stack.pop();
				// check if the type of the last opening bracket comply
				// to the type of the current closing bracket
				if ((bracketType + lastBracketType) != 0)
					return false; // closing bracket doesn't comply to the last open bracket
			}
			
		}
		
		return stack.isEmpty();
	}
	
	// The function returns bracket type or zero if the char is not bracket
	static int getBaracketType(char letter) {
		switch(letter) {
		case '(':
			return 1;
		case ')':
			return -1;
		case '[':
			return 2;
		case ']':
			return -2;
		case '{':
			return 3;
		case '}':
			return -3;
		}
		return 0;
	}
	
	/////////////// AD-04  stack free  ///////////
	
	public static boolean hasValidBracketsFree(String text) {
		int ind = 0;
		//boolean res = false;
		if( text.isEmpty())
			return true;
		if( text.charAt(0) == ')' || text.charAt(0) == ']' || text.charAt(0) == '}'  )
			return false;
		char [] helper = new char [text.length()];
		for (int i= 0; i < text.length(); i++ ) {
			char letter = text.charAt(i);
			// Check if the char is a bracket
			if (letter != ')' && letter != ']' && letter != '}' && letter != '(' && letter != '[' && letter != '{' )
				continue; // The char is not a bracket 
			if (letter == '(' || letter == '[' || letter == '{') {
				helper[ind] = letter ;
				ind++;
			}		
			else {
				if (letter == ')') {
					if(helper[ind - 1] == '(') 
						ind--;
					else 
						return false;
				}
				else if (letter == ']') {
					if (helper[ind - 1] == '[') 
						ind-- ;
					else 
						return false;
				}
				else if (letter == '}') {
					if (helper[ind - 1] == '{' ) 
						ind-- ;
					else
						return false;
				}					
											
			 }
		}
		return ind == 0 ? true : false;
	}
	
	
	
	
	
}
	


