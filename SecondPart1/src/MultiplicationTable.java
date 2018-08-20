
public class MultiplicationTable {
	public static void main(String args[]) {
		// 利用for循环输出99乘法表
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.println(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}
}
