package LinkedList;

public class SingleLinkedList 
{
	public static void main(String[] args) 
	{
		createLL();
		addNewNodeInFront(new Node(0));
		addNewNodeInlast(new Node(6));
		delLastNode();
		removeDuplicatesFromLL();
		
		System.out.println("Find Max Starts");
		int max=findMaxNumInLL();
		System.out.println("Find Max Ends"+"Max Value:::::"+ max);
	}

	public static void createLL()
	{
		Node head = null;
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);

		head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		Node current=head;
		while(current!=null)
		{
			System.out.println("Data:::::::::"+ current.data);
			current=current.next;
		}
	}

	public static void addNewNodeInFront(Node new_node)
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

		new_node.next=head;
		head=new_node;

		while(head!=null)
		{
			System.out.println("AddedFront:::::::::"+head.data);
			head=head.next;
		}
	}

	public static void addNewNodeInlast(Node new_node)
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
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=new_node;

		while(head!=null)
		{
			System.out.println("AddedLast:::::::::"+head.data);
			head=head.next;
		}	
	}

	public static void delLastNode()
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

		Node current=head;
		Node prev=null;
		while(current.next!=null)
		{
			prev=current;
			current=current.next;
		}
		prev.next=null;
		while(head!=null)
		{
			System.out.println("Del Last Node:::"+head.data);
			head=head.next;
		}
	}

	public static int findMaxNumInLL()
	{
		Node n1=new Node(1);
		Node n2=new Node(1);
		Node n3=new Node(3);
		Node n4=new Node(5);
		Node n5=new Node(3);
		Node n6=new Node(5);

		Node head=null;
		head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		int min = head.data,max=head.data;
		while(head.next!=null)
		{
			head=head.next;
			if(head.data>max)
			{
				max=head.data;
			}
			else if(head.data<min)
			{
				min=head.data;
			}
		}
		return max;
	}

	public static void removeDuplicatesFromLL()
	{
		int max=findMaxNumInLL();
		byte[] b=new byte[max+1];
		Node n1=new Node(1);
		Node n2=new Node(1);
		Node n3=new Node(3);
		Node n4=new Node(3);
		Node n5=new Node(2);
		Node n6=new Node(4);

		Node head=null;
		head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;

		while(head!=null)
		{
			if(b[head.data]==0)
			{
				b[head.data]=1;
			}
			else
			{
				//System.out.println(head.data);
			}
			head=head.next;
		}
		int i=0;
		while(i<b.length)
		{
			if(b[i]==1)
				System.out.println(i);
			i++;
		}
	}
}