public class ConditionalStatement {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
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
        if (true) {
            System.out.println("hi selenium");
        } else {//Dead code meaning this line of code will never execute
            System.out.println("Bye selenium");
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
        //Nested if
        int number = 85;
        if (number <= 100) {
            System.out.println("calculating your marks");
            if (number >= 90) {
                System.out.println("You got grade A");
                if (number == 100) {
                    System.out.println("You got 100% Scholarship");
                } else {
                    System.out.println("Your not eligible for 100% Scholarship");
                }
            }
            if (number >= 80) {
                System.out.println("Grade B");
            }
        } else {
            System.out.println("please pass the right marks...");
        }
////If-if-if-else-if
//        String browser = "chrome";
//        if (browser.equals("chrome")) {
//            System.out.println("Launch Chrome");
//        }
//        if (browser.equals("firefox")) {
//            System.out.println("Launch firefox");
//        }
//        if (browser.equals("safari")) {
//            System.out.println("Launch safari");
//        }
//        if (browser.equals("ie")) {
//            System.out.println("Launch e");
//
//    }
//        else{
//            System.out.println("please pass the right browser...");
//        }
        //Issue with this code is not efficient and optimized.


        //using the same scenario using if-else if
        String browser = "chrome";
        if (browser.equals("chrome")) {
            System.out.println("Launch Chrome");


        } else if (browser.equals("firefox")) {
            System.out.println("Launch firefox");
        } else if (browser.equals("Safari")) {
            System.out.println("Launch Safari");
        } else if (browser.equals("ie")) {
            System.out.println("Launch ie");


        } else {
            System.out.println("plz pass the right browser");
        }
    }
}
