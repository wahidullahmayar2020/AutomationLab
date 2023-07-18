package JavaRecap;

public class Assignment {
    public static void main(String[] args) {

        int a = 1;
        int b = a++ + ++a * --a - a--;//a=2,
        //1 +3 *2 -2==>1+6-2==>5
        System.out.println(b);

        int m = 0, n = 0;
        int p = --m * --n * n-- * m--;//m=-2, n=-2, p=1

        //-1*-1*-1*-1==>1
        //

        System.out.println(p);
        System.out.println(m);
        System.out.println(n);

        int i = 19, j = 29;//

        int k = i-- - i++ + --j - ++j + --i - j-- + ++j - j++;//i=18,j=29,

        //19 - 18 +28 - 29 + 18 -29 + 30=1+28-11+1==29-11+1==19
        //18-29+29==>K=18
        System.out.println("i=" + i);//18
        System.out.println("j=" + j);//29
        System.out.println("k=" + k);//18

        char t = 'A';//ASCI Value of t=65
        System.out.println((int) ++t);//66

        //Finding the greatest number out of three different given numbers
        int d = 25;
        int e = 78;
        int f = 87;
        if (d > e && d > f) {
            System.out.println(d + "is the greatest number");
        } else if (e > f && e > d) {

            System.out.println(e + "is the greatest number");
        } else {
            System.out.println(f + " is the greatest number");
        }
//if number is positive or negative
        int num = -10;
        if (num > 0) {
            System.out.println("number is positive");
        } else {
            System.out.println("number is negative");
        }

        ///
        int g = 4;
        if (g % 2 == 0) {
            System.out.println(g + " is even number");
        } else {
            System.out.println(g + " is odd number");
        }

        //find the greatest number between these 3 numbers
        int a1 = -100;
        int b1 = -600;
        int c1 = -1200;

        if (a1 > b1 && b1 > c1) {
            System.out.println("a is the greatest");
        } else if (b1 > c1) {
            System.out.println("b is the greatest");
        } else {
            System.out.println("c is the greatest");
        }


    }
}
