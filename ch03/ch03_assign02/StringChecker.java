/*
Write an algorithm which checks if there are duplicate characters in a string. 
The method signature would look something like public boolean hasDuplicateChars(String s) . 
*/

/*
What is the time complexity of this algorithm? If we know that the string contains ONLY ASCII characters, can we improve the algorithm?
- Time Complexity : O(n2) for the double loop on the string in the SortString
- Using Regular Expression?
*/

package ch03_assign02;

public class StringChecker
{
	public String AA;
	public char[] SC;
	
	public boolean CheckString( String AA )
	{
		this.AA = AA;
		this.SC = SortString(AA);
		
		return( TestCharArray( SC ) );
	}
	
	private char[] SortString( String AA )
	{
		char[] CharArray = AA.toCharArray();
		
		for ( int i = 1 ; i < CharArray.length ; i++ )
		{
			char current = CharArray[i];
			int j = i - 1;
			
			while ( j >= 0 && CharArray[j] > current )
			{
				CharArray[j+1] = CharArray[j];
				j = j - 1;
			}
			
			CharArray[j+1] = current;
		}
		return(CharArray);
	}
	
	private boolean TestCharArray( char[] SC )
	{
		for ( int i = 0; i < SC.length - 1 ; i++)
		{
			if ( SC[i] == SC[i+1] ) return(true);
		}
		return(false);
	}
	
}

