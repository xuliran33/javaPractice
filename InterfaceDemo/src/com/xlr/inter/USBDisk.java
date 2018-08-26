package com.xlr.inter;

public class USBDisk implements USB{
	@Override
	public void service() {
		System.out.println("插上U盘, 开始传输数据");
		
	}
}
