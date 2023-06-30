package de.zeroco.collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.zeroco.utility.Utility;

public class MapsTask {

	public static void main(String[] args) {
//		String jsonInput = "{\"first\":{\"second\":{\"third\":{\"fourth\":5}}}}";
//		String keyPath = "first.second.third.fourth";
//		System.out.println(getJsonValue(jsonInput, keyPath));
//		System.out.println(getValueOfJson(jsonInput));

		Map<String, Object> firstMap = new LinkedHashMap<String, Object>();
		firstMap.put("first", "Shiva");
		firstMap.put("second", "Hari");
		firstMap.put("third", "Mohan");
		firstMap.put("fourth", "Kiran");

		Map<String, Object> secondMap = new LinkedHashMap<String, Object>();
		secondMap.put("first", "Shiva");
		secondMap.put("second", "Kiran");
		secondMap.put("third", "Niraj");
		secondMap.put("fourth", "Madhan");

		Map<String, Object> thirdMap = new LinkedHashMap<String, Object>();
		thirdMap.put("first", "Shiva");
		thirdMap.put("second", "Krishna");
		thirdMap.put("third", "Niraj");
		thirdMap.put("fourth", "Purna");

		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		list.add(firstMap);
		list.add(secondMap);
		list.add(thirdMap);

//		System.out.println(getMapWithKeyValue(list, "first", "Purna"));
		System.out.println(getValuesWithKey(list, "third"));
	}

	@SuppressWarnings("unchecked")
	public static Object getJsonValue(String jsonString, String keyPath) {
		if ((Utility.isBlank(jsonString)) && (Utility.isBlank(keyPath))) {
			return null;
		}
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			Map<String, Object> map = objectMapper.readValue(jsonString, Map.class);
			String[] keys = keyPath.split("\\.");
			for (int i = 0; i < keys.length - 1; i++) {
				map = (Map<String, Object>) map.get(keys[i]);
			}
			return map.get(keys[keys.length - 1]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public static Object getValue(String jsonString) {
		if ((Utility.isBlank(jsonString))) {
			return null;
		}
		Object finalOutput = null;
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			Map<String, Object> map = objectMapper.readValue(jsonString, Map.class);
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				Object value = entry.getValue();
				if (value instanceof Map) {
					finalOutput = getValue(objectMapper.writeValueAsString(value));
				} else {
					finalOutput = value;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return finalOutput;
	}

	public static Map<String, Object> getMapWithKeyValue(List<Map<String, Object>> list, String key, String value) {
		if ((Utility.isBlank(list)) && (Utility.isBlank(key)) && (Utility.isBlank(value))) {
			return null;
		}
		for (Map<String, Object> map : list) {
			if (map.containsKey(key) && map.get(key).equals(value)) {
				return map;
			}
		}
		return null;
	}

	public static String getValuesWithKey(List<Map<String, Object>> list, String key) {
		if ((Utility.isBlank(list)) && (Utility.isBlank(key))) return null;
		String values ="";
		for (Map<String, Object> map : list) {
			if (map.containsKey(key)) {
				values =values+map.get(key)+",";
			}
		}
		return values;
	}

}