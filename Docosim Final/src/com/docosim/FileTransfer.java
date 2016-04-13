
/****************************************
*   File Handling class
*   Author: Daniel Keogh - C14385416
*   Date: 13/04/2016
*   
*   Info:
*   Class to establish the contents of
*   each file and add them to the 
*   hashsets with stop words taken into 
*   account.
*****************************************/

package com.docosim;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;

import com.docosim.SetComparing;

public class FileTransfer
{
	// Hashsets from SetComparing
	public static HashSet<String> doc1Words = SetComparing.doc2Words;
	public static HashSet<String> doc2Words = SetComparing.doc1Words;
	public static HashSet<String> stopWords = SetComparing.stopWords;
	
	
	public void FileHandler() throws FileNotFoundException
	{
		String tempWord;
		
		
		//Read the stop words from stop_words.txt into the hashed set
		Scanner sc = new Scanner(new File("stop_words.txt"));
		while(sc.hasNext())
		{
			tempWord = sc.next();
			tempWord = tempWord.toLowerCase();
			stopWords.add(tempWord);
		}
		
		//Read the words in document 1 into the set (excluding stop words)
		sc = new Scanner(new File("doc1.txt"));
		while(sc.hasNext())
		{
			tempWord = sc.next();
			tempWord = tempWord.toLowerCase();
			/* excluding stop words */
			if(stopWords.contains(tempWord))
			{
				
			}
			else
			{
				doc1Words.add(tempWord);
			}
		}
		
		//Read the words in document 2 into the set (excluding stop words)
		sc = new Scanner(new File("doc2.txt"));
		while(sc.hasNext())
		{
			tempWord = sc.next();
			tempWord = tempWord.toLowerCase();
			/* excluding stop words from being added to the set*/
			if(stopWords.contains(tempWord))
			{
				
			}
			else
			{
				doc2Words.add(tempWord);
			}
		}
		
		//Close scanner
		sc.close();
		
		//Print out the words contained in each Hashset
		System.out.println(doc1Words);
		System.out.println(doc2Words);
		System.out.println(stopWords);
		
	}//End FileHandler()
}//End FileHandling()