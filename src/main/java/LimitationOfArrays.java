import java.util.Arrays;

public class LimitationOfArrays {
    public static void main(String[] args) {
        int product[] = new int[50];
        //Biggest limiation size is fixed->Static Array to over come this we need to use dynamic array e.g Arraylist
        //2.smiliar type of data to overcome this we use Object array and object is a class the meaning the super class of all classes
        Object emp[] = new Object[5];//range 0-4
        emp[0] = "Tom";
        emp[1] = 20;
        emp[2] = 23.45;
        emp[3] = 'm';
        emp[4] = true;
        System.out.println(Arrays.toString(emp));
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
        }
        //static array exmaple
        //.bookmyshow.com-->200
        //2.flight/bus booking-->200 seats booked
        //3. ecomm->category
        //4.country drop down-->232 countries always fixed.

    }
}
