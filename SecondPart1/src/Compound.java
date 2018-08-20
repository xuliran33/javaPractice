
public class Compound {
	public static void main(String args[]) {
		{
			int y = 40;
			System.out.println("输出y的值: " + y);
			int z = 245;
			boolean b;
			
			{
				b = y > z;
				System.out.println("y > z成立吗: " + b);
			}
		}
		String word = "hello java";
		System.out.println("输出字符串: " + word);
		
		int a = 100;
		if (a == 100) {
			System.out.println("a 的值是 100");
		}
		
		{
			int x = 25;
			int y = 10;
			if (x > y) {
				System.out.println("x 变量大于 y 变量");
			}else {
				System.out.println("x 变量小于 y 变量");
			}
		}
		
		{
			System.out.println("今天是星期几: ");
			int week = 2;
			switch (week) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			default:
				System.out.println("Sorry, I don't Know");
				break;
			}
		}
		
		/**
		 * while循环
		 * */
		{
			int x = 1;
			int sum = 0;
			while (x < 10) {
				sum += x;
				x++;
			}
			System.out.println("1 到 10 的和是: sum = " + sum);
		}
		
		// do...while
		{
			int c = 100;
			while (c == 60) {
				System.out.println("ok! c == 60");
				c--;
			}
			
			int b = 100;
			do {
				System.out.println("ok! b == 100");
				b--;
			} while (b == 60);
		}
		// for循环
		{
			int sum = 0;
			for (int i = 2; i <= 100; i+=2) {
				sum += i;
			}
			
			System.out.println("2 到 100 之间的所有偶数之和为" + sum);
		}
		
		{
			int arr[] = {7, 10, 1};
			System.out.println("一维数组中的元素分别为: ");
			for (int i : arr) {
				System.out.println(i + "\t");
			}
		}
		
		{
			// 使用for循环语句计算1~100之间所有连续整数的和
			// break 的作用是退出整个循环
			int sum = 0;
			String flag = "从 1 到 100 之间连续整数的和是: ";
			for (int i = 0; i <= 100; i++) {
				sum += i;
				if (sum > 1000) {
					flag = "从 1 到" + i + "之间连续整数和是: ";
					break;
				}
			}
			System.out.println(flag + sum);
		}
		
		{
			// continue 退出本次循环, 进入下一次循环
			// 输出 10 以内的全部奇数
			int i = 0;
			System.out.println("十以内的全部奇数是: ");
			while (i < 10) {
				i++;
				if (i % 2 == 0) {
					continue;
				}
				System.out.println(i + "  ");
			}
		}
		
		// retun [表达式]; 
		// return 语句可以从一个方法返回, 并把控制权交给调用它的语句
	}
}
