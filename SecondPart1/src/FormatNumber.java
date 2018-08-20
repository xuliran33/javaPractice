import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormatNumber {
	private static Scanner scan;

	public static void main(String args[]) {
		scan = new Scanner(System.in);
		System.out.println("请输入一个数字: ");
		double number = scan.nextDouble();
		System.out.println("Locale类的常量作为构造参数获得不同的货币格式: ");
		NumberFormat format =  NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println("Locale.CHINA: " + format.format(number));
		format = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("Locale.US: " + format.format(number));
		format = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
		System.out.println("Locale.English: " + format.format(number));
		format = NumberFormat.getCurrencyInstance(Locale.TAIWAN);
		System.out.println("Locale.TAIWAN: " + format.format(number));
	}
}
