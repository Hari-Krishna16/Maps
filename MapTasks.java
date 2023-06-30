package de.zeroco.collections;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.zeroco.utility.Utility;

public class MapTasks {

	public static final String VALUE_TO_REPLACE = "item";
	public static final String REPLACE_VALUE = "api";

	public static void main(String[] args) {
		String jsonString = "{\"info\":{\"_postman_id\":\"9d7fbbff-c183-4aee-a6b0-3c3141015dab\",\"name\":\"External Api base\",\"schema\":\"https://schema.getpostman.com/json/collection/v2.0.0/collection.json\",\"_exporter_id\":\"14898051\",\"_collection_link\":\"https://universal-moon-207046.postman.co/workspace/My-Workspace~f7537d26-afae-49bc-8f05-f0f5b68fdb40/collection/14898051-9d7fbbff-c183-4aee-a6b0-3c3141015dab?action=share&creator=14898051&source=collection_link\"},\"item\":[{\"name\":\"Get\",\"request\":{\"auth\":{\"type\":\"bearer\",\"bearer\":{\"token\":\"eyJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2ODYyMTg2NjAsImV4cCI6MTY4NjgyMzQ2MCwiZCI6InFCZjhGbTZMTzhBPSIsIm5hbWUiOiJKYXZhVGVhbSIsImxvZ2luVW5pcXVlIjoidGVhbTQwMSIsInVzZXJDb2RlIjoiVVNSLTQiLCJ1aWQiOiJGOUVGMDZGNkMxNjIyMzNFREYyREY4MzU0RTVFQjhBMyIsInJvbGVOYW1lIjoiSW1wbGVtZW50YXRpb24iLCJyb2xlQ29kZSI6IkltcGxlbWVudGF0aW9uIiwidHlwZSI6IkEifQ.pHYWtTBxezD8_RqcUEK_Hi6ncteVN5119Oh-yoXoefw\"}},\"method\":\"GET\",\"header\":[],\"url\":\"http://localhost/zc-v3.1-client-svc/2.0/zeco/externalApiBaseUrl/get/11FFD5814054DD13E06634029136E461/edit\"},\"response\":[]},{\"name\":\"Delete\",\"request\":{\"auth\":{\"type\":\"bearer\",\"bearer\":{\"token\":\"eyJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2ODYyMTg2NjAsImV4cCI6MTY4NjgyMzQ2MCwiZCI6InFCZjhGbTZMTzhBPSIsIm5hbWUiOiJKYXZhVGVhbSIsImxvZ2luVW5pcXVlIjoidGVhbTQwMSIsInVzZXJDb2RlIjoiVVNSLTQiLCJ1aWQiOiJGOUVGMDZGNkMxNjIyMzNFREYyREY4MzU0RTVFQjhBMyIsInJvbGVOYW1lIjoiSW1wbGVtZW50YXRpb24iLCJyb2xlQ29kZSI6IkltcGxlbWVudGF0aW9uIiwidHlwZSI6IkEifQ.pHYWtTBxezD8_RqcUEK_Hi6ncteVN5119Oh-yoXoefw\"}},\"method\":\"PATCH\",\"header\":[],\"url\":\"http://localhost/zc-v3.1-client-svc/2.0/zeco/externalApiBaseUrl/softDelete/11FFD5814054DD13E06634029136E461\"},\"response\":[]},{\"name\":\"List\",\"request\":{\"auth\":{\"type\":\"bearer\",\"bearer\":{\"token\":\"eyJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2ODYyMTg2NjAsImV4cCI6MTY4NjgyMzQ2MCwiZCI6InFCZjhGbTZMTzhBPSIsIm5hbWUiOiJKYXZhVGVhbSIsImxvZ2luVW5pcXVlIjoidGVhbTQwMSIsInVzZXJDb2RlIjoiVVNSLTQiLCJ1aWQiOiJGOUVGMDZGNkMxNjIyMzNFREYyREY4MzU0RTVFQjhBMyIsInJvbGVOYW1lIjoiSW1wbGVtZW50YXRpb24iLCJyb2xlQ29kZSI6IkltcGxlbWVudGF0aW9uIiwidHlwZSI6IkEifQ.pHYWtTBxezD8_RqcUEK_Hi6ncteVN5119Oh-yoXoefw\"}},\"method\":\"POST\",\"header\":[{\"key\":\"Content-Type\",\"value\":\"application/json\",\"type\":\"text\"}],\"body\":{\"mode\":\"raw\",\"raw\":\"{\\\"page\\\":1,\\\"rows\\\":10,\\\"sort\\\":[],\\\"dependents\\\":{},\\\"zcGrid\\\":true}\"},\"url\":\"http://localhost/zc-v3.1-client-svc/2.0/zeco/externalApiBaseUrl/list\"},\"response\":[]},{\"name\":\"Save\",\"request\":{\"auth\":{\"type\":\"bearer\",\"bearer\":{\"token\":\"eyJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2ODYyMTg2NjAsImV4cCI6MTY4NjgyMzQ2MCwiZCI6InFCZjhGbTZMTzhBPSIsIm5hbWUiOiJKYXZhVGVhbSIsImxvZ2luVW5pcXVlIjoidGVhbTQwMSIsInVzZXJDb2RlIjoiVVNSLTQiLCJ1aWQiOiJGOUVGMDZGNkMxNjIyMzNFREYyREY4MzU0RTVFQjhBMyIsInJvbGVOYW1lIjoiSW1wbGVtZW50YXRpb24iLCJyb2xlQ29kZSI6IkltcGxlbWVudGF0aW9uIiwidHlwZSI6IkEifQ.pHYWtTBxezD8_RqcUEK_Hi6ncteVN5119Oh-yoXoefw\"}},\"method\":\"POST\",\"header\":[{\"key\":\"Content-Type\",\"value\":\"application/json\",\"type\":\"text\"}],\"body\":{\"mode\":\"raw\",\"raw\":\"{\\r\\n  \\\"name\\\":\\\"Location API\\\",\\r\\n  \\\"code\\\":\\\"loc_api\\\",\\r\\n  \\\"baseUrl\\\":\\\"https://www.googleapis.com/geolocation/v1\\\",\\r\\n  \\\"description\\\":\\\"To get loc details\\\"\\r\\n}\"},\"url\":\"http://localhost/zc-v3.1-client-svc/2.0/zeco/externalApiBaseUrl\"},\"response\":[]},{\"name\":\"Update\",\"request\":{\"auth\":{\"type\":\"bearer\",\"bearer\":{\"token\":\"eyJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2ODYyMTg2NjAsImV4cCI6MTY4NjgyMzQ2MCwiZCI6InFCZjhGbTZMTzhBPSIsIm5hbWUiOiJKYXZhVGVhbSIsImxvZ2luVW5pcXVlIjoidGVhbTQwMSIsInVzZXJDb2RlIjoiVVNSLTQiLCJ1aWQiOiJGOUVGMDZGNkMxNjIyMzNFREYyREY4MzU0RTVFQjhBMyIsInJvbGVOYW1lIjoiSW1wbGVtZW50YXRpb24iLCJyb2xlQ29kZSI6IkltcGxlbWVudGF0aW9uIiwidHlwZSI6IkEifQ.pHYWtTBxezD8_RqcUEK_Hi6ncteVN5119Oh-yoXoefw\"}},\"method\":\"PUT\",\"header\":[{\"key\":\"Content-Type\",\"value\":\"application/json\",\"type\":\"text\"}],\"body\":{\"mode\":\"raw\",\"raw\":\"{\\r\\n    \\\"name\\\": \\\"Location API\\\",\\r\\n    \\\"code\\\": \\\"loc_api\\\",\\r\\n    \\\"baseUrl\\\": \\\"https://www.googleapis.com/geolocation/v1\\\",\\r\\n    \\\"description\\\": \\\"To get location details\\\",\\r\\n    \\\"loginUrl\\\": \\\"https://www.googleapis.com/geolocation/login\\\",\\r\\n    \\\"settings\\\": {\\r\\n        \\\"headers\\\": {\\r\\n            \\\"content-type\\\": \\\"application/json\\\"\\r\\n        }\\r\\n    },\\r\\n    \\\"loginUrlSettings\\\": {\\r\\n        \\\"headers\\\": {\\r\\n            \\\"content-type\\\": \\\"application/json\\\"\\r\\n        }\\r\\n    }\\r\\n}\"},\"url\":\"http://localhost/zc-v3.1-client-svc/2.0/zeco/externalApiBaseUrl/11FFD5814054DD13E06634029136E461\"},\"response\":[]},{\"name\":\"Get Settings\",\"request\":{\"auth\":{\"type\":\"bearer\",\"bearer\":{\"token\":\"eyJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2ODYyMTg2NjAsImV4cCI6MTY4NjgyMzQ2MCwiZCI6InFCZjhGbTZMTzhBPSIsIm5hbWUiOiJKYXZhVGVhbSIsImxvZ2luVW5pcXVlIjoidGVhbTQwMSIsInVzZXJDb2RlIjoiVVNSLTQiLCJ1aWQiOiJGOUVGMDZGNkMxNjIyMzNFREYyREY4MzU0RTVFQjhBMyIsInJvbGVOYW1lIjoiSW1wbGVtZW50YXRpb24iLCJyb2xlQ29kZSI6IkltcGxlbWVudGF0aW9uIiwidHlwZSI6IkEifQ.pHYWtTBxezD8_RqcUEK_Hi6ncteVN5119Oh-yoXoefw\"}},\"method\":\"GET\",\"header\":[],\"url\":\"http://localhost/zc-v3.1-client-svc/2.0/zeco/externalApiBaseUrl/settings/64D9D9BE4A621E9C13A2C73404646655\"},\"response\":[]}]}";
		String values[] = { "info", "auth", "response" };
		System.out.println(getStringJsonFile(jsonString, values));
	}

