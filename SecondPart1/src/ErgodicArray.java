
public class ErgodicArray {
	public static void main(String args[]) {
		// 用while循环获取每个数组元素的值
		String[] aves = new String[] {"白鹭", "丹顶鹤", "黄鹂", "鹦鹉", "乌鸦", "喜鹊", "布谷鸟", "灰纹鸟", "百灵鸟"};
		int index = 0;
		System.out.println("我的花园里有很多鸟, 种类大约包括: ");
		while (index < aves.length) {
			System.out.println(aves[index++] + "   ");
		}
	}
}
