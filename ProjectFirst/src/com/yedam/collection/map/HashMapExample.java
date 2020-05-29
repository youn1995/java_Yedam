package com.yedam.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void getMap(Map<Integer, String> map) {
		Set<Integer> set = map.keySet();
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			Integer num = iter.next();
			if (num >= 80) {
				String val = map.get(num);
				System.out.println(val);
			}
		}
	}

	public static void main(String[] args) {
		Map<Integer, String> scores = new HashMap<Integer, String>();
		scores.put(59, "Hong");
		scores.put(49, "Hang");
		scores.put(89, "Heng");
		scores.put(99, "Hing");
		System.out.println("80이상인 사람");
		getMap(scores);
		System.out.println("=====");
		
		List<String> list = new ArrayList<>();
		list.add("Howg");
		list.get(0);

		Set<String> set = new HashSet<>(); // 중복값 불가
		set.add("Hong");
		set.add("Hwang");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str.toString());
		}

		Map<String, Integer> map = new HashMap<>();
		// key : value -> Map.Entry
		map.put("Hong", 98);
		map.put("Hwang", 90);
		map.put("Hong", 80); // key값이 동일하면 기존것에 대치됨

		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("Key: " + key + " , Value: " + value);
		}
		Set<Entry<String, Integer>> entSet = map.entrySet();
		Iterator<Entry<String, Integer>> entIter = entSet.iterator();
		while (entIter.hasNext()) {
			Entry<String, Integer> entry = entIter.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("Key: " + key + " , Value: " + value);
		}
	}
}
