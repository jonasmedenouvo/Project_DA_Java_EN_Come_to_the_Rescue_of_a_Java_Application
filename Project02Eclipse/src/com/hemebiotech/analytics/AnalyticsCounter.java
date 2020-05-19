package com.hemebiotech.analytics;

public class AnalyticsCounter {
	/**
	 * 
	 * @author jonas
	 * Application Launcher
	 */
	public static void main(String[] args) {
		
//		Read File
		String filepath = "symptoms.txt";
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(filepath);
		reader.getSymptoms();
		
//		Write output
		String outpath="result.out";
		WriteSymptomDataToFile writer = new WriteSymptomDataToFile(outpath);
		writer.writeData();
	}
}
