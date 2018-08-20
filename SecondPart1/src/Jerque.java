
public class Jerque {
	public static void main(String[] args) {
		// 对比String与StringBuilder在对字符串进行更新操作时所用时间的差别
		String str = "";
		long starTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			str = str + i;
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - starTime;
		System.out.println("String 消耗的时间: " + time);
		
		StringBuilder builder = new StringBuilder("");
		starTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			builder.append(i);
		}
		endTime = System.currentTimeMillis();
		time = endTime - starTime;
		System.out.println("StringBuilder 消耗时间: " + time);
	}
}
