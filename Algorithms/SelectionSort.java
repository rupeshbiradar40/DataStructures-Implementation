package Algorithms;

public class SelectionSort 
{
	
	static int[] array = {3,7,2,6,5,1,4,9,8,0};
	int smallest=0,temp=0;
	public void selectionSort()
	{
		for (int i=0;i<array.length-1;i++)
		{
			smallest=i;
			for (int j=i+1;j<array.length;j++)
			{
				if (array[j]<array[smallest])
				{
					smallest=j;
				}
			}
			
			if(smallest!=i)
			{
				temp=array[i];
				array[i]=array[smallest];
				array[smallest]=temp;
			}
			
		}
		
	}
    
	public void printArray()
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+"\t");
		}
	}
	
	
	public static void main(String[] args) 
	{
		SelectionSort ss = new SelectionSort();
		System.out.println("The Given Array is : ");
		ss.printArray();
		ss.selectionSort();
		System.out.println("\nThe Sorted Array is : ");
		ss.printArray();
	}

}
