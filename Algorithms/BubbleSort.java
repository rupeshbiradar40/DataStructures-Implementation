package Algorithms;

public class BubbleSort {

	int[] array = {3,7,2,6,5,1,4,9,8,0};
	int temp=0;
	public void bubbleSort()
	{
		for (int i=0;i<array.length-1;i++)
		{
			for (int j=0;j<array.length-1-i;j++)
			{
				if (array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
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
		BubbleSort bs = new BubbleSort();
		System.out.println("The Given Array is : ");
		bs.printArray();
		bs.bubbleSort();
		System.out.println("\nThe Sorted Array is : ");
		bs.printArray();
	}
}
