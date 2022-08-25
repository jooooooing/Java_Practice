package Algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] priorities = { 1, 1, 9, 1, 1, 1 };
		int location = 0;
		solution(priorities, location);

	}

	private static int solution(int[] priorities, int location) {
		int answer = 1;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		// key, value를 위해 Hashmap에 저장
		for (int i = 0; i < priorities.length; i++) {
			map.put(i, priorities[i]);
		}

//		List<Integer> keyList = new ArrayList<>(map.keySet());
//        for (int key : keyList) {
//            System.out.println("Key: " + key);
//            System.out.println(valueList.get(key));
//        }        

//		// key, value를 세트로 저장함
//		for (Entry<Integer, Integer> entrySet : map.entrySet()) {
//			System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
//		}

		// value값으로 List에 넣어서 오름차순 정렬함
//		List<Integer> valueList = new ArrayList<>(map.values());
//		Collections.sort(valueList, Collections.reverseOrder());
//        for (int value : valueList) {
//            System.out.println("Value: " + value);
//        }

		// 내림차순 정렬
		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});

		HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
		for (Map.Entry<Integer, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}

		System.out.println("location : " + location);
		int target = 0;
		
		List<Integer> keyList = new ArrayList<>(temp.keySet());
		List<Integer> valueList = new ArrayList<>(temp.values());
		
		System.out.println(keyList);
		System.out.println(valueList);
		
		for (Map.Entry<Integer, Integer> en : temp.entrySet()) {
			System.out.println("Key = " + en.getKey() + ", Value = " + en.getValue());
			if (location == en.getKey()) {
				target = temp.get(en.getKey());
			}
		}

		System.out.println("target : " + target);

		System.out.println(answer);

		return answer;

	}

}
