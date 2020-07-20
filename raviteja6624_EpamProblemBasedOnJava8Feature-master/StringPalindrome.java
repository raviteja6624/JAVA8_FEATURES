package epamLastTask;

import java.util.ArrayList;
import java.util.List;

interface Palindrome
		{
		  List palindromeList(List al);
		}

		class StringParser
		{
		public static List findPalindrome(List l)
		{
		List<String> al=l;
		List<String> resultlist=new ArrayList<String>();
		for(int i=0;i<al.size();i++)
		{
		String s=al.get(i);
		String reverse=new StringBuilder(s).reverse().toString();
		if(s.equals(reverse))
		{
		resultlist.add(s);
		}
		else
		{
		al.remove(i);
		}
		}
		return resultlist;
		}
		}

		class printer
		{
		public void print(List al,Palindrome p)
		{
		al = p.palindromeList(al);
		System.out.println("Palindromes In List Are :"+al);
		}
		}

		 class StringPalindrome
		{
		public static void main(String[] args)
		{
		List<String> al=new ArrayList<String>();
		al.add("mom");
		al.add("dad");
		al.add("sis");
		al.add("bro");
		al.add("friend");
		printer p=new printer();
		p.print(al,(StringParser::findPalindrome));
		}


	}

