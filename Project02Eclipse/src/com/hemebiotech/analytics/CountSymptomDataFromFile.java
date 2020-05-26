package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CountSymptomDataFromFile {

	public void sortData(List<String> readFiles) {

	    Set<String> set = new HashSet<>(readFiles);
	      HashMap<String, Integer> hmap = new HashMap<>();

		for (String string : set) {
			int occurrences = Collections.frequency(readFiles, string);
				//System.out.println(string+": "+occurrences);	

				hmap.put(string, occurrences);
				System.out.println(hmap);	


			}

		}
		
	}


