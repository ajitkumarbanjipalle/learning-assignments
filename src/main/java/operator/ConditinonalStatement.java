package operator;

public class ConditinonalStatement {
    public static void main(String[] args) {

        // Trekking Camp
        // age criteria

        // 18 - not allowed
        // 18 - 30 = allowed , base camp 3
        // 30 - 45 = allowed , base camp 2
        // > 45    = allowed , base camp 1

        int age = 23;
        String whichBaseCamp = "";

        if(age < 18){
            whichBaseCamp = "not allowed";
        }else if(age >= 18 && age <= 30){
            whichBaseCamp = "basecamp 3";
        }else if(age >= 30 && age <= 45){
            whichBaseCamp = "basecamp 2";
        }else{
            whichBaseCamp = "basecamp 1";
        }

        System.out.println(whichBaseCamp);
    }
}
