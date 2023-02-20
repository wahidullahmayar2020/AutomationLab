import java.util.Arrays;

public class ArrayLiteralConcepts {
    public static void main(String[] args) {
        //2.Array Literals
        int a[]={1,2,3,4,56,76,46};
        int ar[]=new int[4];
        int b[]={89,45,7,9,6};
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));
        double d[]={1.2,2.5,3.9,4.5};
        char vowels[]={'a','e','i','u'};

        System.out.println("____________");
        String browser[]={"chrome","firefox","IE","Safari"};
        for(int i=0;i<browser.length;i++){
            System.out.println(browser[i]);
//            if(browser[i].equals("IE")){
//                System.out.println("This is deprecated");
            //Limitation of array

        switch (browser[i]){
            case"chrome":
                System.out.println("Google");
                break;
            case "firefox":
                System.out.println("Dell");
                break;
            case "IE":
                System.out.println("TR");
                break;
            case "Safari":
                System.out.println("Apple");
                break;
            default:
            break;

        }
        }
//static array ex:When number or values ar fixed//static arrays are the same with array literals
        //month/days
        //200


    }
}
