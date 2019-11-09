/*  Purpose: Facade Design Pattern.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 21-10-2019
 *
 ******************************************************************************/
package com.bridgelabz.designpatterns.structural.facade;

public class FacadePatternTest
{
	public static void main(String[] args) 
	{
		ShapeMaker shapeMaker=new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
