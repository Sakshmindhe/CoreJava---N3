
package daysixteen;

import static org.junit.jupiter.api.Assertions.*;
//program to demonstrate that the first JUnit5

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FirstJavaProgram {

	@Test
	@DisplayName(" Simple Junit Program")
	void test() {
		System.out.println(" First program");
	}
	// the test keyword is importent for every single method
	@Test
	void display() {
		System.out.println(" Welcome to junit5 ");
	}

}