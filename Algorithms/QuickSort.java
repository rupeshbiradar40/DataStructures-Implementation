package Algorithms;

public class QuickSort {
	
	
	public void quickSort(int[] arr, int lb, int ub)
	{
		if(lb<ub)
	    {
	        int loc=partition(arr,lb,ub);
	        quickSort(arr,lb,loc-1);
	        quickSort(arr,loc+1,ub);
	    }
	}
	
	public int partition(int[] arr, int lb, int ub)
	{
		 int pivot=arr[lb];
		    int start=lb;
		    int end=ub;
		    
		    while(start<end)
		    {
		        while((arr[start]<=pivot)&&start<ub)
		        {
		            start++;
		        }
		        while((arr[end]>pivot)&&end>lb)
		        {
		            end--;
		        }
		        if(start<end)
		        {
		            int temp=arr[start];
		            arr[start]=arr[end];
		            arr[end]=temp;
		        }
		    }
		    
		    int temp=arr[lb];
		    arr[lb]=arr[end];
		    arr[end]=temp;


		    return end;
	}
	
	public void printArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+"\t");
		}
	}
	public static void main(String[] args) 
	{
		int[] arr = {3,7,2,6,5,1,4,9,8,0};
		int lb=0, ub=arr.length-1;
		
		QuickSort qs = new QuickSort();
		System.out.println("The Given Array is : ");
	    qs.printArray(arr);
		qs.quickSort(arr, lb, ub);
		System.out.println("\nThe Sorted Array is : ");
		qs.printArray(arr);
	}

}
