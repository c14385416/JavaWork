
/****************************************
*   Set Comparing class
*   Author: Daniel Keogh - C14385416
*   Date: 13/04/2016
*   
*   Info:
*   Class used to compare the contents
*   of each hashset and thus the text
*   documents to establish what their
*   similarity is. Uses data from the
*   FileHandling class.
*****************************************/

package com.docosim;

import java.io.FileNotFoundException;
import java.util.HashSet;
import com.docosim.FileTransfer;


public class SetComparing
{
	
	//String for displaying calculated percentages in comparisons
	public static String displayString;
	
	//Declare HashSets for each text file to store the words of each
	public static HashSet<String> doc1Words = new HashSet<>();
	public static HashSet<String> doc2Words = new HashSet<>();
	public static HashSet<String> stopWords = new HashSet<>();
	
	
	public SetComparing(HashSet<String> doc1Words, HashSet<String> doc2Words, HashSet<String> stopWords)
	{
		SetComparing.doc1Words = doc1Words;
		SetComparing.doc2Words = doc2Words;
		SetComparing.stopWords = stopWords;
	}
	
	public static String SetCompare() throws FileNotFoundException
	{
		FileTransfer handle = new FileTransfer();
		handle.FileHandler();
		

		if(doc1Words.equals(doc2Words))
		{
			displayString = "Document 1 contains 100% of the words in Document 2, in the same order (excluding stop words)";
		}
		
		else
		{	
			//If doc1Words is bigger than doc2Words 
			if((doc1Words.size()) > (doc2Words.size()))
			{
				
				HashSet<String> tempSet = doc1Words;
				tempSet.removeAll(doc2Words);
				
				//Divide the size of tempSet by the size of doc2Words and multiply by 100 to find a percentage 
				float percent = (float)(tempSet.size()) / (float)(doc2Words.size());
				displayString = "Document 1 is " + percent + "% similar to document 2 (excluding stop words)";
			
			}//End if
			
			//Else doc1Words is smaller than doc2Words 
			else
			{
				
				HashSet<String> tempSet = doc1Words;
				tempSet.removeAll(doc2Words);
				
				//Divide the size of tempSet by the size of doc1Words and multiply by 100 to find a percentage
				float percent = (float)((tempSet.size())) / (float)(doc2Words.size()) * 100;
				displayString = "Document 1 is " + percent + "% similar to document 2 (excluding stop words)";
				
			}//End else
		
		}//End else
		
		return(displayString);
	}//End SetCompare()
}//End SetComparing()
