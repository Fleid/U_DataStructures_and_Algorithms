import u_tools.*;

public class BubbleSort
{
	public static void main( String[] args )
	{
		
		int[] aTrier = new int[] {12,8,7,5,2};
		aTrier[0] = 12; // Pour info
		
		u_tools.ArrayPrinter AP = new u_tools.ArrayPrinter();
		
		AP.pr( aTrier );
		bubbleSortArray( aTrier , AP );
		
	}
	
	public static void bubbleSortArray( int[] aTrier, u_tools.ArrayPrinter AP )
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
			AP.pr( aTrier );
			}
		
	}
	
}

