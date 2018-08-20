import java.util.Arrays;

// 测试Arrays类常用方法
public class ArraysMethod {
	public static void main(String[] args) {
		// equals(): 比较两个数组是否相等
		int[] arr1 = {10, 50, 40, 30};
		int[] arr2 = {10, 50, 40, 30};
		int[] arr3 = {60, 50, 45, 30};
		
		System.out.println("arr1和arr2是否相等" + Arrays.equals(arr1, arr2));
		System.out.println("arr1和arr3是否相等" + Arrays.equals(arr1, arr3));
		
		// sort对数组进行升序排列
		
		// toString():把一个数组转化为字符串
		System.out.println("把arr1转化为字符串输出" + Arrays.toString(arr1));
		// fill(): 将数组元素进行赋值
		int[] arrs = {10, 50, 40};
		Arrays.fill(arrs, 40);
		System.out.println(Arrays.toString(arrs));
		// binarySearch(): 对排好序的数组进行查询
		int[] numbers = {85, 90, 74, 44};
		Arrays.sort(numbers);
		System.out.println(Arrays.binarySearch(numbers, 74));
		
	}
}
