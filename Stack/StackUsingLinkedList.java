package Stack;

public class StackUsingLinkedList 
{
   Node top = null;
   
   public void push(int x)
   {
	   Node newNode = new Node();
	   newNode.data=x;
	   newNode.link=top;
	   top=newNode;  
	   System.out.println("\nElement Added in stack is: "+x);
   }
   
   public void pop()
   {
	   if (top==null)
	   {
		   System.out.println("\nStack is Empty\t");
	   }
	   else
	   {
		   int i = top.data;
		   top = top.link;
		   System.out.println("\nElement removed from stack is: "+i);
	   }
   }
   
   public void peek()
   {
	   if (top==null)
	   {
		   System.out.println("\nStack is Empty\t");
	   }
	   else
	   {
		   int i = top.data;
		   System.out.println("\npeak element of the stack is: "+i);
	   }
   }
   
   public void displayStack()
   {
	   Node temp;
	   temp =top;
	   System.out.println("\nElements of the stack are:\t");
	   while(temp!=null)
	   {
		  System.out.println(temp.data);
		  temp=temp.link;
	   }
   }
	public static void main(String[] args) 
	{
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.pop();
		stack.push(14);
		stack.displayStack();
	}

}
