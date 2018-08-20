
public class BubbleSort {
	public static void main(String args[]) {
		// 冒泡法排序
		int[] array = new int[] {63, 4, 24, 1, 3, 13};
		System.out.println("冒泡法排序的过程是: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
					if (array[j] > array[j + 1]) {
						int temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
					System.out.print(array[j] + " ");
			}
			
			System.out.println("[");
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j] + " ");
			}
			System.out.println("]");
		}
	}

}
