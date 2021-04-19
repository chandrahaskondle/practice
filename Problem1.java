package myStudyApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Problem1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hi");
		list.add("hello");
		list.add("hello");
		list.add("sup");
		list.add("sup");
		list.add("sup");
		
		// use tree map to sort elements, sort is based on key.
		// we cannot sort based on value in tree sort
				
		// default order is asc, made it desc by overloading comparator
		
		Map<String, Integer> map = new TreeMap<>(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(s1.compareTo(s2) > 0)
					return -1;
				else if(s1.compareTo(s2)==0)
					return 0;
				else
					return 1;
			}
		});
		
		for(String s: list) {
			if(map.containsKey(s))
				map.put(s, map.get(s)+1);
			else
				map.put(s, 1);
		}
		
		for(Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}
	}
}
