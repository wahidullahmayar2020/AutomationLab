public class TimeComplexity {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i);//Print only once
        //constant time : Big 0(1)
        String name = "Tom";
        System.out.println(name);
        //Big O(1)
        int n = 10;
        for (int e = 1; e <= n; e++) {
            System.out.println(e);
            //Big O(10)
        }
        //1+n+n+n==>linear equation 3n+1 we have to remove the constant part of this formula
        //3n+1-->3n-->we remove the numberical value of alpha chars(3) so remaining is
        //n-->O(n) the time complexity of this for loop.

        int p = 1;
        int q = 0;
        while (p <= 10) {
            System.out.println("hi");
            System.out.println(p);
            System.out.println(q);
            p++;
            q++;
        }

        System.out.println("_________________");
//1+1+n+n+n+n+n+n=6n+2=>2(3n+1)=>disregard the +1=>6n==>diregard the 6==>0(n)
        //fiding time complexity for nested loops
        //print the below pattern.
        // 00,01,02,03,04
        //10,11,12,13,14
        //20,21,22,23,24
        //30,31,32,33,34

        //matrix of m*k
        for (int m = 0; m <= 4; m++) {
            for (int k = 0; k <= 4; k++) {
                System.out.print(m + "" + k + " ");//adding a string and concatenating //00,01,02,03,04

            }
            System.out.println();//we had this too get the out put of all numbers in a seperate line
//finding the time complexity of this for loop
            //(1+n+n+n)(1+n+n+n)=>(1+3n)(1+3n)==>1+3n+3n+9n^2=>9n^2+6n+1=>Quadratic==>
            // 9n^2+6n=>3(3n^2+2n)=>n^2+n=>n(n+1)=>n^2=>0(n^2)/This is the time complexity
//BS- Binary Search:
            //n/2, n/4,n/8,n/16
            //32-->16-->8-->4-->2-->1
            //o(log n)
            //k=n/2
            //log k=log(n/2)
            //log k=log n+log 2
            //log k=log n

            //k=log(n) the binary searhc will give the time complexity of log(n)

            //byte range -128 to 127
            byte b1=10;
       byte b2=90;
       int b3=b1+b2;//100 but still if we want to store this in to byte we do the following
            byte b4=(byte)(b1+b2);
            System.out.println(b4);//But best practice is to go with int or else this can cause bug

for (int i1=1;i1<=127;i1++){
    System.out.println("i="+i1);
}

            //printing the ASCI Values
            for(char ch='0';ch<='9';ch++){
                System.out.println(ch+" = "+(byte)ch);
            }
byte t1=077;//any number starts with 0 called octal number
            System.out.println(t1);
            //converting octal to decimal number
            //065 = (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 0+48+5=53 so java is converting this and giving us the 53
            //the maximum octal number is from 0 to 7
        }
int t2=07766;//should give 4086
        System.out.println(t2);



    }

}
