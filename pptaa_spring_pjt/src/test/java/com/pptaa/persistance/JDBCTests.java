package com.pptaa.persistance;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {

	static {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnecntion() throws SQLException {
		try(Connection con = 
				DriverManager.getConnection("jdbc:mariadb://localhost:3306/temp?user=book_ex&password=book_ex")){
			log.info(con);
			if(con != null) {
				System.out.println("DB Connection Success!");
			}
		} catch(Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
