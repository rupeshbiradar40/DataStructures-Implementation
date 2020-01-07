package Stack;

public class StackUsingArray
{
	public int[] stack = new int[10];
	public int top = -1;
	
	public void push(int x)
	{
		if (top==9)
		{
			System.out.println("\nStack is Full\t");
		}
		else
		{
			top++;
			stack[top]=x;
			System.out.println(x+" is added to stack\t");
		}
	}
	
	public void pop()
	{
		if (top==(-1))
		{
			System.out.println("\nStack is Empty\t");
		}
		else
		{
			int i=stack[top];
			top--;
			System.out.println("\n"+i+" is removed from stack\t");
			
		}
	}
	
	public void peek()
	{
		if (top==(-1))
		{
			System.out.println("\nStack is Empty\t");
		}
		else
		{
			int i=stack[top];
			System.out.println("\n"+i+" is the peak element of the stack\t");
			
		}
	}
	
	public void displayStack()
	{
		System.out.println("\nElements of the Stack :\t");
		for (int i=top;i>=0;i--)
		{
			System.out.println(stack[i]);
		}
	}
	public static void main(String[] args) 
	{
		StackUsingArray stack = new StackUsingArray();
		stack.push(3);
		stack.push(4);
		stack.push(5);
        stack.pop();
        stack.pop();
        stack.peek();
        stack.push(7);
        stack.push(9);
        stack.push(11);
        stack.displayStack();
	}

}
