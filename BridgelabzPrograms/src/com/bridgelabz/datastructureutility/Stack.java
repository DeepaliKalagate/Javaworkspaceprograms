package com.bridgelabz.datastructureutility;

public class Stack 
{
	//Declaration and initialization
	static int MAX=1000;
	static int top=-1;
	static char[]items=new char[MAX];
	
	/**Inserting data into stack
	 * 
	 * @param string
	 */
	private static void push(char string) 
	{
		if(top==MAX-1)
		{
			System.out.println("Stack if full");
		}
		else
		{
			items[++top]=string;
		}
		
	}
	
	 /**
     * Purpose: method to check if stack is empty or not
     * @return
     */
	public static boolean isEmpty() 
	{
		return top==-1;
	}
	
	/**Deletion of data from stack
	 * 
	 * @param c
	 */
	private static int pop(char c) 
	{
		if(top==-1)
		{
			System.out.println("Stack underflow");
			return '\0';
		}
		else
		{
			char element=items[top];
			top--;
			return element;
		}
	}
	private static int peek() 
	{
		if(top<0)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		else
		{
			int x=items[top];
			return x;
		}
	}
	
	
	 /**
     * 
     * Purpose :Method for cheking whether expression is balanced or not.
     * @param exp
	 * @return 
     * @return
     */
	@SuppressWarnings("unused")
	public static String checkExpression(String expression) 
	{
		char[] ch=expression.toCharArray();
		for(int i=0;i<expression.length();i++)
		{
			char current = expression.charAt(i);
			if (current == '{' || current == '(' || current == '[')
			 {
			 Stack.push(current);
			 }
			 if (current == '}' || current == ')' || current == ']')
			 {
				 if (Stack.isEmpty())
					 return "Not Balanced";
				 char last = (char) Stack.peek();
				 if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
					 Stack.pop(current);
				 else 
					 return "Not Balanced";
			 }
		}
			 return Stack.isEmpty()?"Balanced":"Not Balanced";
	}

	/**Function for calender
	 * 
	 * @param data
	 */
	public static void pushCalender(int data) 
	{
		
			if(top==MAX-1)
			{
				System.out.println("Stack if full");
			}
			else
			{
				items[++top]=(char) data;
			}
			
	}
}
