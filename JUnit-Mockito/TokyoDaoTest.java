package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import javax.sql.DataSource;

import org.junit.Test;

import com.ds.OracleDataSource;
import com.ds.SqlServerDataSource;
import com.trade.LondonDao;
import com.trade.TokyoDao;

public class TokyoDaoTest {

	@Test
	public void test() {
		TokyoDao dao = new TokyoDao();
		Class<? extends DataSource> actual = dao.getDataSource().getClass();
		Class<? extends SqlServerDataSource> expected = new SqlServerDataSource().getClass();
		
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
