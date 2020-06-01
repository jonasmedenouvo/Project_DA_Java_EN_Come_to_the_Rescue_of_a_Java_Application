package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	/**
	 * 
	 * @author jonas
	 * Application Launcher
	 */
	public static void main(String[] args) {
//		Read file
		String filepath = "symptoms.txt";
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(filepath);
		List<String> liste =reader.getSymptoms();
		
//		Count Symptoms
		CountSymptomDataFromFile counting = new CountSymptomDataFromFile(liste);
		Map<String, Integer> countReturn = counting.sortData();
		
//		Order symptoms
		OrderSymptomDataToFile orderfile =new OrderSymptomDataToFile(countReturn);
		Map<String, Integer> orderReturn = orderfile.orderData();
		
		
//		Write output
		String outpath="result.out";
		WriteSymptomDataToFile writer = new WriteSymptomDataToFile(outpath, orderReturn);
		writer.writeData();
	}
}
