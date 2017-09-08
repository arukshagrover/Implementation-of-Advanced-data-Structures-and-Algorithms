
class Node {
	int data;
	Node next;
	Node(int x)
	{
		data=x;
		next=null;
	}

}

public class Solution {
	Node top=null;
	public void push(int x)
	{
		Node n=new Node(x);
		if(top==null)
			top=n;
		else
		{
			n.next=top;
			top=n;
		}


	}
	public int pop()
	{
		    int x;
		    x=top.data;
			Node temp=top;
			top=top.next;
			return x;

	}

	public static void main(String args[])
	{
		Solution s= new Solution();
		s.push(2);
		s.push(4);
		s.push(5);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());


	}

}
