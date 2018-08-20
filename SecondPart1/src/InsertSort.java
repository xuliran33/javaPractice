
public class InsertSort {
	public static void main(String args[]) {
		// 插入法排序
		int[] array = new int[] {20, 40, 90, 30, 80, 70, 50};
		
		int tmp;
		int i;
		for (int t = 1; t < array.length; t++) {
			tmp = array[t];
			for (i = t - 1; i >= 0 && array[i] > tmp; i--) {
				array[i + 1] = array[i];
			}
			array[i + 1] = tmp;
		}
		
		System.out.println("排序后: ");
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]+ " ");
		}
	}
}
