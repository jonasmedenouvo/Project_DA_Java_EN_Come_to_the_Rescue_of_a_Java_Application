package com.hemebiotech.analytics.interfaces;

import java.io.IOException;
import java.util.List;
/**
 * 
 * @author jonas
 *
 */
public interface ISymptomReader {
/**
 * 
 * @return
 * @throws IOException 
 * @throws  
 */
	List<String> readSymptoms() throws IOException;
}
