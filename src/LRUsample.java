
public class LRUsample {

	public static void main(String[] args) {
		// インスタンス作成
		LRU lru = new LRU();
		// データ入力
		lru.input("a", "dataA");
		lru.input("b", "dataB");
		lru.input("c", "dataC");
		// データ取得
		lru.get("a");
	}
}
