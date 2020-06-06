package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hemebiotech.analytics.interfaces.ISymptomCounter;

/**
 * 
 * @author jonas
 * Count number of cases by symptoms
 */
public class CountSymptomDataFromFile implements ISymptomCounter {
	private List<String> readFiles;

	/**
	 * Constructor with @param
	 * @param readFiles
	 */
	public CountSymptomDataFromFile(List<String> readFiles) {
		this.readFiles = readFiles;
	}

	/**
	 * Count number of cases by symptoms
	 * @return Map
	 */
	@Override
	public Map<String, Integer> countData() {

		Map<String, Integer> hmap = new HashMap<>();
		for (String string : readFiles) {

			if (hmap.containsKey(string)) {
				hmap.put(string, hmap.get(string) + 1);

			} else {
				hmap.put(string, 1);
			}
		}

		return hmap;
	}

}
