package de.zeroco.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {
//		LinkedList<Object> list=new LinkedList<Object>();
//		list.add(123);
//		list.add("number one");
//		list.add("Hari Krishna");
//		list.add(1,"number two");
//	Iterator<Object> itr= list.iterator();
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}

		String arrays[] = { "Hari", "Praven", "Naveen" };
//		LinkedList<String> linkedList=new LinkedList<String>();
//		linkedList.add("number one");
//		linkedList.add("Hari Krishna");
//		linkedList.add(1,"number two");

		LinkedList<String> firstList = new LinkedList<String>();
		LinkedList<String> secondList = new LinkedList<String>();
		secondList.add("Hello");
		secondList.add("world");
		secondList.add("we are number one");
		firstList.addAll(secondList);
		System.out.println(firstList);
		System.out.println(firstList.get(1));
		System.out.println(getAddData(secondList, arrays));
		

//		LinkedList<String> firstList = new LinkedList<String>();
//		firstList.add("Hari");
//		firstList.add("ravi");
//		firstList.add("shiva");

//		firstList.replaceAll(s->"Hero");
//		System.out.println(firstList);

//		LinkedList<String> secondList = new LinkedList<String>();
//		secondList.add("Muraga");
//		secondList.add("kiran");
//		secondList.add("ravi");
//		System.out.println(secondList);
//		firstList.retainAll(secondList);
//		System.out.println(firstList);
//
//		ArrayList<String> arrayList = new ArrayList<String>();
//		arrayList.add("one");
//		arrayList.add("two");
//		arrayList.add("Three");
//		arrayList.add("four");
//		arrayList.set(1, "and");
//		System.out.println(arrayList);

//		Stack<String> stack = new Stack<String>();  
//		stack.push("Hari");  
//		stack.push("Gurava");  
//		stack.push("Ravi");  
//		stack.push("Akhil");  
//		stack.push("Sudhakar"); 
//		System.out.println(stack);
//		System.out.println(stack.search("Hari"));

		Set<Object> hash = new HashSet<Object>();
//		hash.add("Hari");
//		hash.add("Krishna");
//		hash.add("Praven");
//		hash.add("Kiran");
		hash.add("wwe");
		hash.add("wwe");
		hash.add(null);
		hash.add("");
		hash.add(1);
		hash.add(true);
//		System.out.println(hash);

		Set<String> linkedHash = new LinkedHashSet<String>();
		linkedHash.add("Hari");
		linkedHash.add("Krishna");
		linkedHash.add(null);
		linkedHash.add(null);
		linkedHash.add("");
		linkedHash.add("");
		linkedHash.add("praven");
		linkedHash.add("Kiran");
		System.out.println(linkedHash);

		Set<Object> tree = new TreeSet<Object>();
//		tree.add("Hari");
//		tree.add("Krishna");
//		tree.add("Praven");
		tree.add("Kiran");
//		tree.add(true);
//		tree.add(1);
//		System.out.println(tree);
		
		
	}

	public static List<String> getAddData(List<String> listData, String arrays[]) {
		listData.addAll(Arrays.asList(arrays));
		return listData;
	}
}
