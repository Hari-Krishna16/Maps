package de.zeroco.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsPractice {

	public static void main(String[] args) {

		Map<String, Object> hash = new HashMap<String, Object>();
		hash.put("Hari", 1);
		hash.put("Ravi", 2);
		hash.put("Chakri", 3);
		hash.put("Murali", 4);
		hash.put("Aravindh", 5);
		hash.put("Krishna", 6);
		for (Map.Entry<String, Object> entry : hash.entrySet()) {
			entry.getKey();
			entry.getValue();
//			System.out.println(entry);
//			System.out.println(entry.getKey() + " : " + entry.getValue() );
		}

		Map<String, Object> firstHash = new HashMap<String, Object>();
		firstHash.put("Krishna", 1);
		firstHash.putAll(hash);
		firstHash.putIfAbsent("Purna", 7);
		firstHash.put(null, 9);
		firstHash.put(null, 11);
		firstHash.put("", 9);
		firstHash.put("", 10);
//		Set<String> keyss = firstHash.keySet();
//	     System.out.println(keyss);
//		for (String values : firstHash.keySet()) {
//			Object obj = firstHash.get(values);
//			System.out.println(obj);
//	    	 System.out.println(s);
//		}
//		System.out.println(firstHash.entrySet());

		Map<Integer, String> secondHash = new HashMap<>();
		secondHash.put(1, "First");
		secondHash.put(2, "Second");
		secondHash.put(0, "its null 1");
		secondHash.put(0, "its null 2");
		secondHash.put(4, null);
		secondHash.put(4, null);
		secondHash.put(3, "Third");

//		System.out.println(secondHash.get(3));
//		for (Map.Entry<Integer, String> entry : secondHash.entrySet()) {
//			Integer keys = entry.getKey();
//			String values = entry.getValue();
//			System.out.println(keys + " : " + values);
//		}

//		boolean removed = secondHash.remove(8, "Second");
//        System.out.println(removed);
//        System.out.println(secondHash);
//
//		System.out.println(secondHash.get(0));
//		
//		System.out.println(secondHash.keySet());
//		
//		System.out.println(secondHash.entrySet());

//		Collection<String> valuesOfHash = secondHash.values();
//		System.out.println(valuesOfHash);
//		for (Map.Entry<Integer, String> entry : secondHash.entrySet()) {
//			String values = entry.getValue();
//			Integer i = entry.getKey();
//System.out.println(entry);
//		}

		Map<String, Integer> linkedHash = new LinkedHashMap<String, Integer>();
		linkedHash.put("India", 1);
		linkedHash.put("America", 2);
		linkedHash.put("UK", 3);
		linkedHash.put("Brezil", 4);
		linkedHash.put("Portugal", 5);
		linkedHash.put(null, 6);
		linkedHash.put(null, 7);
		linkedHash.put("", 8);
		linkedHash.put("", 9);
//		System.out.println(linkedHash.entrySet());

		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("Cricket", 1);
		treeMap.put("FootBall", 2);
		treeMap.put("Tennis", 3);
		treeMap.put("Kabbadi", 4);
		treeMap.put("", 5);
		treeMap.put("", 6);
//		String ceilingKey = treeMap.ceilingKey("Football");
//        System.out.println(ceilingKey);
//		 System.out.println(treeMap.entrySet());

		TreeMap<Integer, String> secondTreeMap = new TreeMap<Integer, String>();
		secondTreeMap.put(2, "two");
		secondTreeMap.put(1, "one");
		secondTreeMap.put(3, "three");
		secondTreeMap.put(6, "six");
		secondTreeMap.put(5, "five");
//		System.out.println(secondTreeMap.firstEntry());
//		System.out.println(secondTreeMap.lastEntry());
//		System.out.println(secondTreeMap.lastKey());
//		System.out.println(secondTreeMap.firstKey());
//		NavigableSet<Integer> descendingKeySet = secondTreeMap.descendingKeySet();
//		System.out.println(descendingKeySet);
//		System.out.println(secondTreeMap.pollFirstEntry());
//		System.out.println(secondTreeMap.pollLastEntry());
//		System.out.println(secondTreeMap.higherKey(3));
//		System.out.println(secondTreeMap.tailMap(3));
//		System.out.println(secondTreeMap.subMap(2, 6));
//		System.out.println(secondTreeMap.headMap(6));
//		NavigableMap<Integer, String> subMap = secondTreeMap.subMap(2, true, 4, false);
//		for (Map.Entry<Integer, String> values : subMap.entrySet()) {
//			System.out.println(values);
//		}
		System.out.println(getData(linkedHash));
		System.out.println(getKeys(linkedHash));
		System.out.println(getValues(linkedHash));
	}

	public static String getData(Map<String, Integer> linkedHash) {
		StringBuilder result = new StringBuilder();
		for (Map.Entry<String, Integer> entry : linkedHash.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			result.append(key + " ").append(value).append("\n");
		}
		return result.toString();
	}

	public static String getKeys(Map<String, Integer> linkedHash) {
		String key = null;
		for (String keys : linkedHash.keySet()) {
			key += keys + "\n";
		}
		return key;
	}

	public static Object getValues(Map<String, Integer> linkedHash) {
		return linkedHash.values();
	}
}
