
public class LRUsample {

	public static void main(String[] args) {
		// インスタンス作成
		LRU lru = new LRU();
		// データ入力
		lru.input("a", "dataA");
		// データ取得
		lru.get("a");
	}
}
