package JavaRecap;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        //++ increment -- decrement

        //post increment
        int a = 1;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        int p = -98;
        int q = p++;
        System.out.println(p);
        System.out.println(q);

        //pre increment
        int u = 1;
        int y = ++u;
        System.out.println(u);//2
        System.out.println(y);//2

        int x = 5;
        int z = ++x;
        System.out.println(x);//6
        System.out.println(z);//6

        int v = -99;
        int vv = ++v;
        System.out.println(v);//-98
        System.out.println(vv);//-98
        int pop = 2;
        System.out.println(pop++);//give 2 since this is post increment
        System.out.println(pop);//give 3 since pop will be added to 1

        int loop = 2;
        System.out.println(++loop);//pre increment value increases istantly
        System.out.println(loop);//3

        int amount=10;
        int finalAmount=amount+1;
        int finalamount2=amount+3;
        //post decrement
        int sub=4;
        int e=sub--;
        System.out.println(sub);//3
        System.out.println(e);//4


        int rest=-99;
        int api=rest--;
        System.out.println(rest);//100
        System.out.println(api);//-99

        //pre decrement
        int aa=2;
        int bb=--a;
        System.out.println(aa);//1
        System.out.println(bb);//1

        int s1=-1000;
        int s2=--s1;
        System.out.println(s1);//-1001
        System.out.println(s2);//-1001

        int s3=40;
        System.out.println(s3--);//40
        System.out.println(s3);//39

        int p3=50;
        System.out.println(--p3);//49
        System.out.println(p3);//49

        int naveen=1;
        int test=naveen++ +naveen++ +naveen++ +naveen++;
        System.out.println(test);
        System.out.println(naveen);// current value of naveen is 5





    }
}
