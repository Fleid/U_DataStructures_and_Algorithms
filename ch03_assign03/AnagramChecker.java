/*
Write an algorithm that takes two strings and returns a boolean value 
indicating if the strings are anagrams. 

What is the time complexity of this algorithm?
- O(n2) : same length (so m = n), the sort does it
*/

package ch03_assign03;

public class AnagramChecker
{

	public boolean CheckAnagram( String A1, String A2 )
	{
		if ( A1.length() != A2.length() ) return(false);
		
		char[] SC1 = SortString( A1 );
		char[] SC2 = SortString( A2 );
		
		return( TestAnagram(SC1, SC2) );
		
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
	
	private boolean TestAnagram( char[] SC1, char[] SC2)
	{
		// they should be of the same length
		for (int i = 0; i < SC1.length ; i ++)
		{
			if ( SC1[i] != SC2[i] ) return(false);
		}
		return(true);
	}
	
}