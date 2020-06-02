package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;
/**
 * 
 * @author jonas 
 * Application Launcher
 */
public class AnalyticsCounter {
	
	public static void main(String[] args) {
		
		try {
//			Read file
			String filepath = "symptoms.txt";
			ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(filepath);
			List<String> liste = null;
			liste = reader.readSymptoms();
			
//			Count Symptoms
			CountSymptomDataFromFile counting = new CountSymptomDataFromFile(liste);
			Map<String, Integer> countReturn = counting.countData();

//			Sort symptoms
			SortSymptomDataToFile sortfile = new SortSymptomDataToFile(countReturn);
			Map<String, Integer> sortReturn = sortfile.sortData();

//			Write output
			String outpath = "result.out";
			WriteSymptomDataToFile writer = new WriteSymptomDataToFile(outpath, sortReturn);
			writer.writeData();

			
		} catch (IOException e) {
			System.out.println("ERROR: "+e.getMessage());
			e.printStackTrace();
			System.exit(-1);
		}


		
	}
}
