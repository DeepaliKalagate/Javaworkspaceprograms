package com.bridgelabz.datastructureutility;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;



public class OrderedLinkedList<T extends Comparable<T>> 
{
	
	Node<T> head;
	/**Appending new Value in list
	 * 
	 * @param data
	 */
	public void append(T data)
	{
		Node<T> node= new Node<>();
		 node.data=data;
		 node.next=null;
				 
		 if(head==null)
		 {
			 head=node;
		 }
		 else
		 {
			 Node<T> current = head;
			 Node<T> temp=null;
			 
			 while(current!=null && (current.data.compareTo(node.data))<0)
			 {
				 temp=current;
				 current=current.next;
			 }
			 node.next=current;
			 temp.next=node;
			
		 }
		
	}
	
	/**Inserting node at starting position
	 * 
	 * @param data
	 */
	  public void insertAtStart(T data) 
	  {
		Node<T> node = new Node<T>();
		node.data = data;
		node.next = null;

		node.next = head;
		head = node;
	  
	  }
	  
	  /**inserting node at last position 
	   * 
	   * @param data
	   * @param index
	   */
	  public void insert(T data,int index) 
	  {
		Node<T> node = new Node<T>();
		node.data = data;
		node.next = null;

		
		Node<T> n = head;

		if (index == 0) 
		{
			insertAtStart(data);
		}
		else
		{
			for (int i = 0; i < index - 1; i++)
			{
				n = n.next; 
			}
	  		node.next=n.next; 
			n.next=node;
		}
	  }
	  
	  /**Removing node from list
	   * 
	   * @param index
	   */
	  @SuppressWarnings({ "rawtypes", "unchecked" })
	public void remove(int index) 
	  {
	  	  Node n =head;
	  	  Node n1=null;
	  	  for(int i=0;i<index-1;i++) 
	  	  {
	  		  n=n.next; 
		  }
	  	  n1=n.next; 
	  	  n.next=n1.next; 
	  }
	    
	  /**displaying list
	   * 
	   */
	  @SuppressWarnings("rawtypes")
	public void show() 
	  { 
		Node node = head;

		while (node.next != null) 
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	  }
	  
	  /**writing new element in file
	   * 
	   */
	public void writeOnFile() 
	{
		readFile();
		Node<T> n = head;
		String first = " ";
		while (n.next != null) 
		{
			first = first.trim() + " " + n.data.toString().trim();
			n = n.next;
		}
		first = first.trim() + " " + n.data.toString().trim();

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("/home/admin1/eclipse-workspace/BridgelabzPrograms/src/com/bridgelabz/files/number.txt"))) 
		{
			writer.write(first);
			writer.close();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	  
	public boolean isEmpty() 
	{
		if (head == null)
		{
			return true;
		}
	  return false; 
	}
		
	/**
	 * serching element from the list
	 * @param s
	 * @param item
	 * @return
	 */
	public static int search(int[] s, int item) 
	{
		int start = 0;
		int end = s.length - 1;
		while (start <= end) 
		{
			int middle = (start + end) / 2;
			if (s[middle]==item) 
			{
				return middle;
			}
			else if (item > s[middle]) 
			{
				start = middle + 1;
			} 
			else
			{
				end = middle - 1;
			}
		}
		return -1;
	}
	 
	public  int size() 
	{
		int counter = 1;
		Node<T> n = head;
		while (n.next != null) 
		{
			counter++;
			n = n.next;
		}
		return counter;
	}

	public int index(String item) 
	{
		int pos = 0;
		Node<T> n = head;
		while (n.next != null)
		{
			if (n.data.equals(item)) 
			{
				return pos;
			} 
			else
			{	
				n = n.next;
				pos++;
			}
		}
		pos--;
		return pos;
	}
	  
	/**Reading file contents
	 * 
	 * @return
	 */
	public static int[] readFile()
	{
		try 
		{
			File f= new File("/home/admin1/eclipse-workspace/BridgelabzPrograms/src/com/bridgelabz/files/number.txt");
			Scanner scanner= new Scanner(f);
			int count=0;
			while(scanner.hasNextInt())
			{
				count++;
				scanner.nextInt();
			}
			int[] arr= new int[count];
			Scanner scanner2= new Scanner(f);
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=scanner2.nextInt();
			}
			scanner.close();
			scanner2.close();
			return arr;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return  null;
		}
	}

	/**Sorting elements
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] sort(int[] arr)
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			int flag=0;
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		return arr;
	}

	
	
}
