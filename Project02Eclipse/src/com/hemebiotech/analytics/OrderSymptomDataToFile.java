package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;
import com.hemebiotech.analytics.interfaces.ISymptomOrder;

public class OrderSymptomDataToFile implements ISymptomOrder {

	@Override
	public Map<String, Integer> orderData(Map<String, Integer> orderedMap) {

		// Convert HashMap to TreeMap.It will be sorted in natural order.
		Map<String, Integer> treeMap = new TreeMap<>(orderedMap);

		/**
		 * uncomment to show ordered symptoms
		 */
//		for (Entry<String, Integer> entry : treeMap.entrySet()) {
//			String key = entry.getKey();
//			Integer value = entry.getValue();
//
//			System.out.println(key + " " + value);
//
//		}
		return treeMap;

	}

}
