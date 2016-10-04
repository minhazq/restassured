package mq.demo.restassured;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.path.xml.XmlPath;

public class ClientXMLPath {

	@Test
	public void testCategoryItem(){
		String name = XmlPath.with(new File("/Users/mquraishi/Documents/workspace-neon/restassured/test/resources/shopping.xml")).get("shopping.category.item[0].name");
		System.out.println(name);
	}
}
