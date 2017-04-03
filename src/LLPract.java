
class Node
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}


public class LLPract 
{
	public static void main(String[] args) 
	{
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);

		Node head=null;
		head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		//addFront(head,new Node(0));
		//addBack(head,new Node(6));
		//delFirst(head);
		//delLast(head);
		//DeleteAnyNode(head,1);
		reverse(head);

		//printLL(head);
	}

	public static void printLL(Node head)
	{
		while(head!=null)
		{
			System.out.println("Value:::::"+head.data);
			head=head.next;
		}
	}

	public static void delFirst(Node head)
	{
		head=head.next;
		//printLL(head);
	}

	public static void delLast(Node head)
	{
		Node curr=head;
		Node prev=null;
		while(curr.next!=null)
		{
			prev=curr;
			curr=curr.next;
		}
		prev.next=null;
		//printLL(head);
	}

	public static void addFront(Node head,Node new_Node)
	{
		new_Node.next=head;
		head=new_Node;
		//printLL(head);
	}

	public static void addBack(Node head,Node new_Node)
	{
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=new_Node;
		//printLL(head);
	}

	public static void DeleteAnyNode(Node head,int data)
	{
		Node curr=head;
		Node prev=null;
		boolean flag=false;
		if(curr.data!=data)
		{
			while(curr!=null)
			{
				prev=curr;
				curr=curr.next;
				if(curr.data==data)
				{
					flag=true;
				}
				if(flag)
					break;
			}
			prev.next=curr.next;
		}
		else
		{
			head=head.next;
		}
		//printLL(head);
	}
	
	public static void reverse(Node head)
	{
		Node curr=head;
		Node prev=null;
		Node temp=null;
		while(curr!=null)
		{
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		head=prev;
		printLL(head);
	}
}
