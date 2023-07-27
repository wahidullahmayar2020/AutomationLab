package JavaRecap;

public class TimeComplexity {
    public static void main(String[] args) {
        int i=1;
        System.out.println(i);//constant time complexity Big 0(1)

        String name="Tom";
        System.out.println(name);//Time complexity Big 0(1)

        int n=10;
        for(int p=1; p<=n;p++){
    System.out.println(p);




}
        //1+n+n+n==>3n+1==>liner equation-->we have to remove the constant-->Big O(3n)-->big o (n)

        //nested loop:
        //printing below pattern
        //00 01 02 03 04
        //10 11 12 13 14
        //20 21 22 23 24
        //30 31 32 33 34
        System.out.println("-----------------");
for(int m=0;m<=4;m++){
    for (int e=0;e<=4;e++){
        System.out.print(m+""+e+" ");


    }
    System.out.println();



}

    }
}
