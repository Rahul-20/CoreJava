package LinkedList;

public class CircularLinkedList 
{
	public static void main(String[] args) 
	{
		createCLL();
		addNewNodeInFront();
		addnewNodeInEnd();
		delNodeInEnd();
		delNodeInFront();
		reverseCLL();
	}

	public static void createCLL()
	{
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);

		Node head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n1;
		System.out.println("-----Creation of CCL Strats-----");
		printCLL(head);
		System.out.println("-----Creation of CCL Ends-----");
	}

	public static void printCLL(Node head)
	{
		Node temp=head;
		do
		{
			System.out.println("CLL Values:::"+temp.data);
			temp=temp.next;
		}while(temp!=head);
	}

	public static void addNewNodeInFront()
	{
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);

		Node new_node=new Node(0);
		Node head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n1;

		Node prev=null;
		Node temp=head;
		do
		{
			prev=temp;
			temp=temp.next;
		}while(temp!=head);

		prev.next=new_node;
		new_node.next=head;
		head=new_node;
		System.out.println("-----New node 0 is added in front Starts-----");
		printCLL(head);
		System.out.println("-----New node 0 is added in front Ends-----");
	}

	public static void addnewNodeInEnd()
	{
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);

		Node new_node=new Node(6);
		Node head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n1;

		Node prev=null;
		Node temp=head;
		do
		{
			prev=temp;
			temp=temp.next;
		}while(temp!=head);

		prev.next=new_node;
		new_node.next=head;
		System.out.println("------New Node 6 added at End-----");
		printCLL(head);
		System.out.println("------New Node 6 added at End-----");
	}

	public static void delNodeInEnd()
	{
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);

		Node head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n1;

		Node prev=null;
		Node temp=head;
		do
		{
			prev=temp;
			temp=temp.next;
			if(temp.next==head)
			{
				break;
			}
		}while(temp!=head);

		prev.next=head;
		System.out.println("-----Delete Node which is at end-----");
		printCLL(head);
		System.out.println("-----Delete Node which is at end-----");
	}

	public static void delNodeInFront()
	{
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);

		Node head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n1;

		head=head.next;
		Node temp=head;
		Node prev=null;
		do
		{
			prev=temp;
			temp=temp.next;
		}while(temp!=head);

		prev.next=head;

		//printCLL(head);
	}

	public static void reverseCLL()
	{
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		Node head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n1;
		
		Node curr=head;
		Node prev=null;
		Node temp=null;
		
		do
		{
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}while(temp!=head);
		head.next=prev;
		head=prev;
		System.out.println("--------Reverse CLL--------");
		printCLL(head);
		System.out.println("--------Reverse CLL--------");
	}
}