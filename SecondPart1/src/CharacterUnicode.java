
public class CharacterUnicode {
	public static void main(String[] args) {
		// 将汉字和字母转换成Unicode码
		String text = "明日 soft";
		char[] charArray = text.toCharArray();
		StringBuilder builder = new StringBuilder();
		for (char c : charArray) {
			builder.append((int)c + "");
		}
		
		System.out.println("\"明日 soft\" 的Unicode 码是: ");
		System.out.println(builder.toString());
	}
}
