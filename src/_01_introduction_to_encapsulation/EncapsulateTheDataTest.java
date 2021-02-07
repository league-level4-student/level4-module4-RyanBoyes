package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulateTheDataTest {

	@Test
	void testReceived() {
		assertEquals(0, EncapsulateTheData.getItemsReceived());
		assertEquals(50, EncapsulateTheData.getDegreesTurned());

	}

}



