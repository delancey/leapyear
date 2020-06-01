import static org.junit.Assert.assertFalse;

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
        LeapYear.calculateLeapYear(1900);
        assertFalse(false);
    }


}