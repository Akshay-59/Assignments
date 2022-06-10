package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import javax.sql.DataSource;

import org.junit.Test;

import com.ds.MySqlDataSource;
import com.ds.OracleDataSource;
import com.trade.LondonDao;

public class LondonDaoTest {

	@Test 
	public void Positive_Test() {
		LondonDao dao = new LondonDao();
		Class<? extends DataSource> actual = dao.getDataSource().getClass();
		Class<? extends DataSource> expected = new MySqlDataSource().getClass();
				
		assertEquals(expected, actual);
	}
	
	@Test 
	public void Negative_Test() {
		LondonDao dao = new LondonDao();
		Class<? extends DataSource> actual = dao.getDataSource().getClass();
		Class<? extends DataSource> expected = new OracleDataSource().getClass();
				
		assertNotEquals(expected, actual);
	}
 
}
