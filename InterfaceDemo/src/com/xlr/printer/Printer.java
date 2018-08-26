package com.xlr.printer;
// 打印机
public class Printer {
	private IntBox intbox;
	private Paper paper;
	
	public void print() {
		System.out.println("使用" + intbox.getColor() + "的墨盒在" + paper.getString() + "的纸张上打印");
	}
	
	public IntBox getIntbox() {
		return intbox;
	}
	public void setIntbox(IntBox intbox) {
		this.intbox = intbox;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	public static void main(String[] args) {
		IntBox intBox = new GrayInkBox();
		Paper paper = new A4Paper();
		Printer printer = new Printer();
		printer.setIntbox(intBox);
		printer.setPaper(paper);
		
		printer.print();
		
	}
}
