package additionalTest;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import additionalFunc.AdditionalFuncHW1;

public class AdditionalTestHW1 {

	//////  1  //////
	
	@Test
	void maxSubsequenceLengthTest() {
		int [] array1= {1,3,3,2,8,8,8,5,6,6};
		int [] array2= {};
		int [] array3= {1,2,3,4};
		int [] array4= {1,2,3,4,5};
		int [] array5= {1,3,3,2,8,8,8,5,6,6,8,8,8};
		int res1 = maxSubsequenceLength(array1);
		int res2 = maxSubsequenceLength(array2);
		int res3 = maxSubsequenceLength(array3);
		int res4 = maxSubsequenceLength(array4);
		int res5 = maxSubsequenceLength(array5);
		assertEquals(3,res1);
		assertEquals(0,res2);
		assertEquals(1,res3);
		assertEquals(1,res4);
		assertEquals(3,res5);
	}

	
	public static int maxSubsequenceLength(int[] arr) {
		int res=0;
		int count=0;
		int i;
		if (arr.length==0) 
			return res;
			else {
				for (i=0; i < arr.length-1; i++) {
					if(arr[i]==arr[i+1])
						count++;
					else {
						if(res<count) 
							res=count;
						count=0;
					}
				}
			}
		return res;
	}

	///// 2  //////
	@Test
	void toBinaryStrTest() {
		
		assertTrue(Integer.toBinaryString(5)==toBinaryStr(5));
	}
}
