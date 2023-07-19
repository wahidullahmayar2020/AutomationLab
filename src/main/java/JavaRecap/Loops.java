package JavaRecap;

public class Loops {
    public static void main(String[] args) {
        //Printing 1 to 100;
//while loop
        int i = 1;
        while (i <= 9) {
            System.out.println(i);
            i++;
//            i=i+2;
            //Printing odd numbers between 1 to 100
        }
        int k = 1;
        while (true) {
            System.out.println("welcome to Hotel Taj");

            if (k == 5) {
                break;

            }
            k++;
        }
        //for loop.
        //printing 1 to 1o //for loop formula for(initi, conditon,increment/decrement)

        for (int f = 1; f <= 10; f++) {
            System.out.println(f);

            f++;//this way we can print odd numbers between 1 and 10


        }
        System.out.println("-------------------------");
        for (int f = 1; f <= 10; f++) {
            System.out.println(f);
        }
        int c = 1;
        for (; true; c++) {
            System.out.println("welcome to naveen automation labs");
            if (c == 5) {
                break;
            }
        }
        int p;
        for (p = 1; p <= 5; p++) {
            System.out.println(p);

        }
        System.out.println("-------------------");//Printing ASCI table value for small letters
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + " = " + (byte) ch);
        }
        System.out.println("-------------------");
        for (char ch1 = 'A'; ch1 <= 'Z'; ch1++) {//Printing ASCI table value for Capital letters
            System.out.println(ch1 + " = " + (byte) ch1);


        }
        //can we use boolean with for loops- no we never use.

        for (double d = 1.1; d <= 5.0; d++) {
            System.out.println(d);
            //
            for (int w = 1; w <= 100; w++) {
                System.out.println(w);
            }
            for (int w = 1; w <= 100; w++) {//print even numbers from 1 to 100
                if (w % 2 == 0) {
                    System.out.println(w);
                }
                //printing odd numbers from 1 to 100
                System.out.println("-------------------");
                for (int o = 1; o <= 100; o++) {
                    if (o % 2 == 1) {
                        System.out.println(o);
                    }


                }
                int a = 10;
                while (a <= 20) {
                    System.out.println(a);
                    a++;
                }

                // used cases of while loop.
                //when number of iterations are not fixed--while loop
                //total number of links/images in a page.
                //webtable pagination 1.2.3.4 ..next
                //web element loading on the page with not exact loading time coming on the page
                //page load time out.
                //calender: we use while loop to select the target month and date
                //build is running: some time takes 10,15,20

                //used cases of for loop
                //when number of iterations are fixed.
                //months/days drop down-->1 to 12
                //category options-->
                //Arrays, Arraylist since Arrays are fixed in size.
                //excel file--test data-- rows=10 since number of rows are fixed to cover data driven testing
                //country dropp from 1 to 230 countries if name="brazil" .click and break;
                //Read data : JSON/XML
                //Read data from DB: SQL-- rows/columns

                //do-while loop:
                int e=1;
                do{
                    System.out.println(e);
                    e++;
                }while(e>=10);

            }

        }
    }
}
