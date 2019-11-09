/*  Purpose: User Input and Replace String Template.
 *
 *  @author :Deepali Vasant Kalagate
 *  @version:1.0
 *  @since : 10-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.bridgelabz.utility.Utility;

public class UserName 
{
	public static void main(String[] args) 
	{
		String st=new String("Hello <<UserName>>, How are you?");
		System.out.println("Enter UserName : ");
		String name=Utility.StringValue();
		Pattern pattern=Pattern.compile("[A-Z][a-z]+{3,20}");
		Matcher matcher=pattern.matcher(name);
		if(matcher.matches())
		{
			st=st.replaceAll("<<UserName>>", name);
			System.out.println(st);
		}
		else
		{
			System.out.println("Username should be only character and enter more than 3 Characters");
		}
	}

}
