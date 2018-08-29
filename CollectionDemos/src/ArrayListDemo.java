import java.util.ArrayList;
import java.util.Iterator;

// 实现新闻管理系统
/*
 *  集合不可以添加基本数据类型
 * 	接口List数据: 有序的, 可重复的
 *  实现类 ArrayList 实现了长度可变的数组, 在内存中分配连续的空间, 遍历元素和随机访问元素的效率比较高
 *  实现类 LinkedList 采用了链表存储方法, 插入, 删除时效率比较高如: (aaa|下一个元素的存储空间)—>(bbb|	下一个元素的存储空间)——>(ccc|下一个元素的存储空间)—>
 * */

/*
 * ArrayList常用方法
 * boolean add(object)
 * void add(int index, Object o)
 * int size()
 * Object get(int index)
 * boolean contains(Object o)
 * boolean remove(Object o)
 * Object remove(int index)
 * */
public class ArrayListDemo {
	public static void main(String[] args) {
		// 集合存储多条新闻标题
		NewsTitle t1 = new NewsTitle(1, "晴天了1", "admin");
		NewsTitle t2 = new NewsTitle(2, "晴天了2", "admin");
		NewsTitle t3 = new NewsTitle(3, "晴天了3", "admin");
		NewsTitle t4 = new NewsTitle(4, "晴天了4", "admin");
		NewsTitle t5 = new NewsTitle(5, "晴天了5", "admin");
		
		ArrayList list = new ArrayList();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(1, t5);
		
		System.out.println("新闻标题的总数为" + list.size());
		
		System.out.println("****************方法1");
		for (int i = 0; i < list.size(); i++) {
			NewsTitle t = (NewsTitle)list.get(i);
			t.print();
		}
		System.out.println("****************方法2");
		for (Object object : list) {
			NewsTitle t = (NewsTitle)object;
			t.print();
		}
		System.out.println("****************");
		System.out.println("是否包含t1" + list.contains(t1));
		list.remove(t1);
		System.out.println("是否包含t1" + list.contains(t1));
		
		System.out.println("****************");
		
		System.out.println(list.size());
		list.clear();
		System.out.println("清空后" + list.size());
		System.out.println("判断list是否为空" + list.isEmpty());
		
		System.out.println("********************Iterator迭代器");
		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			NewsTitle t = (NewsTitle) iter.next();
			t.print();
		}
	}
	
	
}
