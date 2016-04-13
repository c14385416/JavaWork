
/****************************************
*   Control class
*   Author: Daniel Keogh - C14385416
*   Date: 13/04/2016
*   
*   Info:
*   Class to intitiate methods from
*   other classes
*****************************************/

package com.docosim;

import java.io.FileNotFoundException;

import com.docosim.SetComparing;

public class Control
{
	public static void main(String[] args)
	{
		
		String displayString;
		try 
		{
			
			SetComparing.SetCompare();
			System.out.println(SetComparing.displayString);
			
		}//End try
		
		//Error message for file not found
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
			
		}//End catch
		
	}//End main()
	
}//End Control()