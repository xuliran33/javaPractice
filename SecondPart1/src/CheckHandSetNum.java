
public class CheckHandSetNum {
	public static void main(String[] args) {
		// 验证手机号码
		String telephone1 = "11024588795";
		String telephone2 = "15044268138";
		
		System.out.println(check(telephone1));
		System.out.println(check(telephone2));

	}
	
	public static String check(String handset) {
		String regex = "1[3,5,8]\\d{9}$";
		if (handset.matches(regex)) {
			return handset + "\n是合法的手机号码";
		}else {
			return handset + "\n不是合法的手机号码";
		}
	}
}
