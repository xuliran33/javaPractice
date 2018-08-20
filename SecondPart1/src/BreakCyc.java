
public class BreakCyc {
	public static void main(String args[]) {
		System.out.println("-----------中断单层循环的例子 -------");
		String[] array = new String[] {"白鹭", "丹顶鹤", "黄鹂", "鹦鹉", "乌鸦", "喜鹊", "老鹰", "布谷鸟", "老鹰", "灰纹鸟", "老鹰", "百灵鸟"};
		System.out.println("在你发现第一只老鹰前, 告诉我都有什么鸟: ");
		for (String string : array) {
			if (string.equals("老鹰")) {
				break;
			}
			System.out.println("有: " + string + "   ");
		}
		
		System.out.println("------ 中断双层循环的例子 ------");
		int[][] myScores = new int[][] {{67, 78, 63, 22, 66},{55, 68, 78, 95, 44}, {95, 97, 92, 93, 81}};
		System.out.println("宝宝这次考试成绩: \n 数学\t语文\t英语\t美术\t历史");
		No1: for (int[] i : myScores) {
			for (int j : i) {
				System.out.println(j + "\t");
				if (j < 60) {
					System.out.println("\n等等, " + j + "分的是什么? 这个为什么不及格? ");
				break No1;
				}
			}
		}
	}
}
