
public class YanghuiTriangle {
	public static void main(String[] args) {
		// 打印杨辉三角形
		int triangle[][] = new int[8][];		// 创建二位数组
		for (int i = 0; i < triangle.length; i++) {	// 遍历二维数组的第一层
			triangle[i] = new int[i + 1];	// 初始化第二层数组的大小
			for (int j = 0; j < triangle[i].length - 1; j++) {
				if (i == 0 || j == 0 || j == triangle[i].length - 1) {
					triangle[i][j] = 1;
				} else {
					triangle[i][j] = triangle[i-1][j] + triangle[i - 1][j - 1];
				}
				System.out.print(triangle[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
