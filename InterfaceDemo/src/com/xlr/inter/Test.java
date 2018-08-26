package com.xlr.inter;

public class Test {
	public static void main(String[] args) {
		USB fan = new UsbFan();
		fan.service();
		
		USB disk = new USBDisk();
		disk.service();

	}
}
