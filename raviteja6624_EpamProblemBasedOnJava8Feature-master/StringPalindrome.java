import java.util.*;
interface Palindrome
{
  List<String> palindromeList(List<String> al);
}

class StringParser
{
public static List<String> findPalindrome(List<String> l)
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

class MyPrinter
{
public void print(List<String> al,Palindrome p)
{
al = p.palindromeList(al);
System.out.println("Palindromes In List Area :"+al);
}
}

public class StringPalindrome
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
List<String> al=new ArrayList<String>();
System.out.println("enter the list size");
int n =sc.nextInt();
System.out.println("enter the elements in the list");
for(int i=0;i<n;i++)
{
al.add(new Scanner(System.in).next());
}
MyPrinter mp=new MyPrinter();
mp.print(al,(StringParser::findPalindrome));
sc.close();
}
}

