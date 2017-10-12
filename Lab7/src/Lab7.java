import java.util.*;

public class Lab7 {

	public Lab7() {
		
	}

	public static void main(String[] args) {
		LinkedList<String> one = new LinkedList<String>();
		LinkedList<String> two = new LinkedList<String>();
		LinkedList<String> twoDeep = new LinkedList<String>();
		one.add("Tulsa");
		one.add("Ada");
		one.add("Broken Arrow");
		one.add("Owasso");
		one.add(2,"OKC");
		two.add("74104");
		two.add("74135");
		two.add("foo");
		two.add("hello world");
		two.add("777");
		
		ListIterator<String> twoIter = two.listIterator();
		int i = 1;
		while(twoIter.hasNext()) {
		
		one.add(i,twoIter.next());
		i += 2;
	}
		ListIterator<String> oneIter = one.listIterator();
		
	while(oneIter.hasNext()) {
		oneIter.next();
		oneIter.next();
		oneIter.remove();
		
	}
	
	
	for(int x = 0; x < two.size();x++) {
		twoDeep.add(two.get(x));
	}
	
	}
}


