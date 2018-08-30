package com.xlr.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

// Collections 算法类
// sort() 排序
// binarySearch() 查找
// max() min() 查找最大值, 最小值
public class CollectionsDemo1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("zoo");
		list.add("animal");
		list.add("fruit");
		list.add("pea");
		list.add("banana");
		list.add("learn");
		list.add("study");
		list.add("teacher");
		list.add("love");
		
		// 打印输出集合中的最大值和最小值
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		// 升序排序
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
		
		// 查找
		System.out.println(Collections.binarySearch(list, "zoo"));
		
		// 反转集合元素
		Collections.reverse(list);
		for (String string : list) {
			System.out.println(string);
		}
	}
}
