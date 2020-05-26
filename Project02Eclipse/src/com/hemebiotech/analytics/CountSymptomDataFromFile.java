package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
//import java.util.Map.Entry;

import com.hemebiotech.analytics.interfaces.ISymptomCounter;

import java.util.Set;

public class CountSymptomDataFromFile implements ISymptomCounter {
	/**
	 * Count number of cases by symptoms
	 * 
	 * @param readFiles
	 * @return hmap
	 */
	public Map<String, Integer> sortData(List<String> readFiles) {

		Set<String> set = new HashSet<>(readFiles);
		Map<String, Integer> hmap = new HashMap<>();

		for (String string : set) {
			int occurrences = Collections.frequency(readFiles, string);

			hmap.put(string, occurrences);
		}
		/**
		 * uncomment to show symptoms
		 */
//		for (Entry<String, Integer> entry : hmap.entrySet()) {
//			String key = entry.getKey();
//			Integer value = entry.getValue();
//
//			System.out.println(key + " " + value);
//
//		}
		return hmap;
	}

}
