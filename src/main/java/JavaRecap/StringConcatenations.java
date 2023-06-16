package JavaRecap;

public class StringConcatenations {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        String x = "hello";
        String y = "Selenium";
        System.out.println(x + y);
        System.out.println(a + y);
        System.out.println(a + b + x + y);
        System.out.println(x + y + a + b);//helloseleinum1020
        //since concatenation happes from left to right
        System.out.println(x + y + (a + b));
        char g = 'm';
        char p = 'n';

        System.out.println(g + p);//getting 219 since it is returing the Asci value of m and n which is
        //110 and 109
        System.out.println(g);//but when printing a char it prints the car value only treats when doing mathmatic operations
        //Every language use the same ASCI value.
        //small a-b: Asci range 97 to 122
        //Capital A-B: 65 to 90
        //0-9: 48 to 57
        System.out.println('$' + 'a');//36+97
        System.out.println((byte) 'a');//we are converting the asci value of a and printing them
        System.out.println((int) 'a');
        int s1 = 100;
        int s2 = 300;
        System.out.println("the value of s1 is:"+s1);
        System.out.println("the value of s2 is:"+s2);
        System.out.println("the value of s2 is:"+s2);
        System.out.println("the sum is:"+(s1+s2));

    }
}
