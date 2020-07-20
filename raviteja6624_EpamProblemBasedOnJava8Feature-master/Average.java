package epamLastTask;

import java.util.ArrayList;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter the size of list:");
		int size=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Enter "+size+" numbers:");
		for(int i=0;i<size;i++)
		{
			int number=sc.nextInt();
			al.add(number);
			
		}
		
		al.stream().mapToInt(i -> i).average().ifPresent(avg -> System.out.println("Average Of Numbers is"+" "+ avg));

	}

}

