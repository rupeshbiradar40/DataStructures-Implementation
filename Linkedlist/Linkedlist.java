package Linkedlist;

public class Linkedlist 
{
	Node head;
	
	public void insertAtStart(int data)
	{
		Node node = new Node();
		node.data=data;
		node.next=null;
		node.next=head;
		head=node;
	}

	public void insertInBetween(int index, int data)
	{
		if (index==0)
		{
			insertAtStart(data);
		}
		else
		{	
		  Node node=new Node();
		  node.data=data;
		  node.next=null;
		
		  Node temp=head;
		  for (int i=0;i<index-1;i++)
		  {
			temp=temp.next;
		  }
		    node.next=temp.next;
			temp.next=node;
		}
	}
	
	public void insertAtEnd(int data)
	{
		Node node= new Node();
		node.data=data;
		node.next=null;
		
		if(head==null)
		{
			head=node;
		}
		else
		{
		  Node temp=head;
		  while(temp.next!=null)
		   {
			temp=temp.next;
		   }
		   temp.next=node;
		}
	}
	
	public void deleteNode(int index)
	{
		if(index==0)
		{
			head=head.next;
		}
		else
		{
			Node delete,temp=head;
			for(int i=0;i<index-1;i++)
			{
				temp=temp.next;
			}
		    delete=temp.next;
		    temp.next=delete.next;
		}
	}
	
	public void reverseList()
	{
		Node PreviousNode, CurrentNode, NextNode;
		PreviousNode=null;
		CurrentNode=NextNode=head;
		
		while(NextNode!=null)
		{
			NextNode=NextNode.next;
			CurrentNode.next=PreviousNode;
			PreviousNode=CurrentNode;
			CurrentNode=NextNode;
		}
		
		head=PreviousNode;
	}
	
	public int sizeofList()
	{
		Node temp;
		temp=head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	public void showList()
	{
		Node node=head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
	
	public static void main(String[] args) 
	{
		Linkedlist list =new Linkedlist();
    	list.insertAtStart(13);
		list.insertInBetween(1, 15);
		list.insertInBetween(2, 17);
		list.insertInBetween(3, 19);
		list.insertAtEnd(21);
		list.deleteNode(3);
		list.showList();
	}
}
