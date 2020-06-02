public class LeapYear {

    public boolean calculateLeapYear (int year){
       
        if (year % 100 == 0 && year % 400 != 0 || year %4 != 0){
            return false;
        } 
        return true;
    } 



}