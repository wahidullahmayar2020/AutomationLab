public class StringConcantation {
    public static void main(String[] args) {


    int a=10;
    int b=20;
        System.out.println(a+b);//30

        String x="Hello";
        String y="Selenium";
        System.out.println(x+y);
        System.out.println(a+x);
        System.out.println(a+b+x+y);
        System.out.println(x+y+a+b);
        System.out.println(x+y+(a+b));
        double c=12.33;
        double d=23.44;
        System.out.println(x+y+c+d);
        System.out.println(x+y+a+b+c+d);

        char g='m';//char takes two byte
        char p='n';
        String l="testing";
        String u="automation";
        System.out.println(l+u+g+p);
        char t1='a';//97 is the value for a in asci table
        char t2='b';//98 is the value for a in asci table
        System.out.println(t1+t2);
        char t3='z';//122 from asci table
        System.out.println(t1+t2+t3);
        char gender='m';
        //finding range of asci values
        //a-z 97 to 122
        //A-Z 65 to 90
        //0-9 48 to 57
        System.out.println('$'+'a');//asci 36+97
        System.out.println((byte)'a');
        System.out.println((byte)'$');
        System.out.println((int)'$');

        int s1=100;
        int s2=300;
        System.out.println("the value of s1 is :"+ s1);
        System.out.println("the sum is :"+ (s1+s2));
}}
