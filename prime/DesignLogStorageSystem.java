package prime;

import java.util.*;

public class LogSystem {
	
	private TreeMap<String, Set<Integer>> data;
	private Map<String, Integer> gras;
	private String min;
	private String max;

	public LogSystem() {
		min = "2000:01:01:00:00:00";
		max = "2017:12:31:23:59:59";

		data = new TreeMap<>();
		gras = new HashMap<>();
		gras.put("Year", 4);
		gras.put("Month", 7);
		gras.put("Day", 10);
		gras.put("Hour", 13);
		gras.put("Minute", 16);
		gras.put("Second", 19);
	}
	
	public void put(int id, String timestamp) {
		data.putIfAbsent(timestamp, new HashSet<>());
		data.get(timestamp).add(id);
	}
	
	public List<Integer> retrieve(String s, String e, String gra) {
		int index = gras.get(gra);
		String start = s.substring(0, index) + min.substring(index);
		String end = s.substring(0, index) + max.substring(index);
		
		List<Integer> res = new ArrayList<>();
		for(Map.Entry<String, Set<Integer>> entry : data.subMap(start,  true, end, true).entrySet()) {
			res.addAll(entry.getValue());
		}
		
		return res;
	}
}
