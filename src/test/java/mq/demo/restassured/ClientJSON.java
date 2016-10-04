package mq.demo.restassured;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class ClientJSON {

	@Test
	public void testCategoryItem(){
		
		String title = JsonPath.with(new File("/Users/mquraishi/Documents/workspace-neon/restassured/test/resources/store.json")).get("store.book[0].title");
		System.out.println(title);
	}
}
