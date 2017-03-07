package com.wordscount;

import java.util.Scanner;

public class SentenceWordsFinding {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Any Sentens with QuestionMarks(?),FullStop(.) and ExclimantoryMarks(!):");
		String enterString=in.nextLine();
		if(enterString.isEmpty())
		{
			System.out.println("String is empty.");
		}
		else
		{
		System.out.println("You Enterd:"+"'" +enterString + "'"+" this string");
		CheckSentence checksentece=new CheckSentence();
		checksentece.checke(enterString);
		
		}

	}
}
