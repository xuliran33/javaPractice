// 异常类(自定义异常), 只要程序中年龄输入错误会引起这个异常
public class AgeException extends Exception{
	public AgeException() {
		
	}
	
	public AgeException(String message) {
		super(message);
	}
}
