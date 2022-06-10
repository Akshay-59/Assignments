package com.test;

import static org.junit.Assert.*;

import java.lang.reflect.Executable;

import org.junit.Test;

import com.trade.LondonDao;
import com.trade.NewyorkDao;
import com.trade.Region;
import com.trade.RegionalDao;
import com.trade.RegionalDaoManager;
import com.trade.TokyoDao;

public class RegionalDaoManagerTest {
	
	@Test  
	public void Positive_Test_London() {
		RegionalDaoManager rdm = new RegionalDaoManager();
		
		Class<? extends RegionalDao> actual = rdm.getRegionalDao(Region.LONDON).getClass();
		Class<? extends LondonDao> expected = new LondonDao().getClass();
		
		assertEquals(expected, actual);
	}
	
	@Test 
	public void Positive_Test_Tokyo() {
		RegionalDaoManager rdm = new RegionalDaoManager();
		
		Class<? extends RegionalDao> actual = rdm.getRegionalDao(Region.TOKYO).getClass();
		Class<? extends TokyoDao> expected = new TokyoDao().getClass();
		
		assertEquals(expected, actual);
	}  
	 
	@Test 
	public void Positive_Test_Newyork() {
		RegionalDaoManager rdm = new RegionalDaoManager();
		
		Class<? extends RegionalDao> actual = rdm.getRegionalDao(Region.NEWYORK).getClass();
		Class<? extends NewyorkDao> expected = new NewyorkDao().getClass();
		
		assertEquals(expected, actual);
	}  
	
	@Test
    public void Exception_Test() {
		
		RegionalDaoManager rdm = new RegionalDaoManager();

        Executable e  = () -> rdm.getRegionalDao(Region.valueOf("some other value"));

        assertThrows(IllegalArgumentException.class,e);

    }
	
}
