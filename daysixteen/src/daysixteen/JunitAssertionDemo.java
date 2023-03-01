
package daysixteen;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;
//program to demonstrate that assert equals

class JunitAssertionDemo {

	@Test
	void test() {
		assertEquals(12,12);
	}
	
	//assertFalse Requires the expression
	@Test
	void display() {
		assertFalse(12==1);
	}


}