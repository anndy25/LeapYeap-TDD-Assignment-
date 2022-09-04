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
    // TODO:- Year which is not divisible by 4, that are not Leap year;
    @Test
    void yearWhichIsNotDivisibleByFour(){
        assertEquals(Boolean.FALSE,leapYear.isLeapYear(2017));
        assertEquals(Boolean.FALSE,leapYear.isLeapYear(2018));
        assertEquals(Boolean.FALSE,leapYear.isLeapYear(2019));
    }


}