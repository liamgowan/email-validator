/*
 * Created by Liam Gowan - B00673126 
 * CSCI 3130 
 * February 25th, 2017
 * 
 * This tests to see if an email address is valid. It is valid if it
 * has only one '@', and at least one '.'
 */

package email_validator.email_validator;

public class EmailChecker {

	//tests to ensure there is only one '@' sign. Returns true if so
	public boolean containsOneAt(String email){
		int atCounter=0;
		for(int i=0; i<email.length();i++)
			if(email.charAt(i)=='@')
				atCounter++;
		if(atCounter==1)
			return true;
		return false;
	}
	
	//tests to ensure there is at least one '.' sign. Returns true if so
	public boolean containsPeriod(String email){
		if(email.contains("."))
			return true;
		return false;
	}
	
	//Tests to see how many passes the email passes and returns the amount
	public int validate(String email){
		int count = 0;
		if(containsOneAt(email))
			count++;
		if(containsPeriod(email))
			count++;
		return count;
	}
	
}