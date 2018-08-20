
public class EncryptUncrypt {
	public static void main(String[] args) {
		String value = "我爱 Java";
		char secret = '祈';
		System.out.println("原字符串为: " + value);
		String encrypt = EncryptUncrypt.EAndU(value, secret);
		System.out.println("加密后的值: " + encrypt);
		String uncrypt = EncryptUncrypt.EAndU(encrypt, secret);
		System.out.println("解密后的值" + uncrypt);
	}
	
	public static String	 EAndU(String value, char secret) {
		byte[] bt = value.getBytes();
		for (int i = 0; i < bt.length; i++) {
			bt[i] = (byte) (bt[i]^(int)secret);
		}
		return new String(bt, 0, bt.length);
	}
}
