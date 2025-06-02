package operator;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        String dayname = "Monday";
        int daynumber = 0;

        switch (dayname){
            case "Monday":
            case "Mon":
            case "MON":
            case "MONDAY":
                daynumber = 1;
                break;
            case "Tuesday":
            case "Tue":
            case "TUE":
            case "TUESDAY":
                daynumber = 2;
                break;
            case "Wednesday":
                daynumber = 3;
                break;

            default:
                daynumber = -1;
                break;

        }
        System.out.println(dayname + " - " + daynumber);

        // switch case challenges
        // switch case check only equality
    }
}
