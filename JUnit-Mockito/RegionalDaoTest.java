package com.test;

import static org.junit.Assert.*;

import java.lang.reflect.Executable;

import org.junit.Test;

import com.trade.RegionalDao;
import com.trade.RegionalDaoManager;
import com.trade.TradeDetails;



public class RegionalDaoTest {

	
	@Mock
    RegionalDao regionalDao;
    RegionalDaoManager regionalDaoManager = new RegionalDaoManager();
	
	 @Test
	    public void getTradeDetails_Test() {
		 
	        Mockito.when(regionalDao.getTradeDetails(Mockito.any(long.class))).thenReturn(new TradeDetails());
	        TradeDetails td = regionalDao.getTradeDetails(1214578);
	        assertNotNull(td);
	    }
	 
	 @Test
	    public void Exception_Test() {
		 
	        Mockito.doThrow(RuntimeException.class).when(regionalDao.getTradeDetails(Mockito.any(long.class)));
	        Executable e = () -> regionalDao.getTradeDetails(12345678);
	        assertThrows(RuntimeException.class,e);
	    }
 
}
