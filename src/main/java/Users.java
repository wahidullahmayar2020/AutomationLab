public class Users {
    String name;
    int age;
    String city;

    public static void main(String[] args) {
        Users us1=new Users();
        us1.name="Riya";
        us1.age=30;
        us1.city="DOHA";

        Users us2=new Users();
        us2.name="Khan";
        us2.age=29;
        us2.city="LA";

        Users us3=new Users();
        us3.name="TAMO";
        us3.age=69;
        us3.city="WARDAK";
        System.out.println(us1.name+" "+us1.age+" "+us1.city);
        System.out.println(us2.name+" "+us2.age+" "+us2.city);
        System.out.println(us3.name+" "+us3.age+" "+us3.city);
        System.out.println("___________________________");
us1=us2;
        System.out.println(us1.name+" "+us1.age+" "+us1.city);
        System.out.println(us2.name+" "+us2.age+" "+us2.city);
        System.out.println(us3.name+" "+us3.age+" "+us3.city);

        System.out.println("___________________________");
        us2=us3;

        System.out.println(us1.name+" "+us1.age+" "+us1.city);
        System.out.println(us2.name+" "+us2.age+" "+us2.city);
        System.out.println(us3.name+" "+us3.age+" "+us3.city);
        System.out.println("___________________________");

        us3=us1;

        System.out.println(us1.name+" "+us1.age+" "+us1.city);
        System.out.println(us2.name+" "+us2.age+" "+us2.city);
        System.out.println(us3.name+" "+us3.age+" "+us3.city);

    }

}
