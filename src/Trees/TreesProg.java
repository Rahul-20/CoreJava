package Trees;

class Node
{
	Node left;
	Node right;
	int data;
	Node(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

public class TreesProg 
{
	public static void main(String[] args) 
	{
		treeCreation();
	}

	public static void treeCreation()
	{
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);

		Node root=null;
		root=n1;
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		System.out.println("---------Inorder Strat---------");
		printInOrderBinaryTree(root);
		System.out.println("---------Inorder End---------");
		System.out.println("---------Preorder Start---------");
		printPreOrderBinaryTree(root);
		System.out.println("---------Preorder End---------");
		System.out.println("---------Postorder Start---------");
		printPostOrderBinaryTree(root);
		System.out.println("---------Postorder End---------");

		System.out.println("---------Levelorder Start--------");
		printLevelOrderBT(root);
		System.out.println("---------Levelorder End---------");

	}
	public static void printInOrderBinaryTree(Node root)
	{
		//Inorder
		if(root!=null)
		{
			printInOrderBinaryTree(root.left);
			System.out.println(root.data);
			printInOrderBinaryTree(root.right);
		}
	}
	public static void printPreOrderBinaryTree(Node root)
	{
		//PreOrder
		if(root!=null)
		{
			System.out.println(root.data);
			printPreOrderBinaryTree(root.left);
			printPreOrderBinaryTree(root.right);
		}	
	}
	public static void printPostOrderBinaryTree(Node root)
	{
		//PostOrder
		if(root!=null)
		{
			printPostOrderBinaryTree(root.left);
			printPostOrderBinaryTree(root.right);
			System.out.println(root.data);
		}
	}
	public static void printLevelOrderBT(Node root)
	{
		int h=heightOfTree(root);
		for(int i=1;i<=h;i++)
		{
			printGivenLevel(root,i);
		}
	}
	public static void printGivenLevel(Node root,int level)
	{
		if(root!=null)
		{
			if(level==1)
				System.out.println(root.data);
			if(level>1)
			{
				printGivenLevel(root.left,level-1);
				printGivenLevel(root.right,level-1);
			}
		}
	}
	public static int heightOfTree(Node root)
	{
		if(root==null)
			return 0;	

		int lHeight=heightOfTree(root.left);
		int rHeight=heightOfTree(root.right);

		if(lHeight>rHeight)
		{
			return lHeight+1;
		}
		else
		{
			return rHeight+1;
		}
	}
	
	
}
