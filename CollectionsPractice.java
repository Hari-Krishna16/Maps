package de.zeroco.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsPractice {

	public static void main(String[] args) {

		Set<String> hash = new HashSet<String>();
		hash.add("Amar");
		hash.add("Akbar");
		hash.add("Bablu");
		hash.add("venky");
		hash.add("Hari");
//		System.out.println(hash);
		Set<String> secondHash = new HashSet<String>();
		secondHash.add("venky");
		secondHash.add("gajala");
		secondHash.add("ramana");
		secondHash.add("suribabu");
		secondHash.add("Bablu");
		secondHash.add("Hari");
		hash.addAll(secondHash);
//		System.out.println(secondHash);
//		System.out.println(hash);

		TreeSet<String> tree = new TreeSet<String>();
		tree.add("Aravindh");
		tree.add("Mohan");
		tree.add("Saddham");
		tree.add("Charan");
		System.out.println(tree);
//		System.out.println(tree.ceiling("Ravi"));
//		System.out.println(tree.floor("Kiran"));
//		System.out.println(tree.lower("Mohan"));
//		System.out.println(tree.pollFirst());
//		System.out.println(tree.pollLast());
//		Object cloned=tree.clone();
//		System.out.println(cloned);
		System.out.println(tree.descendingSet());
		System.out.println(tree.headSet("M", true));
		System.out.println(tree.subSet("Charan", "Saddham"));
	}

}
