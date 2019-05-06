import java.util.HashMap;
import java.util.Map;

public class LRU {
	private int size = 2; // キャッシュの最大サイズ
	// 保存しているデータ
	private Map<String, String> data = new HashMap<>();

	public void input(String key, String value) {
		data.put(key, value);
	}

	public void get(String key) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(data.get(key));
	}

}