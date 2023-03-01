
package daysixteen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
class JunitAnnotationsDemo {
	
	@Test
	@DisplayName(" Simple Junit Program")
	void test() {
		System.out.println(" First program");
	}
	// the test keyword is Important for every single method
	@Test
	@BeforeAll
	/*static*/ void display() {
		System.out.println(" Welcome to junit5 ");
	}
	@Test
	@AfterEach
	void accept() {
		System.out.println(" Welcome to Rasika ");
	}
	@Test
	@AfterAll
	/*suppose you want to give static so they can't show it in test series 
	SO THAT TIME WE UESD @TestInstance(Lifecycle.PER_CLASS) this line*/
	/*static */void run()
	{
		System.out.println(" Welcome to gauri");
	}
	@Test
	@BeforeEach
	void compile() {
		System.out.println(" Welcom to sonal ");
	}
}