/******************************************************************************
 *  Purpose: Program is written for shuffle and distribute card of deck
 *
 *  @author  Deepali Vasant Kalagate
 *  @version 1.0
 *  @since   11-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.oops;

import com.bridgelabz.utility.OOPUtility;


public class DeckOfCards 
{
	public static void main(String[] args)
	{
		String playercard[][] = OOPUtility.cardDistribute();
		System.out.println("Player 1          Player 2          Player 3          Player 4");
		System.out.println();
		int x = 0;
		int y = 0;
		for (int i = 0; i < 9; i++) 
		{
			for (int j = 0; j < 4; j++) 
			{
				System.out.print(playercard[x][y] + "          ");
				y++;
				if (y == 9) 
				{
					y = 0;
					x++;
				}
			}
			System.out.println();
		}
	
	}
}