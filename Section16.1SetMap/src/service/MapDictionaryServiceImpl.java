package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import model.Dictionary;

public class MapDictionaryServiceImpl implements MapDictionaryService{
	DictionaryService dictionaryService = new DictionaryServiceImpl();

	@Override
	public Map<String, Dictionary> input() {
		Map<String, Dictionary> map = new HashMap<String, Dictionary>();
		while (true) {
			Dictionary dictionary = new Dictionary();
			dictionaryService.input(dictionary);
			map.put(dictionary.getKeyword(), dictionary);
			System.out.println("Them nua ko ?");
			String s = new Scanner(System.in).nextLine();
			if(s.equalsIgnoreCase("N")) {
				break;
			}		
		}
		return map;
	}

	@Override
	public void info(Map<String, Dictionary> mapDictionary) {
		for (Entry<String, Dictionary> entry : mapDictionary.entrySet()) {
			dictionaryService.info(entry.getValue());
		}
		
	}

	@Override
	public void filter(Map<String, Dictionary> mapDictionary) {
		System.out.println("Nhap key muon tim");
		String s = new Scanner(System.in).nextLine();
		Dictionary dictionary = mapDictionary.get(s);
		if (dictionary != null) {
			dictionaryService.info(dictionary);
		}else
			System.out.println("Khong tim thay");
		
	}

	@Override
	public void delete(Map<String, Dictionary> mapDictionary) {
		System.out.println("Nhap key muon xoa");
		String s = new Scanner(System.in).nextLine();
		mapDictionary.remove(s);
		System.out.println("Sau khi xoa: ");
		for (Entry<String, Dictionary> entry : mapDictionary.entrySet()) {
			dictionaryService.info(entry.getValue());
		}
		
	}

}
