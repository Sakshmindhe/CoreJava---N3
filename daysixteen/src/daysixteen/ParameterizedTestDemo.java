
package daysixteen;

import static org.junit.jupiter.api.Assertions.*;
//program to demonstrate that parameterized test

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestDemo {

	//@Test
	@ParameterizedTest
	@ValueSource(strings={"Rasika","Gauri"})
	void test() {
		System.out.println(" Hello ");
	}
	
	@ParameterizedTest
	@ValueSource(strings={"Rasika","Gauri"})
	void accept(String str) {
		assertNotNull(str);
	}

}