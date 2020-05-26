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
		//etapes Lire, compter, trier, ecrire
//		Read file
		String filepath = "symptoms.txt";
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(filepath);
		List<String> liste =reader.getSymptoms();
		
//		Count Symptoms
		CountSymptomDataFromFile counting = new CountSymptomDataFromFile();
		Map<String, Integer> countReturn = counting.sortData(liste);
		
////		Order symptoms
		OrderSymptomDataToFile orderfile =new OrderSymptomDataToFile();
		Map<String, Integer> OrderReturn = orderfile.orderData(countReturn);
		
		
//		Write output
		String outpath="result.out";
		WriteSymptomDataToFile writer = new WriteSymptomDataToFile(outpath);
		writer.writeData(OrderReturn);
	}
}
