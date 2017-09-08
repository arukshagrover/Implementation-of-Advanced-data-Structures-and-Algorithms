class Node
{
	Node next;
	int data;
	Node(int x)
	{
		data=x;
		next=null;


	}

}

public class Queue {
	Node front=null;
	Node rear=null;
	public void enqueue(int x)
	{
		Node n=new Node(x);
		if(front==null&&rear==null)
		{
			front=n;
			rear=n;
		}
		else
		{
			rear.next=n;
			rear=n;
		}


	}

	public int dequeue()
	{
		int x=0;

		if(rear==front && front==null)
			return -1;
		else
		{
			x=front.data;
			front=front.next;



	}
		return x;

}

	public static void main(String args[])
	{
		Queue q=new Queue();
		q.enqueue(2);
		q.enqueue(4);
		q.enqueue(5);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());



		}
	}
