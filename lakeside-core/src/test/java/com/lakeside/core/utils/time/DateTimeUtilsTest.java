package com.lakeside.core.utils.time;

import java.util.Date;

import org.junit.Test;

public class DateTimeUtilsTest {

	@Test
	public void test() {
		Date date = new Date();
		
		System.out.println(date.getTime());
		//date.UTC(year, month, date, hrs, min, sec)
		System.out.println(	DateTimeUtils.getUnixTime(date));
	}
	
}
