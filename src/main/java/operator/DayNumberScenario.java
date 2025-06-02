package operator;

public class DayNumberScenario {
    public static void main(String[] args) {
        String dayname = "Monday";
        int daynumber = 0;

        if(dayname.equals("Monday")){
            daynumber = 1;
        }else if(dayname.equals("Tuesday")){
            daynumber = 2;
        }else if(dayname.equals("Wednesday")){
            daynumber = 3;
        }

        System.out.println(dayname + " - " + daynumber);
    }
}
