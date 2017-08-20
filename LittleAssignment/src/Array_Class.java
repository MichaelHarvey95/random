import java.util.ArrayList;
import java.util.List;

public class Array_Class{
	
	public static void main(String [] args){
			List<String> names = new ArrayList<String>(3); // 3 because we expect the list 
			// to have 3 entries.  If we didn't know how many entries we expected, we
			// could leave this empty or use a LinkedList instead
			names.add("Alice");
			names.add("Bob");
			names.add("Charlie");
			System.out.println(names.get(2)); // prints "Charlie"
			System.out.println(names); // prints the whole list
			for (String name: names) {
				System.out.println(name);  // prints the names in turn.
			}
	}
}