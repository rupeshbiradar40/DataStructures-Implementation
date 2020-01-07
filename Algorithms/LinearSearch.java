package Algorithms;
public class LinearSearch 
{  
	int[] array = {1,2,3,4,5,6,7,8,9,10};
    boolean flag= false;
    
	public void linearSearch(int number)
	{
		 
		 for(int i=0;i<array.length;i++)
		    {
		    	if (array[i]==number)
		    	{
		    		System.out.println("Element is found at index: "+i);
		    		flag=true;
		    		break;
		    	}
		    }
		    
		    if (flag==false)
		    {
		    	System.out.println("Element not Found");
		    }
	}
	public static void main(String[] args) 
	{
		
	    LinearSearch ls = new LinearSearch();
	    ls.linearSearch(4); 

	}

}
