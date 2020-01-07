package Linkedlist;

public class CircularLinkedList 
{
    Node tail;
    
    public void insertAtStart(int x)
	{
		Node newnode=new Node();
		newnode.data=x;
		newnode.next=tail.next;
	}
    
    public void insertAtEnd(int x)
    {
    	Node newnode=new Node();
		newnode.data=x;
    	newnode.next=tail.next;
    	tail.next=newnode;
    	tail=newnode;
    }
    
    public void insertInBetween(int index, int x)
    {
    	if(index==0)
    	{
    		insertAtStart(x);
    	}
    	
    	Node temp=tail.next;
    	Node newnode=new Node();
		newnode.data=x;
		for(int i=0;i<index-1;i++)
		{
			temp=temp.next;
		}
		newnode.next=temp.next;
		temp.next=newnode;
    }
    
    public void deleteFromStart()
    {
    	if (tail==null)
    	{
    		System.out.println("Queue is Empty");
    	}
    		
    	Node temp=tail.next;
    	temp=temp.next;
    	tail.next=temp;
    }
    
    public void deleteFromEnd()
    {
    	Node current=tail.next, previous=null;
    	
    	if (tail==null)
    	{
    		System.out.println("Queue is Empty");
    	}
    	while(current.next!=tail.next)
    	{
    		previous=current;
    		current=current.next;
    	}
    	previous.next=tail.next;
    	tail=previous;
    }
    
    public void deleteInBetween(int index)
	{
    	Node temp=tail.next, newnode;
    	
		if(index==0)
		{
			deleteFromStart();
		}
		else
		{
			for (int i=0;i<index;i++)
			{
				temp=temp.next;
			}
			temp.next=temp;
			newnode=temp.next;
			temp.next=newnode.next;
		}
	}
    
	public static void main(String[] args) 
	{
		
	}

}
