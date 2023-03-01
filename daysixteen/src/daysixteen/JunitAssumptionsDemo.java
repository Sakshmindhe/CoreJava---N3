
package daysixteen;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class JunitAssumptionsDemo {

	@Test
	void test() {
		Assumptions.assumeTrue(false);
		//Assumptions.assumeTrue(12==1);
	}
	@Test
	void display() {
		//Assumptions.assumeFalse(false);
		Assumptions.assumeFalse(12==1);
	}

}