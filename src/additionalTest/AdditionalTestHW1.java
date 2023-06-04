package additionalTest;
//import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
//import java.util.Arrays;
import org.junit.jupiter.api.Test;
import additionalFunc.AdditionalFuncHW1;
//import additionalFunc.AdditionalFuncHW1.*;
public class AdditionalTestHW1 {

	//////  1  //////
	
	@Test
	void maxSubsequenceLengthTest() {
		int [] array1= {1,3,3,2,8,8,8,5,6,6};
		int [] array2= {};
		int [] array3= {1,2,3,4};
		int [] array4= {1,2,3,4,5};
		int [] array5= {1,3,3,2,8,8,8,5,6,6,8,8,8};
		int res1 = AdditionalFuncHW1.maxSubsequenceLength(array1);
		int res2 = AdditionalFuncHW1.maxSubsequenceLength(array2);
		int res3 = AdditionalFuncHW1.maxSubsequenceLength(array3);
		int res4 = AdditionalFuncHW1.maxSubsequenceLength(array4);
		int res5 = AdditionalFuncHW1.maxSubsequenceLength(array5);
		assertEquals(3,res1);
		assertEquals(0,res2);
		assertEquals(1,res3);
		assertEquals(1,res4);
		assertEquals(3,res5);
	}

	
	///// 2  //////
	@Test
	void toBinaryStrTest() {
		assertEquals(Integer.toBinaryString(Integer.MAX_VALUE) , AdditionalFuncHW1.toBinaryStr(Integer.MAX_VALUE));
		assertEquals(Integer.toBinaryString(16) , AdditionalFuncHW1.toBinaryStr(16));
		assertEquals(Integer.toBinaryString(0) , AdditionalFuncHW1.toBinaryStr(0));
		assertEquals(Integer.toBinaryString(5) , AdditionalFuncHW1.toBinaryStr(5));
	}
}
