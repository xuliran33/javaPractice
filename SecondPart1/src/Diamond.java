
public class Diamond {
	public static void main(String args[]) {
		// 打印空心的菱形 for循环
		printHollowRhombus(10);
	}
	
	public static void printHollowRhombus(int size) {
		if (size % 2 == 0) {
			size++;	// 计算菱形大小 
		}
		for (int i = 0; i < size / 2 + 1; i++) {
			for (int j = size / 2 + 1; j > i + 1;j--) {
				System.out.print("\t");	// 输出左上角位置的空白
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				if (j == 0 || j == 2 * i) {
					System.out.print("*");	// 输出菱形上半部边缘
				} else {
					System.out.print("\t");	// 输出菱形上半部空心
				}
				
			}
			System.out.println("");
			
		}
		
		for (int i = size / 2 + 1; i < size; i++) {
			for (int j = 0; j < i - size / 2; j++) {
				System.out.print("\t");	// 输出菱形左下角的空白
			}
			for (int j = 0; j < 2 * size - 1 - 2 * i; j++) {
				if (j == 0 || j == 2 * (size - i - 1)) {
					System.out.print("*");
				} else {
					System.out.print("\t");
				}
				
			}
			System.out.println();
		}
	}
}
