package com.bridgelabz.datastructureutility;


public class Queue<T>
{
	
	static Node<?> head;
	static Node<?> front;
	static Node<?> rare;
	static int size=0;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static  void enQueue(int withdraw) 
	{
		Node node= new Node();
		node.data=withdraw;
		node.next=null;
		if(isEmpty())
		{
			front=node;
			rare=node;
		}
		else
		{
			rare=node;
			rare=rare.next;
		}
	}

	public static  int deQueue()
	{
		int node=(int) front.data;
		if(front==null)
		{
			rare=null;
		}
		front=front.next;
		size--;
        return node;
	}

	public static boolean isEmpty()
	{
		return (front==null);
	}
	
	public static  int size() 
	{
		
		size++;
		return size;
	}
	
	@SuppressWarnings("rawtypes")
	public void display()
	{
		Node tnode=front;
		while(tnode!=null)
		{
			System.out.println(tnode.data);
			tnode=tnode.next;
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static  void enQueue(String data) 
	{
		Node node= new Node();
		node.data=data;
		node.next=null;
		if(isEmpty())
		{
			front=node;
			rare=node;
		}
		else
		{
			rare=node;
			rare=rare.next;
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void enQueue(Queue<String> data) 
	{
		Node node= new Node();
		node.data=data;
		node.next=null;
		if(isEmpty())
		{
			front=node;
			rare=node;
		}
		else
		{
			rare=node;
			rare=rare.next;
		}
		
	}
}
