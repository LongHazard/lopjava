package main;

import java.util.Map;

import model.Dictionary;
import service.MapDictionaryService;
import service.MapDictionaryServiceImpl;

public class Main2 {
	public static void main(String[] args) {
		MapDictionaryService mapDictionaryService = new MapDictionaryServiceImpl();

		Map<String, Dictionary> mapDictionanary = mapDictionaryService.input();

	//	mapDictionaryService.info(mapDictionanary);
		mapDictionaryService.filter(mapDictionanary);
	//	mapDictionaryService.delete(mapDictionanary);
	}


}
