package Queue;

public class CircularQueueUsingArray 
{
	public int[] queue = new int[10];
	public int front=-1, rear=-1;
	
	public void enque(int x)
	{
		if (((rear+1)%10)==front)
			{
				System.out.println("Queue is Full");
			}
		else if (front==-1 &&rear==-1)
		{
			front = 0;
			rear=0;
			queue[rear]=x;
			System.out.println("Element Added to Queue is : "+x);
		}
		else
		{
			rear=((rear+1)%10);
			queue[rear]=x;
			System.out.println("Element Added to Queue is : "+x);
		}
	}
	
	public void dequeue()
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is Empty");
		}
		else if(front == rear)
		{
			front=rear=-1;
		}
		else 
		{
			int i = queue[front];
			System.out.println("Element removed from Queue is : "+i);
			front=((front+1)%10);
		}
	}
	
	public void peek()
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			System.out.println("Element in thee front of the queue is : "+queue[front]);
		}
	}
	
	public void displayQueue()
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is Empty");
		}
		
		System.out.println("Elements of the queue are : ");
		
		int i=front;
		while(i!=rear+1)
		{
		  System.out.println(queue[i]);
		  i=(i+1)%10;
		}
	}
	public static void main(String[] args) 
	{
		CircularQueueUsingArray queue = new CircularQueueUsingArray();
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
