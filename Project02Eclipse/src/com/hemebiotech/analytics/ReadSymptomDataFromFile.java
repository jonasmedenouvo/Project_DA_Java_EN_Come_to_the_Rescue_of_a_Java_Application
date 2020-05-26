package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.hemebiotech.analytics.interfaces.ISymptomReader;

/**
 * Simple brute force implementation
 *
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

	public List<String> getSymptoms() {
		List<String> result = new ArrayList<>();
		String line;

		try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
//TODO AMeliorer avec MAp et integrer variables dans la méthodes. Puis trie alphabetiques dans le writer
			// TODO gerer exception si
			while ((line = reader.readLine()) != null) {
				result.add(line);

			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e + "message erreur");

		}
		return result;
	}

}
