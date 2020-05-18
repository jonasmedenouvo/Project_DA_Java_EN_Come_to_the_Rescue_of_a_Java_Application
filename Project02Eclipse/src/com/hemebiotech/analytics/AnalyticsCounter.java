package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AnalyticsCounter {
	private static int headacheCount = 0; // initialize to 0
	private static int rashCount = 0; // initialize to 0
	private static int pupilCount = 0; // initialize to 0

	public static void main(String args[]) throws Exception {

		String line;

		try (BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"))) {

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
		}

		// next generate output

		try (FileWriter writer = new FileWriter("result.out")) {
			writer.write("headache: " + headacheCount + "\n");
			writer.write("rash: " + rashCount + "\n");
			writer.write("dialated pupils: " + pupilCount + "\n");
		}
	}
}
