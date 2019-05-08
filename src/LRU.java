import java.util.HashMap;
import java.util.Map;

public class LRU {
	private int size = 2; // キャッシュの最大サイズ
	private int stage = 0; // 現在の時間
	private Map<String, LRUData> data = new HashMap<>(); // 保存しているデータ

	// データの挿入、入れる
	public void input(String key, String value) {
		LRUData lruData = new LRUData(key, value, stage);
		data.put(key, lruData);
		// 容量がオーバーしている場合はデータ一つ消す
		if (size < data.size()) {
			deleteData();
		}
		stage++; // 時間更新
	}

	private void deleteData() {
		int minStage = 10000;
		String key = ""; // 消去するキー
		// 一番使われていないデータを探す
		for (LRUData lruData : data.values()) {
			if (minStage > lruData.getStage()) {
				minStage = lruData.getStage();
				key = lruData.getKey();
			}
		}
		// データの消去
		data.remove(key);
	}

	// データを取り出す、使う
	public void get(String key) {
		// データを取り出す
		System.out.println(data.get(key).getValue(stage));
		// 時間更新
		stage++;
	}

}