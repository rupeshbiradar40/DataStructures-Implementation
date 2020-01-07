package Queue;

public class CircularQueueUsingLinkedList {

	 Node front=null;
	 Node rear=null;
	    
	    public void enque(int x)
	    {
	    	Node newNode = new Node();
	    	newNode.data=x;
			newNode.next=null;
	    	if (front==null && rear ==null)
	    	{
	    		front =newNode;
	    		rear=newNode;
	    		rear.next=front;
	    		System.out.println("Element Added to Queue is : "+x);
	    	}
	    	else
	    	{
	    		rear.next=newNode;
	    		newNode.next=front;
	    		rear=newNode;
	    		System.out.println("Element Added to Queue is : "+x);
	    	}
	    }
	    
	    public void dequeue()
	    {
	    	if (front==null && rear==null) 
	    	{
	    		System.out.println("Queue is Empty");
	    	}
	    	else
	    	{
	    		int i = front.data;
	    		front=front.next;
	    		rear.next=front;
	    		System.out.println("Element removed from Queue is : "+i);
	    	}
	    }
	    
	    public void peek()
	    {
	    	if (front==null && rear==null) 
	    	{
	    		System.out.println("Queue is Empty");
	    	}
	    	else
	    	{
	    		int i = front.data;
	    		System.out.println("Element removed from Queue is : "+i);
	    	}
	    }
	    
	    public void displayQueue()
	    {
	    	if (front==null && rear==null) 
	    	{
	    		System.out.println("Queue is Empty");
	    	}
	    	else
	    	{
	    		System.out.println("Elements in the Queue are: ");
	    		Node temp=front;
	    		while(temp.next!=front)
	    		{
	    			System.out.println(temp.data);
	    			temp=temp.next;
	    		}
	    	}
	    	
	    }
	 
		public static void main(String[] args) 
		{
			QueueUsingLinkedList queue = new QueueUsingLinkedList();
			queue.enque(40);
			queue.enque(50);
			queue.enque(60);
			queue.enque(70);
			queue.dequeue();
			queue.enque(80);
			queue.dequeue();
			queue.peek();
			queue.displayQueue();
		}

}
