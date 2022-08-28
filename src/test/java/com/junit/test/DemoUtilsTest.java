package com.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.luv2code.junitdemo.DemoUtils;

class DemoUtilsTest {
	 	
	 @Test
	 void testEqualsAndNotEquals() {
		 DemoUtils demoUtils = new DemoUtils();
		 
		 assertEquals(6, demoUtils.add(2, 4),"2+4 must be 6");
		 assertNotEquals(6, demoUtils.add(1, 9 ),"1+9 must not be 6");
		 
	 }
	 
	 @Test
	 void testNullAndNotNull(){
		 DemoUtils demoUtils = new DemoUtils();
		 
		 String str1 = null;
		 String str2 = "ss";
		 
		 assertNull(demoUtils.checkNull(str1), "object should be null");
		 assertNotNull(demoUtils.checkNull(str2), "object should not be null");
	 }
}
