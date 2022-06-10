package com.test;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.junit.Test;

import com.ds.MySqlDataSource;
import com.ds.OracleDataSource;
import com.trade.LondonDao;
import com.trade.NewyorkDao;

public class NewYorkDaoTest {

	@Test 
	public void positiveTest() {
		NewyorkDao dao = new NewyorkDao();
		Class<? extends DataSource> actual = dao.getDataSource().getClass();
		Class<? extends OracleDataSource> expected = new OracleDataSource().getClass();
		
		assertEquals(expected, actual);
	}
	
	@Test 
	public void Negative_Test() {
		LondonDao dao = new LondonDao();
		Class<? extends DataSource> actual = dao.getDataSource().getClass();
		Class<? extends DataSource> expected = new MySqlDataSource().getClass();
				
		assertNotEquals(expected, actual);
	}

}
