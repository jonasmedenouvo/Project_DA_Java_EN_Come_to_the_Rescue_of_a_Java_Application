package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import com.hemebiotech.analytics.interfaces.ISymptomWriter;

public class WriteSymptomDataToFile implements ISymptomWriter {

	private String outpath;
	private Map<String, Integer> treemap;

	public WriteSymptomDataToFile(String outpath,Map<String, Integer> treemap) {
		this.outpath = outpath;
		this.treemap = treemap;
	}

	/**
	 * generate a List of String to write in a File
	 */
	public Map<String, Integer> writeData() {

		try (FileWriter writer = new FileWriter(outpath)) {
			for (Map.Entry<String, Integer> entry : treemap.entrySet()) {

				writer.write(entry.getKey() + ": " + entry.getValue() + "\n");

			}
			writer.flush();
			System.out.println("Document crée");
		} catch (IOException i) {

			i.printStackTrace();
		}
		return treemap;
	}

}