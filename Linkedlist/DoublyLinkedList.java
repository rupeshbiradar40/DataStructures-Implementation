package Linkedlist;

public class DoublyLinkedList 
{
	DoubleNode head, tail;
	
	public void insertAtBeginning(int x)
	{
		DoubleNode newnode = new DoubleNode();
		newnode.data=x;
		newnode.nextNode=head;
		head.previousNode=newnode;
		head=newnode;
	}
	
    public void insertAtEnd(int x)
    {
    	DoubleNode newnode = new DoubleNode();
		newnode.data=x;
		tail.nextNode=newnode;
		newnode.previousNode=tail;
		tail=newnode;
    }
    
    public void insertInBetween(int index, int x)
    {
    	DoubleNode temp=head;
    	DoubleNode newnode = new DoubleNode();
		newnode.data=x;
		
    	for (int i=0;i<index-1;i++)
    	{
    		temp=temp.nextNode;
    	}
    	 
    	 newnode.previousNode=temp;
    	 temp.nextNode=newnode;
    	 newnode.nextNode=temp.nextNode;
    	 newnode.nextNode.previousNode=newnode;
    }
    
    public void deleteFromBeginning()
    {
    	head=head.nextNode;
    	head.previousNode=null;
    }
    
    public void deleteFromEnd()
    {
    	tail=tail.previousNode;
    	tail.nextNode=null;
    }
    
    public void deleteFromInBetween(int index)
    {
    	if (index==0)
    	{
    		deleteFromBeginning();
    	}
    	
    	DoubleNode temp=head; // traverse to the node.
    	
    	for (int i=0;i<index;i++)
    	{
    		temp=temp.nextNode;
    	}
    	temp.nextNode.previousNode=temp.previousNode;
    	temp.previousNode.nextNode=temp.nextNode;
    	
    }
    
    public void showDoublyLinkedList()
    {
    	DoubleNode temp=head;
    	while(temp.nextNode!=null)
    	{
    		System.out.println(temp.data);
    		temp=temp.nextNode;
    	}
    	System.out.println(temp.data);
    }
    
    public static void main(String[] args) 
	{
    	DoublyLinkedList list =new DoublyLinkedList();
		
    	list.insertAtBeginning(13);
		list.showDoublyLinkedList();
		list.insertAtEnd(14);
		list.showDoublyLinkedList();
		list.insertInBetween(1, 15);
		list.showDoublyLinkedList();
		list.insertInBetween(2, 16);
		list.showDoublyLinkedList();
		list.insertInBetween(3, 17);
		list.showDoublyLinkedList();
		list.deleteFromBeginning();
		list.showDoublyLinkedList();
		list.deleteFromInBetween(2);
		list.showDoublyLinkedList();
	}
}
