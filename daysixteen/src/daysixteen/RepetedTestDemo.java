
package daysixteen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepetedTestDemo {

	//@Test
	@RepeatedTest(5)
	void test() {
		System.out.println(" Repeted test");
	}

}