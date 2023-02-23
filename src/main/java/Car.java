public class Car {
    String name;
    String color;
    int price;
    static final int wheels=4;
    static int steering=1;
//statis is the common property for all the objects but //object will not hold the static property
    //static var will be stored in CMA (Common Memory allocation)
    //and it will create only one copy for all the objects.
    public static void main(String[] args) {
       //static int i=10;//this is a local variable so we can not declare it static but we can declare it final and constants/Since static is only for global or class variables
        Car c1=new Car();
        c1.name="BMW";
        c1.color="white";
        c1.price=80;
//        c1.wheels=4;//This not the right way of accessing static variable //U  should access it using the class name
//        Car.wheels=5;//Accessing this way we overridden the value of wheel meaning we introudced a bug in to the code best practice is adding final key word after in our static variables.
        System.out.println(c1.name+" "+c1.color+" "+c1.price+" "+Car.wheels);
        System.out.println(c1.wheels);//not a right way of calling a static var using the reference name
        //System.out.println(name);//giving error since we can not call non static property directly we have call the object of it first+var name
        Car c2=new Car();
        c2.name="Audi";
        c2.color="Red";
        c2.price=98;
//        c2.wheels=4;//Among all there objects has one common value of wheels//These type of properties called static
        System.out.println(c2.name+" "+c2.color+" "+c2.price+" "+Car.wheels);
        Car c3=new Car();
        c3.name="Honda";
        c3.color="Silver";
        c3.price=20;
//        c3.wheels=4;

        System.out.println(c3.name+" "+c3.color+" "+c3.price+" "+Car.wheels);
//static property e.g Amazon logo. Amazon domain name.

    }
}
