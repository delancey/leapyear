import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class LeapYearTest {
    
    @Test
    public void divisibleByFour(){
               
    }

    @Test
    public void divisibleBy100(){

    }

    @Test
    public void divisibleBy100And400(){
        LeapYear LeapYear = new LeapYear();
        // LeapYear.calculateLeapYear(1900);
        // assertFalse(false);
        assertEquals(true, LeapYear.calculateLeapYear(2000));
        assertEquals(true, LeapYear.calculateLeapYear(2200));
        // assertEquals(true, LeapYear.calculateLeapYear(1900));
    }


}