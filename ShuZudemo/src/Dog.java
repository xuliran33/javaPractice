
public class Dog {
	private String name;
	private int health;
	private int  love;
	private String strain;
	
	// 为private的属性加一对setter/getter
	public void setHealth(int health) {
		if (health <= 0) {
			// 如果健康值赋值不正确, 强制赋值60, 同时给用户一个提示, 然后结束该方法
			this.health = 60;
			System.out.println("健康值需大于0");
			return;
		}else if(health >100) {
			this.health = 100;
			System.out.println("健康值需小于100");
		}
		// 如果健康值合法, 则可直接赋值
		this.health = health;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNmae() {
		return this.name;
	}
	
	public void setLove(int love) {
		if (love < 0) {
			this.love = 0;
			System.out.println("亲密度不能为负数");
			return;
		}else if(love >100) {
			this.love = 100;
			System.out.println("亲密度最大值为100");
		}
		this.love = love;
	}
	
	public int getLove() {
		return this.love;
	}
	
	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	public String getStrain() {
		return this.strain;
	}
}
