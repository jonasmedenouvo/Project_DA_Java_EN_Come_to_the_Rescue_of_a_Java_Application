package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;
import com.hemebiotech.analytics.interfaces.ISymptomOrder;

/**
 * 
 * @author jonas
 * Sort number of cases by symptoms
 */
public class SortSymptomDataToFile implements ISymptomOrder {
	private Map<String, Integer> sortedMap;

	public SortSymptomDataToFile(Map<String, Integer> sortedMap) {
		this.sortedMap = sortedMap;
	}

	@Override
	public Map<String, Integer> sortData() {

		// Convert HashMap to TreeMap to sort in alphabetical order.

		return new TreeMap<>(sortedMap);

	}

}
