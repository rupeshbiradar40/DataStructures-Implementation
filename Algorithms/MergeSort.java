package Algorithms;

public class MergeSort {
	
	public void mergeSort(int array[], int lb, int ub)
	{
		if(lb<ub)
		{
		  int mid=(lb+ub)/2;
		  mergeSort(array,lb,mid);
		  mergeSort(array,mid+1,ub);
		  merge(array,lb,mid,ub);	
		}
	}

	public void merge(int[] array, int lb, int mid, int ub)
	{
		int i=lb, j=mid+1, k=lb;
		int[] sortedArray= new int[lb+ub];
		
		while((i<=mid)&&(j<=ub))
		{
			if(array[i]<array[j])
			{
				sortedArray[k]=array[i];
			    i++; 
			    k++;
			}
			else
			{
				sortedArray[k]=array[j];
			    j++; 
			    k++;	
			}
		}
		if(i>mid)
		{
			while(j<=ub)
			{
				sortedArray[k]=array[j];
			    j++; 
			    k++;
			}
		}
		else
		{
			while(i<=mid)
			{
				sortedArray[k]=array[i];
			    i++; 
			    k++;
			}
			
		}
		System.out.println("The Sorted Array is : ");
		for(int counter=lb;counter<ub;counter++)
		{
			array[counter]=sortedArray[counter];
			System.out.println(array[counter]);
		}
	}
	public static void main(String[] args) 
	{
		
		int[] array = {3,7,2,6,5,1,4,9,8,0};
		int lb=0, ub=array.length-1;
		
		System.out.println("The Given Array is : ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+"\t");
		}
		
		MergeSort ms = new MergeSort();
		ms.mergeSort(array, lb, ub);
	}

}
