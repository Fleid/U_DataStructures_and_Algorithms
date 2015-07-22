/*
If we pass "anaconda" the method should return true (repeated char 'a'). 
If we pass 'great', the method should return false, because there are no duplicate characters in the string. 
*/

package ch03_assign02;

public class TestStringChecker
{
	public static void main( String[] args)
	{
		String aTester = args[0];
		
		StringChecker SC = new StringChecker();
		
		System.out.println(aTester + " gives : " + SC.CheckString(aTester) );
		
	}
}