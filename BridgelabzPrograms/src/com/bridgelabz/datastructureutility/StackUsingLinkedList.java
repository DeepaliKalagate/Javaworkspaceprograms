package com.bridgelabz.datastructureutility;

public class StackUsingLinkedList 
{

	public static class Node
	{ 
		 /*integer data*/  
	   int data;
	   Node link; /* reference variavle Node type*/  
		} 
	
	
		static Node top; /* create globle top reference variable */  
		 
		public StackUsingLinkedList() 
		{ 
				StackUsingLinkedList.top = null; 
		} 
		/* Utility function to add an element x in the stack */ 
		public static void push(int x) /*  insert at the beginning */ 
		{  
			
			Node temp = new Node(); 
			
			/* initialize data into temp data field*/  
			temp.data = x; 

			/* put top reference into temp link*/  
			temp.link = top; 

			/*  update top reference*/ 
			top = temp; 
		} 

		/* Utility function to check if the stack is empty or not*/  
	  public boolean isEmpty() 
		{ 
			return top == null; 
		} 
	  
	  /*  Utility function to return top element in a stack */ 
	 public int peek() 
       { 
		// check for empty stack 
			if (!isEmpty()) { 
				return top.data; 
				} 
				else { 
				System.out.println("Stack is empty"); 
				return -1; 
				} 
				} 

	// Utility function to pop top element from the stack 
		public static void pop() // remove at the beginning 
		{ 
			
			if (top == null) { 
			System.out.print("\nStack Underflow"); 
			return; 
			} 

			// update the top pointer to point to the next node 
			top = (top).link; 
		} 

		public static void display() 
		{ 
			// check for stack underflow 
			if (top == null) 
			{ 
				System.out.printf("\nStack Underflow"); 
			} 
			else 
			{ 
				Node temp = top; 
				while (temp != null) 
				{ 
	                        
				// print node data 
				int num=temp.data;
				System.out.print(num+" "); 

				// assign temp link to temp 
				temp = temp.link; 
				} 
			} 
		}
}
