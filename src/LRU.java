import java.util.HashMap;
import java.util.Map;

public class LRU {
	private int size = 2; // キャッシュの最大サイズ
	private int stage = 0; // 現在の時間
	// 保存しているデータ
	private Map<String, LRUData> data = new HashMap<>();

	public void input(String key, String value) {
		LRUData lruData = new LRUData(value, stage);
		data.put(key, lruData);
	}

	public void get(String key) {
		// データを取り出す
		System.out.println(data.get(key).getValue(stage));
	}

}