package com.leapyear;

public class LeapYear {
    
    boolean isLeapYear(int year){
        if(year < 0 ) throw new IllegalArgumentException("Year can not be negative");
        if (year % 4 == 0) {
                return Boolean.TRUE;// A Leap Year
        } else
            return Boolean.FALSE;// Not a Leap Year;
       
    }
 }
 

