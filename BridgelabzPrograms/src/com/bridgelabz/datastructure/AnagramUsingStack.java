/*  Purpose: Extend Prime Numbers Program and Check Prime Numbers that are Anagram 
 * 			 in the Range of 0 - 1000 using a Stack.
 *
 *  @author :Deepali Kalagate
 *  @version:1.0
 *  @since : 07-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;

import com.bridgelabz.datastructureutility.StackUsingLinkedList;
import com.bridgelabz.utility.ListUtility;

public class AnagramUsingStack 
{
		public static void main(String[] args)
		{
			int res[]=ListUtility.primeAnagrams(1000);
			for(int i=res.length-1;i>=0;i--)
				StackUsingLinkedList.push(res[i]);
			StackUsingLinkedList.display();
		}
}
