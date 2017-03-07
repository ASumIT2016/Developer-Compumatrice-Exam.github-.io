package com.wordscount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckSentence {

	public  void checke(String passString)
	{
		Pattern pattern=Pattern.compile("[.-?-!]");
		int maximumWordsCount=0;
		CountWordsSentence countwordssentence=new CountWordsSentence();
		String arrayofString[]=new String[ passString.length()];
		Matcher matcher =pattern.matcher(passString);
		if(matcher.find())
		{
		
		arrayofString=pattern.split(passString);
		for(String seprateString:arrayofString)
		{
			System.out.println( seprateString);
			//System.out.println(countwordssentence.countWords(seprateString));
			maximumWordsCount=Math.max(maximumWordsCount,countwordssentence.countWords(seprateString));	
		}
		System.out.println("Maximum words in given seprate sentence are: " +maximumWordsCount);
		}
		else
		{
			System.out.println("You Entered String Without QuestionMarks(?),FullStop(.) and ExclimantoryMarks(!)");
		}
		
	}
}
