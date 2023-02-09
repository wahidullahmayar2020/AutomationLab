public class ForLoops {
    public static void main(String[] args) {
        //print from 1 to 10
        //have to initilize the value, condition,increment/decrement)
        int i = 1;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
//            i++;//a good way to print odd numbers

        }
        int c = 1;
        for (; true; ) {
            System.out.println("welcome to naveen automation lab");
            if (c == 5) {
                break;
            }
            c++;
        }
        //
        int p;
        for (p = 1; p <= 5; p++) {
            System.out.println(p);

        }

        System.out.println("------------------------");
        //printing a to z with ASCI Values
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + " = " + (byte) ch);
            //We can not use boolean in for loops.

            //try double,float,int,short,byte,long, char
            //write a program to print naveen 100

            for (int e = 1; e <= 100; e++) {
                System.out.println("naveen");
                //


            }
            for (double d = 1.1; d <= 5.1; d++) {
                System.out.println(d);
            }
            for (char ch1 = 'A'; ch1 <= 'Z'; ch1++) {
                System.out.println(ch1 + " = " + (byte) ch1);
            }
            for (int w = 1; w <= 100; w++) {
                if (w % 2 == 0) {
                    System.out.println(w);
                    //if we not odd numbers we use w%2==1

                    //use cases while loop.
                    //when number of iterations are not fixed then only we use while loop
                    //total number of link or /images in to page
                    //webtable pagination 1.2.3.4..next to check element is there ro no
                    //web element is loading on the page in different timing to be displayed
                    //page load time-out
                    //calender:
                    //built is running in the background :10 mins,1 hr,2 hr,30 mins.

                    //Use case of for loop
                    //when number of interation are fixed--for loop
                    //month/days/year drop down-->1 to 12- for loop
                    //category option of items on ecommerce
                    //Arrays and Arraylist since Arrays are fixed
                    //excel fiel-test data--row=10 use for loops rows=1 to 10.
                    //country drop down since number of countries are always fixed.i=1to 230
                    //Reading data from a file :Json/XML
                    //Read the data from database meaning SQL--rows/colums

                    //do-while loop

                    int e = 1;
                    do {
                        e++;
                        System.out.println(e);//will print 2 to 11
//                        break; if we use break print only 2 since loops break
//
                    }
                    while (e <= 10);

                  //Use case of Do While loop
                    //1.webtable pagination: Check if element is present already in the table, click on it and select
                    //2.go anc check the element and the start the while loop
                    //3. Calender: when we are on the desired month no need to interate for more months.

                    //4. for each
                    //5. streams



                }
            }
        }
    }
}

