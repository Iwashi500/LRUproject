
public class LRUData {
	private String value; // データの中身
	private int finalStage; // 最後に使った時間

	// コンストラクタ
	public LRUData(String value, int stage) {
		// データを入れる
		this.value = value;
		// 最後に使った時間を更新
		// ここは0でもいいかも
		this.finalStage = stage;
	}

	public String getValue(int stage) {
		// 最後に使った時間を更新
		this.finalStage = stage;
		// データを返す
		return this.value;
	}
}
