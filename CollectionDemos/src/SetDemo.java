import java.util.HashSet;
import java.util.Iterator;

// Set 存放的数据是无序的唯一的
// HashSet是Set的常用实现类
// Set里面存放的是对象的引用(地址)

public class SetDemo {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		NewsTitle t1 = new NewsTitle(1, "晴天了1", "admin");
		NewsTitle t2 = new NewsTitle(2, "晴天了2", "admin");
		NewsTitle t3 = new NewsTitle(3, "晴天了3", "admin");
		NewsTitle t4 = new NewsTitle(4, "晴天了4", "admin");
		NewsTitle t5 = new NewsTitle(5, "晴天了5", "admin");
		NewsTitle t6 = new NewsTitle(6, "晴天了6", "admin");
		NewsTitle t7 = new NewsTitle(7, "晴天了7", "admin");
		
		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		
		System.out.println("输出新闻条数" + set.size());
		// 遍历无序集合 1. 增强型的for 2. iterator() Iterator 迭代器
		// 遍历每条信息
		System.out.println("*****************");
		for (Object object : set) {
			NewsTitle t = (NewsTitle)object;
			t.print();
		}
		
		System.out.println("***********************");
		// 获得迭代器
		Iterator iter = set.iterator();
		// 通过迭代器迭代出集合元素
		// 判断迭代器中有没有下一个元素
		while (iter.hasNext()) {
			NewsTitle t = (NewsTitle) iter.next();
			t.print();
		}
	}
}
