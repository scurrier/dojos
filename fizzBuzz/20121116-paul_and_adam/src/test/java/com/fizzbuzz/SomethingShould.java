package com.fizzbuzz;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SomethingShould{

    @Test
    public void returnTrueIfNumberIs9andMultipleIs3() {
    	assertTrue(isMultipleOf(3, 9));
    }
    
    @Test
    public void returnTrueIfNumberIs10andMultipleIs5() {
    	assertTrue(isMultipleOf(5, 10));
    }
    
    @Test
    public void returnTrueIfNumberIs9andMultipleIs5() {
    	assertFalse(isMultipleOf(5, 9));
    }
    
    @Test
    public void returnTrueIfNumberIs10andMultipleIs3() {
    	assertFalse(isMultipleOf(3, 10));
    }
    
    private static boolean isMultipleOf(int multiple, int number) {
    	return (number % multiple) == 0;
    }
    
}
