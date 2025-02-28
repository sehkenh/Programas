//Use a string to control a switch statement.

public class StringSwitch {
    public static void main(String[] args){

        String str = "two";

        switch (str){
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no match");
                break;
        }
    }
}
/*

    Nested Switch Statements

    switch(count){
    case 1:
        switch(target){
            case 0:
                System.out.println("target is zero");
                break;
            case 1:                                           -no conflicts with outer case 1
                System.out.println("target is one");
                break;
        }
    break;
    case 2: ...
    }

 */