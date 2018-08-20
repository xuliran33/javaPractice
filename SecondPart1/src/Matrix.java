
public class Matrix {
	public static void main(String args[]) {
		// 在项目中创建一个三行四列, 所有元素都是0的矩阵
		int a[][] = new int[3][4];
		System.out.println("输出3行4列的数组: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
