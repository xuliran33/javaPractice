import java.util.Scanner;

/**
 * 吃货联盟订餐系统
 * **/
public class OrderingMsg {
	public static void main(String[] args) {
		// 数据主题, 一组订单信息
		String[] names = new String[4];	// 订餐人
		String[] dishMegs = new String[4];	// 所有餐品信息
		int[] times = new int[4];	// 送餐时间
		String[] addresses = new String[4];	// 送餐地址
		int[] states = new int[4]; // 订单状态, 0, 已预订 1, 已完成
		double[] sumPrices = new double[4];	// 总金额
		
		// 初始化2条订单信息
		names[0] = "张青";
		dishMegs[0] = "鱼香肉丝 1份";
		times[0] = 12;
		addresses[0] = "天成路209号";
		states[0] = 1;
		sumPrices[0] = 24.0;
		
		names[1] = "张青";
		dishMegs[1] = "红烧带鱼 2份";
		times[1] = 12;
		addresses[1] = "天成路208号";
		states[1] = 0;
		sumPrices[1] = 76.0;
		
		// 数据主题, 一组餐品信息
		String[] dishNames = {"红烧带鱼", "鱼香肉丝", "时令蔬菜"};
		double[] prices = {38.0, 18.0, 10.0};
		int[] praiseNumbers = new int[3];
		Scanner input = new Scanner(System.in);
		int num = -1; // 记录用户输入的数字
		do {
			System.out.println("*********************");
			System.out.println("1. 我要订餐");
			System.out.println("2. 查看餐带");
			System.out.println("3. 签收订单");
			System.out.println("4. 删除订单");
			System.out.println("5. 我要点赞");
			System.out.println("6. 退出系统");
			System.out.println("*********************");
			System.out.print("请选择");
			int choose = input.nextInt();
			
			switch (choose) {
			case 1:{
				// 我要订餐
				System.out.println("********我要订餐********");
				// 查找插入的位置
				boolean isAdd = false;	// true: 记录找到一个为空的位置, 可以插入, false: 没有找到
				for (int i = 0; i < names.length; i++) {
					// 如果找到为空的位置, 记录下来
					if (names[i] == null) {
						// 执行循环语句
						isAdd = true;	// 记录已找到一个为空的位置
						// 执行插入操作
						// 显示所有可供选择的餐品信息
						System.out.println("序号\t餐品名\t单价\t点赞数");
						for (int j = 0; j < dishNames.length; j++) {
							String price = prices[j] + "元";
							String praise = praiseNumbers[j] + "赞";
							System.out.println((j+1) + "\t" + dishNames[j] + "\t" + price + "\t" + praise);
						}
						// 餐品信息
						System.out.println("请输入餐品序号:");
						int dishNo = input.nextInt();
						System.out.println("请输入份数:");
						int dishNum = input.nextInt();
						String disMsg = dishNames[dishNo - 1] + dishNum + "份";
						
						// 订餐人
						System.out.println("请输入订餐人:");
						String name = input.next();
						
						// 送餐时间
						System.out.println("请输入送餐时间(10~20之间的整数):");
						int time = input.nextInt();
						while (time < 10 || time > 20) {
							System.out.println("送餐时间超出时间范围, 请重新输入:");
							time = input.nextInt();
						}
						
						System.out.println("请输入送餐地址:");
						String address = input.next();
						
						// 订单金额
						double dishPrice = prices[dishNo - 1] * dishNum;
						// 配送费
						double dispatchPrice = dishPrice >= 50 ? 0 : 6.0;
						
						System.out.println("订餐成功!");
						System.out.println("您订的是: " + disMsg);
						System.out.println("订餐人: " + name);
						System.out.println("送餐时间: " + time + "点");
						System.out.println("送餐地址: " + address);
						System.out.println("餐费: " + dishPrice + "元, 送餐费" + dispatchPrice + "元");
						System.out.println("总金额" + (dishPrice + dispatchPrice) + "元");
						
						// 插入数据
						names[i] = name;
						dishMegs[i] = disMsg;
						times[i] = time;
						addresses[i] = address;
						sumPrices[i] = dishPrice + dishPrice;
						break;
					}
				}
				// 如果没找到为空的位置, 则提示信息
				if (!isAdd) {
					System.out.println("对不起, 您的订单已满");
				}
				break;
			}
			case 2:{
				// 查看餐带
				System.out.println("********查看餐袋********");
				System.out.println("序号\t订餐人\t餐品信息\t\t送餐日期\t送餐地址\t\t总金额\t订单状态");
				for (int j = 0; j < names.length; j++) {
					if (names[j] != null) {
						String time = times[j] + "点";
						String price = sumPrices[j] + "元";
						String statu = states[j] == 0 ? "已预订" : "已完成";
						System.out.println((j + 1) + "\t" + names[j] + "\t" + dishMegs[j] + "\t" + time + "\t" + addresses[j] + "\t" + price  + "\t" + statu);
					}
				}
				
				
				break;
			}
			case 3:{
				// 签收订单

				System.out.println("********签收订单********");
				System.out.println("请输入要签收的订单编号:");
				int orderSignId = input.nextInt() - 1;
				if (orderSignId >= names.length || orderSignId < 0 || names[orderSignId] == null) {
					System.out.println("您要签收的订单不存在");
				}else if (names[orderSignId] != null && states[orderSignId] == 0) {
					states[orderSignId] = 1;
					System.out.println("订单签收成功");
				}else {
					System.out.println("您的订单已签收, 请勿重复签收");
				}
				break;
			}
			case 4:{
				// 删除订单			
				System.out.println("********删除订单********");
				System.out.println("请输入要删除的订单编号:");
				int orderDeleteId = input.nextInt() - 1;
				if (orderDeleteId >= names.length || orderDeleteId < 0 || names[orderDeleteId] == null) {
					System.out.println("您要删除的订单不存在");
				}else if (names[orderDeleteId] != null && states[orderDeleteId] == 0) {
					System.out.println("订单未完成, 不能删除");
				}else {
					for (int i = orderDeleteId; i < names.length - 1; i++) {
						names[i] = names[i + 1];
						dishMegs[i] = dishMegs[i + 1];
						times[i] = times[i + 1];
						addresses[i] = addresses[i + 1];
						sumPrices[i] = sumPrices[i + 1];
						states[i] = states[i + 1];
					}
					
					names[names.length - 1] = null;
					dishMegs[names.length - 1] = null;
					times[names.length - 1] = 0;
					addresses[names.length - 1] = null;
					sumPrices[names.length - 1] = 0;
					states[names.length - 1] = 0;
					System.out.println("订单删除成功");
				}
				
				break;
			}

			case 5:{
				// 我要点赞
				System.out.println("********我要点赞********");
				System.out.println("序号\t餐品名\t单价\t点赞数");
				for (int j = 0; j < dishNames.length; j++) {
					String price = prices[j] + "元";
					String praise = praiseNumbers[j] + "赞";
					System.out.println((j+1) + "\t" + dishNames[j] + "\t" + price + "\t" + praise);
				}
				System.out.println("请输入要点赞的餐品序号:");
				int praiseId = input.nextInt() - 1;
				while (praiseId < 0 || praiseId >= dishNames.length) {
					System.out.println("您输入的产品不存在, 请重新输入:");
					praiseId = input.nextInt() - 1;
				}
				
				praiseNumbers[praiseId]++;
				
				System.out.println("点赞成功!");
				System.out.println(dishNames[praiseId] + " " + praiseNumbers[praiseId] + "赞");
				
				break;
			}
			case 6:{
				// 退出系统
				break;
			}


			default:
				break;
			}
			
			// 当用户输入的功能编号为1~5之外的数字时, 退出循环, 否则将提示输入0返回
			if (choose < 1 || choose > 5) {
				break;
			}else {
				// 提示输入0返回
				System.out.print("输入0返回:");
				num = input.nextInt();
			}
			
		} while (num == 0);
		System.out.println("谢谢使用, 欢迎下次光临");
	}
}
