package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hemebiotech.analytics.interfaces.ISymptomWriter;

public class WriteSymptomDataToFile implements ISymptomWriter {
	
	private String outpath;
	public WriteSymptomDataToFile (String outpath) {
		this.outpath = outpath;
	}
/**
 * generate a List of String to write in a File
 */
public List<String> writeData(){
	ArrayList<String> output = new ArrayList<>();

		try (FileWriter writer = new FileWriter(outpath)) {
			writer.write("headache: " + ReadSymptomDataFromFile.getHeadacheCount() + "\n");
			writer.write("rash: " + ReadSymptomDataFromFile.getRashCount() + "\n");
			writer.write("dialated pupils: " + ReadSymptomDataFromFile.getPupilCount() + "\n");
		} catch (IOException i) {
			i.printStackTrace();
		}
		return output;
}
}