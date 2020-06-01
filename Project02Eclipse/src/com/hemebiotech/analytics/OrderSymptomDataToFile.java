package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;
import com.hemebiotech.analytics.interfaces.ISymptomOrder;

public class OrderSymptomDataToFile implements ISymptomOrder {
	private Map<String, Integer> orderedMap;

	public OrderSymptomDataToFile(Map<String, Integer> orderedMap) {
		this.orderedMap = orderedMap;
	}

	@Override
	public Map<String, Integer> orderData() {

		// Convert HashMap to TreeMap to sort in alphabetical order.

		return new TreeMap<>(orderedMap);

	}

}
