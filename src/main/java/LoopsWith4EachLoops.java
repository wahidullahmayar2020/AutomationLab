import java.util.Arrays;

public class LoopsWith4EachLoops {
    public static void main(String[] args) {
        //for each loop or advanced for loop

        int a[] = new int[4];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        for (int e : a) {
            System.out.println(e);
        }//Time complexity is 0(n)
        String emp[] = new String[5];//0-4
        emp[0] = "Ahmad";
        emp[1] = "Karem";
        emp[2] = "John";
        emp[3] = "Khan";
        emp[4] = "Arsh";
        for (String e : emp) {
            System.out.println(e);
            if (e.equals("John")) {
                System.out.println("He is a developer");
            }
            Object employee1[] = new Object[5];//range 0-4
            employee1[0] = "Tom";
            employee1[1] = 20;
            employee1[2] = 23.45;
            employee1[3] = 'm';
            employee1[4] = true;
            for (Object k : employee1) {
                System.out.println(k);
            }
            int arr[] = new int[4];
            arr[0] = 10; //Print this array in reverse order//We can not use foreach or advanced loop here
            arr[1] = 20;
            arr[2] = 30;
            arr[3] = 40;
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.println(arr[i]);
            }
            int pr[] = new int[4];
            System.out.println(pr[0]);
            pr[0] = 1000;
            System.out.println(pr[0]);//Time complxity is 0(1) Since this print only once.
            //
            System.out.println("-----------------");
            int test[] = {10, 20, 40, 55, 66, 77, 88, 909};
            System.out.println(test.length);
            System.out.println(test[0]);//10
            System.out.println(test[7]);
//            test[0]=400;
//            System.out.println(test[0]);//400
            //Replacing values of an array
            test[3]=99;
            System.out.println(test[3]);
            System.out.println(Arrays.toString(test));


        }


    }
}
