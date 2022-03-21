package service;

import java.util.Map;
import java.util.Set;

import model.Dictionary;

public interface MapDictionaryService {
	Map<String, Dictionary> input();
	
	void info(Map<String, Dictionary> mapDictionary);

	void filter(Map<String, Dictionary> mapDictionary);

	void delete(Map<String, Dictionary> mapDictionary);

}
