package u_tools;

public class TestPrintArray
{	
	public static void main( String[] args )
	{
		
		int[] aTrier = new int[] {12,8,7,5,2};
		aTrier[0] = 12; // Pour info
		
		u_tools.ArrayPrinter AP = new u_tools.ArrayPrinter();
		AP.pr( aTrier );

	}
}