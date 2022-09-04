package com.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {
    LeapYear leapYear=new LeapYear();
    
    // TODO:-  for negative year it will throw exception
    @Test
    void errorShouldThrowForNegativeYear(){
        assertThrows(IllegalArgumentException.class,()->{
            leapYear.isLeapYear(-2010) ;
        });
    }

}