	@SuppressWarnings("unchecked")
	public static String getStringJsonFile(String jsonString, String[] keys) {
		if ((Utility.isBlank(jsonString)) && (Utility.isBlank(keys))) {
			return null;
		}
		String values = null;
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			Map<String, Object> jsonMap = objectMapper.readValue(jsonString, Map.class);
			for (String key : keys) {
				removeKeysFromMap(jsonMap, key);
			}
			values = objectMapper.writeValueAsString(jsonMap);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return values.replace(VALUE_TO_REPLACE, REPLACE_VALUE);
	}

	@SuppressWarnings("unchecked")
	public static Object removeKeysFromMap(Map<String, Object> map, String keys) {
		if ((Utility.isBlank(map)) && (Utility.isBlank(keys))) {
			return null;
		}
		Object value = null;
		if (map.containsKey(keys)) {
			map.remove(keys);
		} else {
			for (Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
				Map.Entry<String, Object> entry = iterator.next();
				value = entry.getValue();
				if (value instanceof Map) {
					return removeKeysFromMap((Map<String, Object>) value, keys);
				} else if (value instanceof List) {
					return removeKeysFromList((List<Object>) value, keys);
				}
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public static List<Object> removeKeysFromList(List<Object> list, String keys) {
		if ((Utility.isBlank(list)) && (Utility.isBlank(keys))) {
			return null;
		}
		for (Iterator<Object> iterator = list.iterator(); iterator.hasNext();) {
			Object obj = iterator.next();
			if (obj instanceof Map) {
				removeKeysFromMap((Map<String, Object>) obj, keys);
			}
		}
		return list;
	}
}
