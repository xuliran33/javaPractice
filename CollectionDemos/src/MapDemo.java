import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// 存储国家的英文简称-国家的全称(键-值对)
public class MapDemo {
	public static void main(String[] args) {
		HashMap<String, String> countries = new HashMap<String, String>();
		// 向Map集合中添加键值对
		countries.put("CN", "中华人民共和国");
		countries.put("RU", "俄罗斯");
		countries.put("FR", "法国");
		countries.put("US", "美国");
		// 获取Map的键值对的对数
		System.out.println(countries.size());
		// 获取Map值
		System.out.println("CN对应的国家: " +  countries.get("CN"));
		
		// 判断Map中是否包含某个键
		System.out.println("countries是否包含CN键" + countries.containsKey("CN"));
		// 判断Map中是否包含某个值
		System.out.println("countries是否包含CN值" + countries.containsValue("CN"));
		
		// Map移除键值对, 删除特定键对应的键值对
		countries.remove("US");
		System.out.println(countries.size());
		
		// 获取Map中键的集合, 值的集合, 键值对的集合
		System.out.println(countries.keySet());
		System.out.println(countries.values());
		System.out.println(countries);
		
		// 分别获取Map中的键和值
		Set<String> keys = countries.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String object = it.next();
			System.out.print(object + "\t");
			System.out.println(countries.get(object));
		}
		
		// 拿到Map中所有的键值对, 然后再在每个键值对中分别取出键和值
		System.out.println("**************************");
		Set<Map.Entry<String, String>> ms = countries.entrySet();
		for (Map.Entry<String, String> obj : ms) {

			System.out.print(obj.getKey() + "\t");
			System.out.println(obj.getValue());
		}
		// 清空Map
		countries.clear();
		if (countries.isEmpty()) {
			System.out.println("countries为空");
		}
	}
}
