package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hemebiotech.analytics.interfaces.ISymptomReader;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	private static int headacheCount = 0;
	private static int rashCount = 0; 
	private static int pupilCount = 0;
	
//	Getters

	public static int getHeadacheCount() {
		return headacheCount;
	}

	public static int getRashCount() {
		return rashCount;
	}

	public static int getPupilCount() {
		return pupilCount;
	}

	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	
	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<>();		
		String line;

		try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
//AMeliorer avec MAp et integrer variables dans la méthodes. Puis trie alphabetiques dans le writer
			//gerer exception si 
			while ((line = reader.readLine()) != null) {

				System.out.println("symptom from file: " + line);
				if (line.equals("headache")) {
					headacheCount++;
					System.out.println("number of headaches: " + headacheCount);
				} else if (line.equals("rash")) {
					rashCount++;
					System.out.println("number of rash: " + rashCount);

				} else if (line.contains("pupils")) {
					pupilCount++;
					System.out.println("number of pupils: " + pupilCount);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e+"message erreur");
			
		}
		return result;
	}

}
