package com.test;

import static org.junit.Assert.assertEquals;

import javax.swing.plaf.synth.Region;

import org.junit.Test;

import com.trade.TradeService;

@ExtendWith(MockitoExtension.class)
public class TaskServiceTest {

	@Test
	void London_Test() {
		TradeService ts = new TradeService();
		Region actual = ts.getTradeRegion(12145671);
		Region expected = Region.LONDON;
		
		assertEquals(expected, actual);
	} 
	
	@Test
	void Newyork_Test() {
		TradeService ts = new TradeService();
		Region actual = ts.getTradeRegion(12232140);
		Region expected = Region.NEWYORK;
		
		assertEquals(expected, actual);
	}
	
	@Test
	void Tokyo_Test() {
		TradeService ts = new TradeService();
		Region actual = ts.getTradeRegion(12345678);
		Region expected = Region.TOKYO;
		
		assertEquals(expected, actual);
	} 
	
	@Test 
	void Exception_Test() {
		TradeService ts = new TradeService();
		Executable e = () -> ts.getTradeRegion(12576615);
		
		assertThrows(IllegalArgumentException.class, e);
	}
	 
	

}
