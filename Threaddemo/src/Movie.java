// 电影类
public class Movie {
	private String name;
	private String info;
	private boolean flag = true; // 设置标志位, 控制生产者生产, 消费者消费
	
	public String getName() {
		return name;
	}
	
	public String getInfo() {
		return info;
	}
	
	
	protected synchronized void set(String name, String info) {
		if(!flag) {
			try {
				super.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.name = name;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.info = info;
		flag = false;
		super.notify();
	}
	
	protected synchronized void get() {
		if(flag) {
			try {
				super.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.name + this.info);
		flag = true;
		super.notify();
	}
}
