package kadai_018;

public abstract class Kato_Chapter18 {
	//姓フィールド
	public String familyName = "加藤";
	//名フィールド
	public String givenName = "";
	//住所フィールド
	public String address = "東京都中野区〇×";
	
	//【メソッド】共通の紹介
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}

	//【メソッド】個別の紹介
	abstract public void eachIntroduce();

	//【メソッド】紹介を実行する
	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce();
		System.out.println();
	}
}
