package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ObjectInputStream.GetField;

import org.junit.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private static int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private static float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private static String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private static Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	
	static int getItemsReceived() {
		
			return itemsReceived;
	}
	
	static void setItemsReceived(int received) {
		if(received<0) {
			EncapsulateTheData.itemsReceived = 0;
		}
		else {
			EncapsulateTheData.itemsReceived = received;
		}
	}
	static float getDegreesTurned() {
		return degreesTurned;
	}
	static void setDegreesTurned(float degrees) {
		if(degreesTurned>0&&degreesTurned<360) {
			EncapsulateTheData.degreesTurned = degrees;
		}
	}
	
	
}
