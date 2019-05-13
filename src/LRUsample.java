import static org.junit.Assert.*;

import org.junit.Test;

/*
 * メインクラス
 * */

public class LRUsample {

	private LRU lru = new LRU();

	// 入出力のテスト
	@Test
	public void 入出力テスト() throws Exception {
		assertEquals("dataA", lru.入出力テスト());
	}

	// 一つ目のテスト
	@Test
	public void Test1() throws Exception {
		assertEquals("null", lru.TestLRU1());
	}

	// 二つ目のテスト
	@Test
	public void Test2() throws Exception {
		assertEquals("null", lru.TestLRU2());
	}
}
