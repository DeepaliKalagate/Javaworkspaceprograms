/*  Purpose: Dequeue class for cash counter program. 
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 05-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructureutility;

public class Dequeue 
{
	static final int MAX=100;
	static char[]array=new char[MAX];
	static int front=-1;
	static int rear=-1;
	static int size;
	
	public Dequeue(int size)
	{
		array=new char[size];
		front=-1;
		rear=-1;
		Dequeue.size=size;
	}
	
	public static boolean isFull()
	{
		return((front==0 &&rear==-1) || front==rear+1);
	}
	
	public static boolean isEmpty()
	{
		return(front==-1);
	}
	public static char insertElementAtFront(char element) 
	{
		if(isFull())
		{			
			System.out.println("Queue Overflow");
			return element;
		}
		
		if(front==-1)
		{
			front=0;
			rear=0;
		}
		else if(front==0)
		{
			front=size-1;
		}
		else
			front=front-1;
		
		return array[front]=element;
	}

	public static char insertElementAtRear(char key) 
	{ 
//		size();
//		System.out.println("size of queue : "+size);
		if (isFull()) 
		{ 
			System.out.println(" Overflow "); 
			return key; 
		} 

		// If queue is initially empty 
		if (front == -1) 
		{ 
			front = 0; 
			rear = 0; 
		} 

		// rear is at last position of queue 
		else if (rear == size-1) 
			rear = 0; 

		// increment rear end by '1' 
		else
			rear = rear+1; 
		array[rear] = key; 
		return key;
	} 

	// Deletes element at front end of Deque 
	public static char deleteFront() 
	{ 
		if (isEmpty()) 
		{ 
			System.out.println("Queue Underflow\n"); 
			return 0 ; 
		} 

		// Deque has only one element 
		if (front == rear) 
		{ 
			front = -1; 
			rear = -1; 
		} 
//		else {
			// back to initial position 
			if (front == size -1) 
				front = 0; 

		char ch1 = array[front];
		front = front + 1;
		return ch1; 
	} 

	// Delete element at rear end of Deque 
	public static char deleteRear() 
	{ 
		if (isEmpty()) 
		{ 
			System.out.println(" Underflow"); 
			return 0 ; 
		} 

		// Deque has only one element 
		if (front == rear) 
		{ 
			front = -1; 
			rear = -1; 
		} 
		else if (rear == 0) 
			rear = size-1;
				
		char ch1 = array[rear];
		rear = rear - 1;
		return ch1; 
	} 

	// Returns front element of Deque 
	int getFront() 
	{ 
		// check whether Deque is empty or not 
		if (isEmpty()) 
		{ 
			System.out.println(" Underflow"); 
			return -1 ; 
		} 
		return array[front]; 
	} 

	// function return rear element of Deque 
	int getRear() 
	{ 
		// check whether Deque is empty or not 
		if(isEmpty() || rear < 0) 
		{ 
			System.out.println(" Underflow\n"); 
			return -1 ; 
		} 
		return array[rear]; 
	} 
	
	public static int size()
	{
		return size;
	}	
}
