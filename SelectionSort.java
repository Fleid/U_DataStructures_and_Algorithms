import u_tools.*;

public class SelectionSort
{
	public static void main( String[] args )
	{
		int[] aTrier = new int[] {10,2,8,6,7,3};
		
		u_tools.ArrayPrinter AP = new u_tools.ArrayPrinter();
		
		AP.pr( aTrier );
		selectionSort( aTrier , AP );
	}
	
	public static void selectionSort( int[] aTrier, u_tools.ArrayPrinter AP )
	{
		for (int i = 0 ; i < aTrier.length - 1 ; i++ )
		{
			int minIndex = i;
			
			for (int j = i + 1 ; j < aTrier.length ; j++ )
			{
				if ( aTrier[j] < aTrier[minIndex] ) minIndex = j;	
			}
			
			int tmp = aTrier[minIndex];
			aTrier[minIndex] = aTrier[i];
			aTrier[i] = tmp;
		
			AP.pr( aTrier );
		}
		
	}
	
	
}