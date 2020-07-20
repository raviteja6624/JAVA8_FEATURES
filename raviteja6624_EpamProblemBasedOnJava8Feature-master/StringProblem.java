package epamLastTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringProblem {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("cat");
		list.add("epam");
		list.add("apple");
		list.add("ant");
		list.add("dog");
		List<String> b=list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
		System.out.print(b);

	}

}
