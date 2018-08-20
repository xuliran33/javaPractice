
public class SumNum {
	public static void main(String[] args) {
		// 用数组存储1~10并求和
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		System.out.println("一维数组中各元素的和是: ");
		for (int i = 0; i < num.length; i++) {
			if (i == 9) {
				System.out.print(num[i] + " = ");
			} else {
				System.out.print(num[i] + " + ");
			}
			sum += num[i];
		}
		System.out.print(sum);
	}
}
