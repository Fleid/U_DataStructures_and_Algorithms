/*Create a few employee objects and store them in an array. 
Write the insertion sort algorithm, which takes an array of employee and sorts them 
in order of their employee number.*/

package ch03_assign01;

public class SortEmployee
{
	public static void main( String[] args )
	{
		Employee[] EA = new Employee[]{
					new Employee(819017939,"A","B","C"),
					new Employee(509714046,"A","B","C"),		
					new Employee(888573607,"A","B","C"),	
					new Employee(655274473,"A","B","C"),
					new Employee(119017939,"A","B","C"),
					new Employee(9714046,"A","B","C"),		
					new Employee(88573607,"A","B","C"),
					new Employee(4473,"A","B","C")
			};
		
		for ( int i = 0 ; i < EA.length ; i++ ) EA[i].showEN();
		
		System.out.println("Sorting...");
		insertionSort( EA );
		System.out.println("Sort done!");
		
		for ( int i = 0 ; i < EA.length ; i++ ) EA[i].showEN();	
		
	}

	public static void insertionSort( Employee[] aTrier )
	{
		for ( int i = 1 ; i < aTrier.length ; i++ )
		{
			Employee current = aTrier[i];
			int j = i - 1;
			
			while ( j >= 0 && aTrier[j].employeeNumber > current.employeeNumber )
			{
				aTrier[j+1] = aTrier[j];
				j = j - 1;
			}
			
			aTrier[j+1] = current;
						
		}
		
	}

}


