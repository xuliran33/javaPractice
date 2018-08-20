
public class ArrayRowCloumnSwap {
	// 对矩阵进行转置运算
	public static void main(String args[]) {
		int arr[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println("转置前的矩阵是: ");
		printArray(arr);
		int arr2[][] = new int[arr.length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr2[j][i] = arr[i][j];
			}
		}
		
		System.out.println("转置后的矩阵是: ");
		printArray(arr2);
	}
	
	// 输出数组中的元素
	private static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "");
			}
			System.out.println();
		}
	}
}
