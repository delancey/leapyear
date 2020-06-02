import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LeapYearTest {
    
    @Test
    public void divisibleByFour(){
        LeapYear LeapYear = new LeapYear();  
        assertEquals(true, LeapYear.calculateLeapYear(2020));
        assertEquals(true, LeapYear.calculateLeapYear(1976));    
        assertEquals(false, LeapYear.calculateLeapYear(1975));    
    }

    @Test
    public void divisibleBy100And400(){
        LeapYear LeapYear = new LeapYear();        
        assertEquals(true, LeapYear.calculateLeapYear(2000));
        assertEquals(false, LeapYear.calculateLeapYear(2200));
        assertEquals(false, LeapYear.calculateLeapYear(1900));
    }
}