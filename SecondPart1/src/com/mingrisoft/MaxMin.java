package com.mingrisoft;

public class MaxMin {
	public static class Result {
		private double max;
		private double min;
		public Result (double max, double min) {
			this.max = max;
			this.min = min;
		}
		public double getMax() {
			return max;
		}
		
		public double getMin() {
			return min;
		}
	}
	
	public static Result getResult(double[] array) {
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		for (double i : array) {		// 遍历数组获得最大值和最小值
			if (i > max) {
				max = i;
			}
			if (i < min){
				min = i;
			}
		}
		return new Result(max, min);
	}
}
