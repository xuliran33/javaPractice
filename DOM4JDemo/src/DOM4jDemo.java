import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class DOM4jDemo {
	private Document document;
	
	// 获得document对象
	public void loadDocument() {
		SAXReader saxReader = new SAXReader();
		try {
			document = saxReader.read(new File("收藏信息.xml"));
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
	
	// 显示手机的品牌及型号
	public void showInfo() {
		// 获取XML根节点
		Element root = document.getRootElement();
		// 获取所有的brand
		Iterator eleBrands = root.elementIterator();
		
		while (eleBrands.hasNext()) {
			Element brand = (Element)eleBrands.next();
			System.out.println(brand.attributeValue("name"));
			Iterator eleTypes = brand.elementIterator();
			while (eleTypes.hasNext()) {
				Element type = (Element) eleTypes.next();
				System.out.print(type.attributeValue("name") + "\t");
			}
			System.out.println();
		}
	}

	// 增加新的手机品牌信息
	public void addPhone() {
		// 获得XML的根元素
		Element root = document.getRootElement();
		Element brand = root.addElement("brand");
		brand.addAttribute("name", "三星");
		
		Element type = brand.addElement("type");
		type.addAttribute("name", "note");
		
		saveXML();
	}
	
	// 修改节点
	public void updateInfo() {
		Element root = document.getRootElement();
		Iterator eleBrands = root.elementIterator();
		int id = 0;
		while (eleBrands.hasNext()) {
			Element brand = (Element) eleBrands.next();
			brand.addAttribute("id", id+"");
			id++;
		}
		
		saveXML();
	}
	
	// 删除节点
	public void deleteElement() {
		Element root = document.getRootElement();
		Iterator eleBrands = root.elementIterator();
		while (eleBrands.hasNext()) {
			Element brand = (Element) eleBrands.next();
			if (brand.attributeValue("name").equals("三星")) {
				brand.getParent().remove(brand);
			}
		}
		saveXML();
	}
	
	// 保存修改到XML文件
	public void saveXML() {
		 OutputFormat format = OutputFormat.createPrettyPrint();
		 format.setEncoding("utf-8");
		 XMLWriter writer = null;
		 try {
			writer = new XMLWriter(new OutputStreamWriter(new FileOutputStream("收藏信息.xml")), format);
			 
			writer.write(document);
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		 
	}
	
	public static void main(String[] args) {
		DOM4jDemo demo = new DOM4jDemo();
		demo.loadDocument();
//		demo.addPhone();
//		demo.updateInfo();
		demo.deleteElement();
		demo.showInfo();
	}
}
