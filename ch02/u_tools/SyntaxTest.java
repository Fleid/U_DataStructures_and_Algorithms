package u_tools;

public class SyntaxTest
{
	public int A;
	
	public SyntaxTest( int A )
	{
		this.A = A;
	}

	public SyntaxTest()
	{
		this(1);
	}
	
	public void showMe()
	{
		System.out.println("This is it: "+ A);
	}
}