import java.util.Scanner;

// 计算30个人的平均分
public class CalcAvg {
	public static void main(String[] args) {
		double[] score = new double[30];
		Scanner input = new Scanner(System.in);
		// 记录总分
		double sum = 0;
		for (int i = 0; i < score.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个同学的成绩");
			// 为数组的30个格子赋值
			score[i] = input.nextDouble();
			sum += score[i];
		}
		
		double avg = sum / score.length;
		System.out.println("30个人的平均成绩为" + avg);
	}
}
