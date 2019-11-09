package com.bridgelabz.datastructure;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

import com.bridgelabz.datastructureutility.HashLinkedList;

public class HashingFunction
{
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		try {
			HashLinkedList list=new HashLinkedList();
			FileReader fr=new FileReader("/home/admin1/eclipse-workspace/BridgelabzPrograms/src/com/bridgelabz/files/number1.txt");
			
			Scanner scanner=new Scanner(fr);
			Scanner scanner1=new Scanner(System.in);
			int data;
			while(scanner.hasNext())
			{
				data=scanner.nextInt();
				list.insert(data);
			}
			int search;
			do
			{
				System.out.println("Link list item");
				list.show();
				System.out.println("\nEnter number to Search or if you Want exit press 0");
				search=scanner1.nextInt();
				if(search!=0)
				{
					int index=list.find(search);
					if(index!=-1)
					{
						System.out.println(search +" is FOUND in slot "+search%11+ " in "+index+ " node");
						list.delete(search);
					}
					else if(index==-1)
					{
						System.out.println(search +" is NOT FOUND in slot ");
						list.insert(search);	
					}
				}
				
			}while(search!=0);
			
			Writer writer= new FileWriter("/home/admin1/eclipse-workspace/BridgelabzPrograms/src/com/bridgelabz/files/number1.txt",false);
			
			
			for(int i=0;i<list.head.length;i++)
			{
				HashNode temp=list.head[i];
				while(temp!=null)
				{
					writer.write(temp.data+" ");
					writer.flush();
					
					
					temp=temp.next;
				}
			}
			scanner.close();
			scanner1.close();
		}
		
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}