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
    // TODO:- All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).
    @Test
    void yearWhichIsNotDivisibleByFour(){
        assertEquals(Boolean.FALSE,leapYear.isLeapYear(2017));
        assertEquals(Boolean.FALSE,leapYear.isLeapYear(2018));
        assertEquals(Boolean.FALSE,leapYear.isLeapYear(2019));
    }

    //TODO:- All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
    @Test
    void yearWhichIsDivisibleByFourButNotHundred(){

        assertEquals(Boolean.TRUE,leapYear.isLeapYear(2008));
        assertEquals(Boolean.TRUE,leapYear.isLeapYear(2012));
        assertEquals(Boolean.TRUE,leapYear.isLeapYear(2016));

    }









}