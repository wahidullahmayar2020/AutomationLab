package JavaRecap;

public class ConditionalStatements {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;

        System.out.println(a == b);
        if (a == b) {
            System.out.println("hi");
        } else {
            System.out.println("hello");
        }
        int c = 1;
        if (c > a) {
            System.out.println("bye");
        }

        if (false) {
            System.out.println("hi selenium");

        } else {//dead code meaning this block will never be excuted.
            System.out.println("bye selenium");
        }
        boolean flag = true;
        if (flag) {
            System.out.println("hi testing");


        } else {
            System.out.println("bye testing");
        }


        boolean test = true;
        if (!test) {
            System.out.println("testing is done");


        } else {
            System.out.println("testing is pending");
        }
        //
        int number = 85;
        if (number <= 100) {//nested if
            System.out.println("calculating your marks");
            if (number >= 90) {
                System.out.println("Grade A");
                if (number == 100) {
                    System.out.println("you got 100% scholarship");
                } else {
                    System.out.println("your not eligible for 100% scholarship");
                }

            } else {
                if (number >= 80) {
                    System.out.println("You got grade B");
                }
            }

        } else {
            System.out.println("plz pass the right marks..");
        }

//        //if-elseif
//        String browser="ie";// This is not the right way of writting code./ This code is not optimized
//        if(browser.equals("chrome")){
//            System.out.println("launch chrome");
//        }
//if(browser.equals("fireofx")){
//    System.out.println("launch firefox");
//}
//if (browser.equals("ie")){
//    System.out.println("launch safari");
//}else{
//    System.out.println("plz pass the right browser");
//}
//    }


        //using if-elseif
        String browser = "ie";//this code will bring performance issue concern
        if (browser.equals("chrome")) {
            System.out.println("launch chrome");
        } else if (browser.equals("firefox")) {
            System.out.println("launch firefox");
        } else if (browser.equals("safari")) {
            System.out.println("launch safari");
        } else if (browser.equals("ie")) {
            System.out.println("launch ie");
        } else {
            System.out.println("plz pass the right browser name...");
        }

//To code this in better way java has provided SwitchCase
    }
}





