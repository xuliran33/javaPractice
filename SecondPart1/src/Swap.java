import java.util.Arrays;

public class Swap {
	public static void main(String args[]) {
		// 通过fill方法填充数组
		int arr[] = new int[5];
		Arrays.fill(arr, 8); // 使用同一个值对数组进行填充
		for (int i = 0; i < arr.length; i++) {
			System.out.println("第" + (i+ 1) + "个元素是: " + arr[i]);
		}
		Arrays.fill(arr, 3, 5, 10);
		System.out.println("=================");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("第" + (i+ 1) + "个元素是: " + arr[i]);
		}
		
		int arr2[] = new int[]{'A', 42, 'a', 'B', 10};
		System.out.println("=================");
		printArray(arr2);
		Arrays.sort(arr2);
		System.out.println("升序后排列的数组是: ");
		printArray(arr2);
		
		// copyOf复制数组
		int arr3[] = new int[] {23, 42, 12};
		System.out.println();
		System.out.println("=================");
		System.out.println("复制前的数组是: ");
		printArray(arr3);
		
		int arr4[] = Arrays.copyOf(arr3, 5);
		System.out.println("复制后的数组是: ");
		printArray(arr4);
		
		System.out.println("=================");
		int arr5[] = new int[] {23, 42, 12, 84, 10};
		System.out.println("原来的数组是: ");
		printArray(arr5);

		int arr6[] = Arrays.copyOfRange(arr5, 0, 7);
		System.out.println("将数组小标为 0 ~ 7 复制到新的数组中");
		printArray(arr6);
			
		// 对比一维数组和二维数组所占的内存
		int num1 = 1024 * 1024 * 2;
		int[] arr7 = new int[num1];
		for (int i = 0; i < arr7.length; i++) {
			arr7[i] = i;
		}
		
		// 获得占用内存总数, 并将单位转换为MB
		long memory1 = Runtime.getRuntime().totalMemory() / 1024 / 1024;
		System.out.println("用一维数组存储占用内存总量为: " + memory1);
		
		int num2 = 1024 * 1024;
		int arr8[][] = new int[num2][2];
		for (int i = 0; i < arr8.length; i++) {
			arr8[i][0] = i;
			arr8[i][1] = i;
		}
		// 获得占用内存的整数, 并将单位转换为MB
		long memory2 = Runtime.getRuntime().totalMemory() / 1024 / 1024;
		System.out.println("用二维数组存储占用内存总量为: " + memory2);
	}
	
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
