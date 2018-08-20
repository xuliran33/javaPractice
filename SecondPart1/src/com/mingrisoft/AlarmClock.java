package com.mingrisoft;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Timer;

public class AlarmClock {
	private int delay;		// 表示延迟时间
	private boolean flag;	// 表示是否要发出声音
	public AlarmClock(int delay, boolean flag) {
		this.delay = delay;
		this.flag = flag;
	}
	
	public void start() {
		class Printer implements ActionListener { // 定义内部类实现动作监听接口
			@Override
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat format = new SimpleDateFormat("k:m:s");	// 定义时间的格式
				String result = format.format(new Date());
				System.out.println("当前的时间是: " + result);
				if (flag) {	// 根据flag来决定是否要发出声音
					Toolkit.getDefaultToolkit().beep();
				}
			}				
		}
		new Timer(delay, new Printer()).start();
	}
}
