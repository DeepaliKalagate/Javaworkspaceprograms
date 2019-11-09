/*  Purpose: Bill Pugh Singleton Design Pattern.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 19-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.designpatterns.creational.singleton;

public class BillPugh
{
	private static BillPugh billPugh;
	private BillPugh()
	{
	}
	public static class BillPughSingletonHelper
	{
		private static final BillPugh Instance=new BillPugh();
	}
	public static BillPugh getBillPugh()
	{
		return BillPughSingletonHelper.Instance;
	}
	public static void main(String[] args)
	{
		BillPugh.getBillPugh();
		System.out.println("Bill Pugh");
	}
}
