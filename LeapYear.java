public class LeapYear {

    public boolean calculateLeapYear (int year){
        // year =  1900;
        if (year % 100 == 0 && year % 400 > 0){
            return false;
        } else if(year % 4 > 0){
            return false;
        }
        return true;
    } 



}