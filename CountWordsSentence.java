package com.wordscount;

public class CountWordsSentence {

	public  int countWords(String stringtoCountWords)
	{
		int wordsCount = 0;
		boolean word = false;
		int endOfLine = stringtoCountWords.length()-1;
		for (int i = 0; i <stringtoCountWords.length(); i++)
		{
			if (Character.isLetter(stringtoCountWords.charAt(i))&& i!=endOfLine)
			{
				word = true;	
			} else if (!Character.isLetter(stringtoCountWords.charAt(i))&&word)
			{
				wordsCount++;
				word = false;
			} 
			else if (Character.isLetter(stringtoCountWords.charAt(i))&&i ==endOfLine) 
			{
				wordsCount++;
			}
		}
		return wordsCount;
	}
}
