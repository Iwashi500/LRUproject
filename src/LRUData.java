/*
 * LRUデータの中身のクラス
 * */

public class LRUData {
	private String key; // キー
	private String value; // データの中身
	private int finalStage; // 最後に使った時間

	// データの中身を代入する 時間も代入しておく
	public LRUData(String key, String value, int stage) {
		// キーを入れる
		this.key = key;
		// データを入れる
		this.value = value;
		// 最後に使った時間を更新
		// ここは0でもいいかも
		this.finalStage = stage;
	}

	// 中身を渡す
	public String getValue(int stage) {
		// 最後に使った時間を更新
		this.finalStage = stage;
		// データを返す
		return this.value;
	}

	// 最後に使った時間を返す
	public int getStage() {
		return this.finalStage;
	}

	// 自分のキーを返す
	public String getKey() {
		return this.key;
	}

}
