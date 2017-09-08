class Node{
	int data;
	Node next;
	Node(int x)
	{
		data=x;
		next=null;
	}
}

public class LinkedList {
	Node head=null;
	public void insertatend(int x)
	{
		Node n=new Node(x);
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;


			}
			temp.next=n;

		}
	}
	public void delete(int x)
	{
		if(head==null)
			return;
		else
		{
			Node temp=head;
			Node temp1=head;
			while(temp.data!=x)
			{
				temp1=temp;
				temp=temp.next;

			}
			temp1.next=temp.next;
		}

	}

	public void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public void reverse()
	{
		Node a =null;
		Node b =head;
		Node c =head.next;
		while(c!=null)
		{
			b.next=a;
			a=b;
			b=c;
			c=c.next;

		}
		b.next=a;
		head=b;
	}
	public static void main(String args[])
	{
		LinkedList l=new LinkedList();
		l.insertatend(6);
		l.insertatend(3);
		l.insertatend(2);
		l.insertatend(5);
		l.print();
		l.reverse();
		l.print();
		//l.delete(3);
		//l.print();
		//l.reverse();
		//l.print();

	}

}
