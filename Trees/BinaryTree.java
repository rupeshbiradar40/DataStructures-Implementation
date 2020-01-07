package Trees;

public class BinaryTree 
{
	Node root;
	public Node createNewNode(int value)
	{
		Node newNode= new Node();
		newNode.data=value;
		newNode.left=null;
		newNode.right=null;
		return newNode;
	}
	
	public Node insertNode(Node node, int value)
	{
		if (node==null)
		{
			return createNewNode(value);
		}
		else if (value<node.data)
		{
			node.left=insertNode(node.left,value);
		}
		else if (value>node.data)
		{
			node.right=insertNode(node.right,value);
		}
		
		return node;
	}
	
	public void addNode(int value)
	{
		root=insertNode(root,value);
	}
	
	public Node getSuccessor(Node node)
	{
		if (node==null)
		{
			return null;
		}
		else
		{
			Node temp=node.right;
			while(temp.left!=null)
			{
				temp=temp.left;
			}
			return temp;
		}	
	}
	
	public Node deleteNode(Node node, int value)
	{
		if (node==null)
		{
			return null;
		}
		if (value<node.data)
		{
			node.left=deleteNode(node.left, value);	
		}
		else if(value>node.data)
		{
			node.right=deleteNode(node.right,value);
		}
		else
		{
			if (node.left==null || node.right==null)
			{
				Node temp=(node.left==null ? node.right : node.left);
				
				if (temp==null)
				{
					return null;
				}
				else 
					return temp;
		    }
			else
			{
				Node successor = getSuccessor(node);
				node.data=successor.data;
				node.right=deleteNode(node.right,value);
			}
		}
		return node;
	}
	
	public void deleteNode(int value)
	{
		deleteNode(root,value);
	}
	
	public boolean findElement(int value)
	{
		Node node=root;
		boolean isFound=false;
		if (node==null)
		{
			return false;
		}
		while(node!=null)
		{
			if(value<node.data)
			{
				node=node.left;
			}
			else if(value>node.data)
			{
				node=node.right;
			}
			else
				isFound=true;
			    break;
		}
		return isFound;
			
	}
	public void InOrder(Node node)
	{
		if (node==null)
		{
			return;
		}
		else
		{
			System.out.print(node.data+"\t");
			InOrder(node.left);
			InOrder(node.right);
		}
		
	}
	
	public void printInOrder()
	{
		InOrder(root);
	}
	
	public void PreOrder(Node node)
	{
		if (node==null)
		{
			return;
		}
		else
		{
			PreOrder(node.left);
			System.out.print(node.data+"\t");
			PreOrder(node.right);
		}
	}
	
	public void printPreOrder()
	{
		PreOrder(root);
	}
	
	public void PostOrder(Node node)
	{
		
		if (node==null)
		{
			return;
		}
		else
		{
			PostOrder(node.left);
			PostOrder(node.right);
			System.out.print(node.data+"\t");
		}
	}
	
	public void printPostOrder()
	{
		PostOrder(root);
	}
	
	public Node getParent(int value)
	{
		Node node=root, parent=null;
		
		if (node==null)
		{
			return null;
		}
		
		while(node!=null)
		{
			if(value<node.data)
			{
				parent=node;
				node=node.left;
			}
			else if(value>node.data)
			{
				parent =node;
				node=node.right;
			}
			else
			{
				break;
			}
		}
		return parent;
	}
	
	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		
		tree.addNode(7);
		tree.addNode(9);
		tree.addNode(4);
		tree.addNode(5);
		tree.addNode(11);
		tree.addNode(2);
		tree.addNode(17);
		
		System.out.println("Inorder Traversal is: ");     
		tree.printInOrder();
		
		System.out.println("\nPreorder Traversal is: ");     
		tree.printPreOrder();
		
		System.out.println("\nPostorder Traversal is: ");     
		tree.printPostOrder();
		
		tree.deleteNode(17);
		System.out.println("\nUpdated Tree After Deleting a node is: ");
		tree.printInOrder();
		
		tree.findElement(7);
		
		Node parentNode = tree.getParent(4);
		
		if (parentNode==null)
		{
			System.out.println("parent does not exist");
		}
		else
		{
		   System.out.println("\nParent Node is: "+parentNode.data);
		}
	}

	
}
