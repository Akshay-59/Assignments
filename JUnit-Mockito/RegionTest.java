package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.trade.Region;


public class RegionTest {

	@Test
	public void Region_Positive_Test() {
		
		Region actual = Region.LONDON;
		Region expected = Region.valueOf("LONDON");
		assertEquals(expected, actual);
	}

}
