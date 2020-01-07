package Algorithms;

public class BinarySearch {
	
	int[] array = {1,2,3,4,5,6,7,8,9,10};
    int first=0, last=array.length; 
    
    public void binarySearch(int number)
    {
	    
	    while(first<last)
	    {
	    	int mid=(first+last)/2;
	    	
	    	if(number==array[mid])
	    	{
	    		System.out.println("Element is found at index: "+mid);
	    		break;
	    	}
	    	else if(number<mid)
	    	{
	    		last=mid-1;
	    	}
	    	else
	    	{
	    		first=mid+1;
	    	}
	    	
	    	if(first>last)
	    	{
	    		System.out.println("Element Not Found ");
	    		break;
	    	}
	    }
    }
 
	public static void main(String[] args) 
	{
		BinarySearch bs = new BinarySearch();
		bs.binarySearch(4);
	}

}
