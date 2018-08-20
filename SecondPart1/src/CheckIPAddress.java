
public class CheckIPAddress {
	public static void main(String[] args) {
		String ip = "192.168.1.1";
		System.out.println(matches(ip));
	}
	
	public static String matches(String text) {
		String regex = "^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\." + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\." + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\." + "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";
		if (text.matches(regex)) {
			return text + "\n是一个合法的IP地址! ";
		} else {
			return text + "\n不是一个合法的IP地址! ";
		}
	}
}
