package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;
import com.hemebiotech.analytics.interfaces.ISymptomSort;

/**
 * 
 * @author jonas
 * Sort number of cases by symptoms
 */
public class SortSymptomDataToFile implements ISymptomSort {
	private Map<String, Integer> sortedMap;

	/**
	 * Constructor with @param
	 * @param sortedMap
	 */
	public SortSymptomDataToFile(Map<String, Integer> sortedMap) {
		this.sortedMap = sortedMap;
	}
/**
 * Sort number of cases by symptoms
 * @return Map
 */
	@Override
	public Map<String, Integer> sortData() {

		// Convert HashMap to TreeMap to sort in alphabetical order.

		return new TreeMap<>(sortedMap);

	}

}
