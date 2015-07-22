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