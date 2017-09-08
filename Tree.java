package givelify_trees;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node left;
	Node right;
	Node(int x)
	{
		data=x;
		left=null;
		right=null;
	}
}
public class Tree {
	Node root=null;
	public void insert(int x)
	{
		Node n = new Node(x);
		if(root==null)
			root=n;
		else
		{
			Node temp=root;
			Node temp1=root;
			while(temp!=null)
			{
			if(x<temp.data)
			{
				temp1=temp;
				temp=temp.left;
			}
			else
			{
				temp1=temp;
				temp=temp.right;
			}
			}
			if(x<temp1.data)
				temp1.left=n;
			else
				temp1.right=n;
		}

	}

	public void preOrder(Node root)
	{
		if(root==null)
			return;
		else
		{
			System.out.println(root.data);
			 preOrder(root.left);
			 preOrder(root.right);
		}

	}
	public void inOrder(Node root)
	{
		if(root==null)
			return;
		else
		{
			 preOrder(root.left);
				System.out.println(root.data);

			 preOrder(root.right);
		}

	}

	public void dfs()
	{
		Queue<Node> q = new LinkedList<Node>();
		Node temp=root;
		q.add(temp);
		while(!q.isEmpty())
		{
			Node r = q.remove();
			while(r.left!=null)
				q.add(r.left);
			while(r.right!=null)
				q.add(r.right);

		}

	}

	public int height()
	{
		Queue<Node> q=new LinkedList<Node>();
		Node temp=root;
		q.add(temp);
		int height=0;
		while(temp!=null)
		{
			Node r =q.remove();
			if(r.left!=null)
				q.add(r.left);
			if(r.right!=null)
				q.add(r.right);
			height++;

		}
		return height;

	}
	public int width()
	{
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		int currentwidth=1;
		int nextwidth=0;
		int maxwidth=1;
		int level=0;
		while(!q.isEmpty())
		{
			while(currentwidth!=0)
			{
			Node r = q.remove();
			currentwidth--;
			if(r.left!=null)
			{
				currentwidth++;
				q.add(r.left);
			}
			if(r.right!=null)
			{
				q.add(r.right);
				nextwidth++;
			}
			}
			currentwidth=nextwidth;
			nextwidth=0;
			level++;

		}
		return level;
	}

	public static void main(String args[])
	{
		Tree t=new Tree();
		t.insert(1);
		t.preOrder(t.root);
		t.inOrder(t.root);
		t.dfs();
		t.height();
		t.width();
	}

}
