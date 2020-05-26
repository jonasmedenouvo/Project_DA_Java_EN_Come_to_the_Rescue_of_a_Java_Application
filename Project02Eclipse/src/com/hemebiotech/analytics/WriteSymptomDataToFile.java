package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hemebiotech.analytics.interfaces.ISymptomWriter;

public class WriteSymptomDataToFile implements ISymptomWriter {

	private String outpath;

	public WriteSymptomDataToFile(String outpath) {
		this.outpath = outpath;
	}

	/**
	 * generate a List of String to write in a File
	 */
	public Map<String, Integer> writeData(List<String> readList) {
		Map<String, Integer> output = new HashMap<>();

		try (FileWriter writer = new FileWriter(outpath)) {
			for (Map.Entry<String, Integer> entry : output.entrySet()) {

				writer.write(entry.getKey() + entry.getValue() + "\n");

			}

			writer.flush();
		} catch (IOException i) {
			i.printStackTrace();
		}
		return output;
	}

	@Override
	public List<String> writeData() {
		// TODO Auto-generated method stub
		return null;
	}
}