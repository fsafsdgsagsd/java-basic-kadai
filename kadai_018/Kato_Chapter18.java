package kadai_018;

abstract public class Kato_Chapter18 {
	   public String familyName = "加藤";
	   public String givenName = "";
	   public String address = "住所は東京都中野区〇×です";
	   
	   public void commonIntroduce() {
		   System.out.println(address);
	   }
	   
	   abstract void eachIntroduce();
	   
	   public void execIntroduce() {
		   commonIntroduce();
		   eachIntroduce();
	   }
	   
}
