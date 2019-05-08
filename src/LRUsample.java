/*
 * メインクラス
 * */

public class LRUsample {

	public static void main(String[] args) {

		System.out.println("test1");

		// LRUインスタンス作成
		LRU lru = new LRU();
		// データ操作
		lru.put("a", "dataA");
		lru.put("b", "dataB");
		lru.put("c", "dataC");
		lru.get("a");

		System.out.println("test2");

		// ２つ目のLRUインスタンス作成
		LRU lru2 = new LRU();
		// データ操作
		lru.put("a", "dataA");
		lru.put("b", "dataB");
		lru.get("a");
		lru.put("c", "dataC");
		lru.get("b");
	}
}
