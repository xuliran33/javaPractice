
public class Array {
	public static void main(String args[]) {
		// 声明数组
		int arr[];
		String[] str;
		
		// 为数组指定内存空间
		arr = new int[5];
		
		// 声明一个数组, 并分配内存
		int month[] = new int[12];
		
		// 初始化数组
		int arr1[] = new int[]{1, 2, 3, 4, 5};
		int arr2[] = {23, 23, 44, 5};
		
		// 声明二维数组
		int myArr[][];
		myArr = new int[2][4];
		
		int a[][] = new int[2][];
		a[0] = new int[3];
		a[1] = new int[5];
		
		int myArr2[][] = {{1, 2, 4}, {3, 5, 8}};
		myArr2[2][4] = 10;
	}
}
