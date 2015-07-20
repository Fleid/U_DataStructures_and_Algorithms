public class BubbleSort
{
	public static void main( String[] args )
	{
		
		int[] aTrier = new int[] {12,8,7,5,2};
		aTrier[0] = 12; // Pour info
		
		
		printArray( aTrier );
		bubbleSortArray( aTrier );
		printArray( aTrier );
	}
	
	public static void printArray( int[] aPrinter )
	{
		for ( int i=0 ; i < aPrinter.length ; i++)
			{
				System.out.print( aPrinter[i] + " " );
			}
		System.out.println();
	}
	
	public static void bubbleSortArray( int[] aTrier )
	{
		// Worst case approach : we have to go through the array Length - 1 times
		for ( int i=0 ; i < aTrier.length - 1 ; i++)
			{	
				// This loop does the actual comparison, starting from the first element
				for ( int j=0 ; j < aTrier.length - 1 - i ; j++ )
					{
						//System.out.println( aTrier[j] + " vs " + aTrier[j+1] );
						if ( aTrier[j] > aTrier[j+1] )
						{
							int tmp = aTrier[j+1];
							aTrier[j+1] = aTrier[j];
							aTrier[j] = tmp;  
						}
					}
				printArray( aTrier );
			}
		
	}
	
}

