package com.hemebiotech.analytics.interfaces;

import java.io.IOException;
import java.util.Map;

public interface ISymptomWriter {
	Map<String, Integer> writeData() throws IOException;
}
