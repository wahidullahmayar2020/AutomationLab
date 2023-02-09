public class TimeComplexity {
    public static void main(String[] args) {
        int i=1;
        System.out.println(i);//Print only once
        //constant time : Big 0(1)
        String name="Tom";
        System.out.println(name);
        //Big O(1)
        int n=10;
        for(int e=1;e<=n;e++){
            System.out.println(e);
            //Big O(10)
        }
        //1+n+n+n==>linear equation 3n+1 we have to remove the constant part of this formula
        //3n+1-->3n-->we remove the numberical value of alpha chars(3) so remaining is
        //n-->O(n) the time complexity of this for loop.

    }

}
