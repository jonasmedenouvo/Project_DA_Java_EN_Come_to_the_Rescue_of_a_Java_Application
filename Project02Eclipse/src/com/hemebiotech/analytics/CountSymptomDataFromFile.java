package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import com.hemebiotech.analytics.interfaces.ISymptomCounter;

import java.util.Set;

public class CountSymptomDataFromFile implements ISymptomCounter {
	private List<String> readFiles;

	public CountSymptomDataFromFile(List<String> readFiles) {
		this.readFiles = readFiles;
	}

	/**
	 * Count number of cases by symptoms
	 * 
	 * @param readFiles
	 * @return hmap
	 */
	public Map<String, Integer> sortData() {

		Set<String> set = new HashSet<>(readFiles);
		Map<String, Integer> hmap = new HashMap<>();

		for (String string : set) {
			int occurrences = Collections.frequency(readFiles, string);

			hmap.put(string, occurrences);
		}

		return hmap;
	}

}
