package com.study.shopmall;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MysqlTest {
	
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/shoppingmall?serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PW = "class304"; 
	
	@Test
	public void test() throws Exception{
		
		Class.forName(DRIVER);
		
		try(Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println("성공");
			System.out.println(con);
		} catch(Exception e) {
			System.out.println("에러발생");
			e.printStackTrace();
		}
		
		
	}

}
