
public class MinClass {
	public static void main(String args[]) {
		// 获取一维数组的最小值
		int[] num = {9, 3, 5, 6, 7, 10, 4};
		System.out.println("输出一维数组: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");	// 输出一维数组
		}
		
		int min = num[0];
		for (int i = 0; i < num.length - 1; i++) {
			if (min > num[i + 1]) {
				min = num[i + 1];
			}
		}
		System.out.println("\n一维数组的最小值是: " + min);
	}
}
