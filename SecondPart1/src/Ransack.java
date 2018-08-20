
public class Ransack {
	public static void main(String args[]) {
		// 创建三维数组并在控制台输出
		create();
	}
	public static void create() {
		// 创建三维数组并在控制台输出
				int arr[][][] = new int[][][] {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}, {{13, 14, 15}, {16, 17, 18}}};
				for (int i = 0; i < arr.length; i++) {
					System.out.println("三维数组的第" + (i + 1) + "个元素是一个" + arr[i].length + "维数组, 内容如下: ");
					for (int j = 0; j < arr[i].length; j++) {
						for (int j2 = 0; j2 < arr[i][j].length; j2++) {
							System.out.print(arr[i][j][j2] + "\t");
						}
						System.out.println();
					}
				}
	}
}
