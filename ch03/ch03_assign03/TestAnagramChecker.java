package ch03_assign03;

public class TestAnagramChecker
{
	public static void main( String[] args)
	{
		String aT1 = args[0];
		String aT2 = args[1];
		
		AnagramChecker AC = new AnagramChecker();
		
		System.out.println(aT1 + " and " + aT2 + " give : " + AC.CheckAnagram(aT1,aT2) );
	}
}