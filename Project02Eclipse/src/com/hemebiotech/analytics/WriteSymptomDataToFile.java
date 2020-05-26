package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.hemebiotech.analytics.interfaces.ISymptomWriter;

public class WriteSymptomDataToFile implements ISymptomWriter {

	private String outpath;

	public WriteSymptomDataToFile(String outpath) {
		this.outpath = outpath;
	}

	/**
	 * generate a List of String to write in a File
	 */
	public Map<String, Integer> writeData(Map<String, Integer> treemap) {

		try (FileWriter writer = new FileWriter(outpath)) {
			for (Map.Entry<String, Integer> entry : treemap.entrySet()) {

				writer.write(entry.getKey() +": "+ entry.getValue() + "\n");

			}
			writer.flush();
			System.out.println("Document crée");
		} catch (IOException i) {
			
			i.printStackTrace();
		}
		return treemap;
	}

	

}