import u_tools.*;

public class InsertionSort
{
	public void main( String[] args )
	{
		int[] aTrier = new int[] {10,2,8,6,7,3};
		
		u_tools.ArrayPrinter AP = new u_tools.ArrayPrinter();
		
		AP.pr( aTrier );
		insertionSort( aTrier , AP );
	}
	
	public void insertionSort( int[] aTrier, u_tools.ArrayPrinter AP )
	{
		for ( int i = 1 ; i < aTrier.length ; i++ )
		{
			int current = aTrier[i];
			int j = i - 1;
			
			while ( j >= 0 && aTrier[j] > current )
			{
				aTrier[j+1] = aTrier[j];
				j = j - 1;
			}
			
			aTrier[j+1] = current;
			
			AP.pr( aTrier );			
		}
		
	}
	
	
}