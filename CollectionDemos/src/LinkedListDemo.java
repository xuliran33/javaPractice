import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		// 集合存储多条新闻标题
		NewsTitle t1 = new NewsTitle(1, "晴天了1", "admin");
		NewsTitle t2 = new NewsTitle(2, "晴天了2", "admin");
		NewsTitle t3 = new NewsTitle(3, "晴天了3", "admin");
		NewsTitle t4 = new NewsTitle(4, "晴天了4", "admin");
		NewsTitle t5 = new NewsTitle(5, "晴天了5", "admin");
		NewsTitle t6 = new NewsTitle(6, "晴天了6", "admin");
		NewsTitle t7 = new NewsTitle(7, "晴天了7", "admin");
		
		LinkedList list = new LinkedList();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(1, t4);
		list.addFirst(t5);
		list.addLast(t6);
		list.add(t7);
		
		System.out.println("打印list的长度" + list.size());
		
		for (int i = 0; i < list.size(); i++) {
			NewsTitle t = (NewsTitle)list.get(i);
			t.print();
		}
		
		System.out.println("**************************");
		for (Object object : list) {
			NewsTitle t = (NewsTitle)object;
			t.print();
		}
		
		System.out.println("**************************");
		list.removeFirst();
		list.removeLast();
		for (Object object : list) {
			NewsTitle t = (NewsTitle)object;
			t.print();
		}
		
		
		System.out.println("**************************");
		NewsTitle tf = (NewsTitle)list.getFirst();
		tf.print();
		
		System.out.println("**************************");
		NewsTitle tl = (NewsTitle)list.getLast();
		tl.print();
	}
}
