import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ParseXMLDemo {
	// 收藏信息.xml对应的Document文件
	private Document document;
	
	// 获得DOM树, 获得document对象
	public void getDom() {
		// 获得解析器工厂
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); 
		try {
			// 根据解析器工厂获得解析器
			DocumentBuilder builder = factory.newDocumentBuilder();
			// 解析器来解析XML文件, 获得Document对象
			document = builder.parse("收藏信息.xml");
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// 获取手机的品牌及型号相关信息
	public void showInfo() {
		// 以Document做起点, 先拿到所有的Brand节点
		NodeList brands = document.getElementsByTagName("brand");
		// 遍历brands从中拿出每一个brand
		for (int i = 0; i < brands.getLength(); i++) {
			Node brand = brands.item(i);
			if (brand.getNodeType() == Node.ELEMENT_NODE) {
				Element eleBrand = (Element)brand;
				String brandName = eleBrand.getAttribute("name");
				System.out.println("品牌: " + brandName);
				// 继续查找, 找每个brand的子节点出来
				NodeList bnl = eleBrand.getChildNodes();
				for (int j = 0; j < bnl.getLength(); j++) {
					Node type = bnl.item(j);
					if (type.getNodeType() == Node.ELEMENT_NODE) {
						Element eleType = (Element)type;
						System.out.print("型号" + j + ": " + eleType.getAttribute("name") + "\t");
					}
				}
				System.out.println();
			}
			
		}
		
	}
	
	// 为XML文件添加元素, 添加品牌为三星, type为Note2的手机
	public void addPhone() {
		Element brand = document.createElement("brand");
		// 为brand设置name属性, 取值为"三星"
		brand.setAttribute("name", "三星");
		
		Element type = document.createElement("type");
		type.setAttribute("name", "Note2");
		// 将type作为brand的子元素添加
		brand.appendChild(type);
		
		// 将brand放到PhoneInfo中
		
		document.getElementsByTagName("PhoneInfo").item(0).appendChild(brand);
		saveXML();
		
	}
	
	// 保存变化的XML文件(需要借助转换器: 源(最新的DOM树) --> 目的地(收藏信息文件), 借助输出流)
	public void saveXML() {
		// 转换器工厂
		TransformerFactory tf = TransformerFactory.newInstance();
		// 设置缩进
		tf.setAttribute("indent-number", 4);
		try {
			// 转换器
			Transformer mer = tf.newTransformer();
			// 指定转换格式
			mer.setOutputProperty(OutputKeys.ENCODING, "utf-8");
			mer.setOutputProperty(OutputKeys.INDENT, "YES");
			// 源(最新的DOM树) --> 目的地(收藏信息文件)
			DOMSource xmlSource = new DOMSource(document);
			OutputStream out = new FileOutputStream("收藏信息.xml");
			StreamResult result = new StreamResult(new OutputStreamWriter(out, "utf-8"));
			mer.transform(xmlSource, result);
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}
	
	// 修改元素
	public void updateBrand() {
		// 获取所有的brand
		NodeList nl = document.getElementsByTagName("brand");
		for (int i = 0; i < nl.getLength(); i++) {
			Node brand = nl.item(i);
			if (brand.getNodeType() == Node.ELEMENT_NODE) {
				Element eleBrand = (Element)brand;
				eleBrand.setAttribute("id", String.valueOf(i));
			}
			
		}
		
		saveXML();
	}
	
	// 删除元素
	public void deleteBrand() {
		NodeList nl = document.getElementsByTagName("brand");
		// 从0开始删除会出现错误
		// 原因: 当删除第0个元素时, 第1个元素会移到0的位置, 然后继续删除第一个元素(其实是原来第二个元素), 则原来第一个元素没有被删除
		for (int i = nl.getLength() - 1; i >= 0; i--) {
			Node brand = nl.item(i);
			if (brand.getNodeType() == Node.ELEMENT_NODE) {
				Element eleBrand = (Element)brand;
				if (eleBrand.getAttribute("name").equals("三星")) {
					System.out.println("等于三星");
					eleBrand.getParentNode().removeChild(eleBrand);
				}
			}
		}
		saveXML();
	}
	
	public static void main(String[] args) {
		ParseXMLDemo d = new ParseXMLDemo();
		d.getDom();
//		d.addPhone();
//		d.updateBrand();
		d.deleteBrand();
		d.showInfo();
	}
}
