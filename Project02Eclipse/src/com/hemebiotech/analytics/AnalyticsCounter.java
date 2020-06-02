package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	/**
	 * 
	 * @author jonas Application Launcher
	 */
	public static void main(String[] args) {
//		Read file
		String filepath = "symptoms.txt";
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(filepath);
		List<String> liste = null;
		try {
			liste = reader.readSymptoms();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		Count Symptoms
		CountSymptomDataFromFile counting = new CountSymptomDataFromFile(liste);
		Map<String, Integer> countReturn = counting.sortData();

//		Order symptoms
		OrderSymptomDataToFile orderfile = new OrderSymptomDataToFile(countReturn);
		Map<String, Integer> orderReturn = orderfile.orderData();

//		Write output
		String outpath = "result.out";
		WriteSymptomDataToFile writer = new WriteSymptomDataToFile(outpath, orderReturn);
		writer.writeData();
	}
}
