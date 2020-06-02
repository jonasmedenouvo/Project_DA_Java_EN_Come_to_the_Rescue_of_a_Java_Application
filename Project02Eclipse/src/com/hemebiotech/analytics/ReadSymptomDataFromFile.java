package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.hemebiotech.analytics.interfaces.ISymptomReader;

/**
 * 
 * @author jonas
 * Read selected file
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;

//	Constructor
	public ReadSymptomDataFromFile() {
		super();
	}

	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it,
	 *                 one per line
	 */
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	public List<String> readSymptoms() throws IOException {
		List<String> result = new ArrayList<>();
		String line;
		if (filepath != null) {
			try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {

				while ((line = reader.readLine()) != null) {
					result.add(line);

				}
			} 
			return result;
		} else {
			System.out.println("Aucun fichier à lire sélectionné");
			return null;
		}

	}
}
