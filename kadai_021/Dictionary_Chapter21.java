package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	public static void searchWord() {
		HashMap<String,String>englishVocabulary = new HashMap<String,String>();
		
		englishVocabulary.put("apple","リンゴ");
		englishVocabulary.put("peach","桃");
		englishVocabulary.put("banana","バナナ");
		englishVocabulary.put("lemon","レモン");
		englishVocabulary.put("pear","梨");
		englishVocabulary.put("kiwi","キウィ");
		englishVocabulary.put("strawberry","いちご");
		englishVocabulary.put("grape","ぶどう");
		englishVocabulary.put("muscat","マスカット");
		englishVocabulary.put("cherry","サクランボ");
		
		String search[] = {"apple", "banana", "grape", "orange"};
		
		for (String str : search) {
	        if (englishVocabulary.containsKey(str)) {
	            System.out.println(str + "の意味は" + englishVocabulary.get(str));
	        } else {
	            System.out.println(str + "は辞書に存在しません");
	        }
	    }
	}
}
