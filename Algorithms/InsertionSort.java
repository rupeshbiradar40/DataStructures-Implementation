package Algorithms;

public class InsertionSort 
{
	int[] array = {3,7,2,6,5,1,4,9,8,0};
	int temp=0;
	public void insertionSort()
	{
		for (int i=1;i<array.length;i++)
		{
			temp=array[i];
			int j=i-1;
			while(((j>=0)&&(array[j]>temp)))
			{
					array[j+1]=array[j];
					j--;
			}

			array[j+1]=temp;	
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
		
		InsertionSort is = new InsertionSort();
		System.out.println("The Given Array is : ");
		is.printArray();
		is.insertionSort();
		System.out.println("\nThe Sorted Array is : ");
		is.printArray();
	}

}
