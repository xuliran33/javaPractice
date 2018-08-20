// 通过fill方法填充数组, 通过copy方法对数组进行复制
// 对代码进行文本注释 Control + Command
import java.util.Arrays;
public class ArrayOperate {
	public static void main(String[] args) {
		// 1. 使用同一个数值对数组进行填充 
		/*int[] arr = new int[5];
		Arrays.fill(arr, 8);*/
		// 2. 通过fill方法替换数组中的元素
		/*int[] arr = new int[] {1, 2, 3, 4, 5, 6};
		Arrays.fill(arr, 1, 2, 100);*/
		// 3. 通过copyOf方法与copyOfRange()方法可实现对数组的复制, copyOf()方法是复制数组至指定长度, copyOfRange()方法则将指定数组的指定长度复制到一个新数组中
//		int[] orgArr = new int[] {1, 2, 3, 4, 4, 6};
//		int[] arr = Arrays.copyOf(orgArr, 5);
//		int[] arr = Arrays.copyOfRange(orgArr, 0, 4);
		
		// 用sort对数组进行升序排列
		int[] arr = new int[] {0, 70, 60, 99, 80};
//		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
