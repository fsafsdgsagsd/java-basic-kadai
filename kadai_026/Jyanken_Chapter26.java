package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	public String getMyChoice() {
		// キーボード入力の準備
		Scanner jyanken = new Scanner(System.in);
	 
		// メッセージの表示
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String input;
		
		while (true) {
			input= jyanken.next();
		    if("r".equals(input) || "s".equals(input) || "p".equals(input)) {
		        break;
		    } else {
		        System.out.println("不正な入力です。'r', 's', 'p'のいずれかを入力してください。");
		    }
		}
		
		jyanken.close();
		
		return input;
	}
	
	public String getRandom() {
		String[] rspArray = {"r","s","p"};		
		String random = rspArray[(int) Math.floor(Math.random() * 3)];
		return random;
	}
	
	public void playGame() {
		HashMap<String,String> type = new HashMap<String,String>();
				
		type.put("r","グー");
		type.put("s", "チョキ");
		type.put("p", "パー");
				
		String myChoice = getMyChoice();
		String choice = getRandom();
				
		System.out.println("自分の手は" + type.get(myChoice) + "," + "対戦相手の手は" + type.get(choice) );
				
		if(myChoice.equals(choice)) {
			System.out.println("あいこです");
		} else if ((myChoice.equals("r") && choice.equals("s")) ||
			      (myChoice.equals("s") && choice.equals("p"))||
			      (myChoice.equals("p") && choice.equals("r"))){
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");			
		}
	}
}
