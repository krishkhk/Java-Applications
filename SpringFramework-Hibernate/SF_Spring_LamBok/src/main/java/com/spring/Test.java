package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Test {

	public static void main(String[] args) {
	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("C:\\Users\\hk21398\\eclipse-workspace4\\SF_Spring_LomBok\\src\\main\\resources\\spring.xml"));
Institute it=(Institute)factory.getBean("id");
	it.display();
	}

}
