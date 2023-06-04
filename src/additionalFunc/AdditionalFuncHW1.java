package additionalFunc;
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
}
