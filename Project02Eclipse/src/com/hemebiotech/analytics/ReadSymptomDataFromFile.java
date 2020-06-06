package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.hemebiotech.analytics.interfaces.ISymptomReader;

/**
 * 
 * @author jonas Read selected file
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;

	/**
	 * Constructor with @param
	 * @param filepath
	 */
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * Read selected file
	 * @return List
	 */
	@Override
	public List<String> readSymptoms() throws IOException {
		List<String> result = new ArrayList<>();
		String line;

		try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {

			while ((line = reader.readLine()) != null) {
				result.add(line);

			}
		}
		return result;

	}
}
