/*
 * Created by Liam Gowan - B00673126 
 * CSCI 3130 
 * February 25th, 2017
 * 
 * This tests the class EmailChecker.java
 */

package email_validator.email_validator;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailCheckerTest {

	
	//The following tests are to test that the email contains only one '@'
	//This one tests for one '@' sign - Should be True
	@Test
	public void testEmailOneAtSign() {
		EmailChecker testEmail = new EmailChecker();
		assertTrue(testEmail.containsOneAt("liam@dal.ca"));
	}
	//This tests for zero '@' signs - Should be False
	@Test
	public void testEmailZeroAtSign() {
		EmailChecker testEmail = new EmailChecker();
		assertFalse(testEmail.containsOneAt("liamdal.ca"));
	}
	//Tests for multiple '@' signs - Should be false
	@Test
	public void testEmailTwoAtSign() {
		EmailChecker testEmail = new EmailChecker();
		assertFalse(testEmail.containsOneAt("liam@@dal.ca"));
	}
	
	//The following tests are to test that the email contains at least one '.'
	//This one tests for zero '.' sign - Should be False
	@Test
	public void testZeroPeriods() {
		EmailChecker testEmail = new EmailChecker();
		assertFalse(testEmail.containsPeriod("liam@dalca"));
	}
	//This one tests for one '.' sign - Should be True
	@Test
	public void testOnePeriod() {
		EmailChecker testEmail = new EmailChecker();
		assertTrue(testEmail.containsPeriod("liam@dal.ca"));
	}
	//This one tests for multiple '.' signs - Should be True
	@Test
	public void testTwoPeriods() {
		EmailChecker testEmail = new EmailChecker();
		assertTrue(testEmail.containsPeriod("liam@dal.cs.ca"));
	}
	
	//The following tests to see if an email is valid. 
	//A valid email should have an integer 2 returned when tested for.
	
	//Tests for 0 '@'s and 0 '.'s, - Should be 0, for an invalid email
	@Test
	public void test0Q0P(){
		EmailChecker testEmail = new EmailChecker();
		assertEquals(0, testEmail.validate("liamdalca"));
	}
	
	//Tests for 0 '@'s and 1 '.', - Should be 1, for an invalid email
	@Test
	public void test0Q1P(){
		EmailChecker testEmail = new EmailChecker();
		assertEquals(1, testEmail.validate("liamdal.ca"));
	}
	
	//Tests for 0 '@'s and 2 '.'s, - Should be 1, for an invalid email
	@Test
	public void test0Q2P(){
		EmailChecker testEmail = new EmailChecker();
		assertEquals(1, testEmail.validate("liamdal.cs.ca"));
	}
	
	//Tests for 1 '@'s and 0 '.'s, - Should be 1, for an invalid email
	@Test
	public void test1Q0P(){
		EmailChecker testEmail = new EmailChecker();
		assertEquals(1, testEmail.validate("liam@dalca"));
	}
	
	//Tests for 2 '@'s and 0 '.'s, - Should be 0, for an invalid email
	@Test
	public void test2Q0P(){
		EmailChecker testEmail = new EmailChecker();
		assertEquals(0, testEmail.validate("liam@@dalca"));
	}
	
	//Tests for 2 '@'s and 1 '.'s, - Should be 0, for an invalid email
	@Test
	public void test2Q1P(){
		EmailChecker testEmail = new EmailChecker();
		assertEquals(1, testEmail.validate("liam@@dal.ca"));
	}
	
	//Tests for 1 '@'s and 1 '.'s, - Should be 2, for a valid email
	@Test
	public void test1Q1P(){
		EmailChecker testEmail = new EmailChecker();
		assertEquals(2, testEmail.validate("liam@dal.ca"));
	}
	
	//Tests for 1 '@'s and 2 '.'s, - Should be 2, for a valid email
	@Test
	public void test1Q2P(){
		EmailChecker testEmail = new EmailChecker();
		assertEquals(2, testEmail.validate("liam@dal.cs.ca"));
	}
	
	
	

}