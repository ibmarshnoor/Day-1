import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMath {
      Math math;
      @BeforeEach
      void init() {
    	  math=new Math();
      }
	@Test
	void testAdd() {
		int result = math.add(1,2,3);
		Assert.assertEquals(6, result);
	}
	@Test
     void testAddWithNegativeNumbers() {
    	 int result1=math.add(-1,-2,-3);
    	 Assert.assertEquals(-6, result1);
     }
     @Test
     void testMultiply() {
    	 int result2=math.multiply(2,3);
    	 Assert.assertEquals(6,result2);
     }
     @Test
	 void testMultiplwithOneZero() {
    	 int result2=math.multiply(1,0);
    	 Assert.assertEquals(0,result2);
     }
	 @Test
	 void testMultiplyWithOneNegative() {
		 Exception exception = assertThrows(IllegalArgumentException.class,()->{
    	 math.multiply(-2,8);
	 });
}
}