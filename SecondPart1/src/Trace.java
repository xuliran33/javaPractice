
public class Trace {
	public static void main(String args[]) {
		// 求出二维方阵的迹
		int arr[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int tr = 0;
		System.out.println("方阵 arr[][] 是: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {
			tr += arr[i][i];
		}
		System.out.println("方阵arr[][]的迹是: " + tr);
	}
}
