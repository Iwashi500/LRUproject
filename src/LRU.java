
/*
 * LRUを扱うクラス
 * */

import java.util.HashMap;
import java.util.Map;

public class LRU {
	private int size = 2; // キャッシュの最大サイズ
	private int stage = 0; // 現在の時間
	private Map<String, LRUData> data = new HashMap<>(); // 保存しているデータ

	// データの挿入、入れる
	public void put(String key, String value) {
		LRUData lruData = new LRUData(key, value, stage);
		data.put(key, lruData);
		// 容量がオーバーしている場合はデータ一つ消す
		if (size < data.size()) {
			deleteData();
		}
		stage++; // 時間更新
	}

	// データを一つ消去する
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
		data.remove(key); // データの消去
	}

	// データを取り出す、使う
	public String get(String key) {
		// 返すデータ
		String re = "null";
		// データを取り出す
		try {
			System.out.println(data.get(key).getValue(stage));
			return data.get(key).getValue(stage);
		} catch (Exception e) {
			System.out.println("null");
		}
		stage++; // 時間更新
		return re;
	}

	public String TestLRU1() {
		// データ操作
		this.put("a", "dataA");
		this.put("b", "dataB");
		this.put("c", "dataC");
		// データ取り出し
		return this.get("a");
	}

	public String TestLRU2() {
		// データ操作
		this.put("a", "dataA");
		this.put("b", "dataB");
		this.get("a");
		this.put("c", "dataC");
		// データ取り出し
		return this.get("b");
	}

	public String 入出力テスト() {
		// データ入力
		this.put("a", "dataA");
		// データ出力
		return this.get("a");
	}

}