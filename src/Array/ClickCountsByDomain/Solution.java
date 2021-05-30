package Array.ClickCountsByDomain;

import java.util.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	private Map <String, Integer> countsMap = new TreeMap<>();
	//private Map <String, Integer> totalCounts = new HashMap<>();
	
	private void addToMap(String[] counts) {
		int count = 0;
		for (int i = 0; i < counts.length; i++) {
			String[] temp = counts[i].split(",");			
			String[] temp2 = temp[1].split("\\.");	
			/*for (int j = 0; j < temp2.length; j++) {
				System.out.println(temp2[j]);
			}*/
			String domain = "";
			for (int j = temp2.length-1; j > -1; j--) {
				// construct domain here				
				domain = temp2[j] + "." + domain;
				if(countsMap.containsKey(domain)){
					count = countsMap.get(domain) + Integer.valueOf(temp[0]);
					countsMap.put(domain, count);
				}
				else {
					countsMap.put(domain, Integer.valueOf(temp[0]));
				}
			}
		}
	}
	public Map calculateClicksByDomain(String[] counts) {
//		ArrayList<String> test = new ArrayList<>();
//		
//		List<String> test2 = new ArrayList<>();
//		
//		Map<String, Integer> test3 = new HashMap<>();
//		test3.put("david", 93);
//		test3.put("jack", null);
//		test3.put("charlie", new Integer(85));
//		int myGrade = test3.get("david");
//		System.out.println(myGrade);
		addToMap(counts);
		return countsMap;
	}
}
