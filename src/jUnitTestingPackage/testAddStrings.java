package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitFunction junitString = new jUnitFunction();
		String result = junitString.addStrings("Capstone", "Project");
		assertEquals("CapstoneProject",result);
	}

}
