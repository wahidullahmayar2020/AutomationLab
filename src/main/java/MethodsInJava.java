public class MethodsInJava {
    //Methods--class data memebers
    //1. no input, ro return that is why it void-no return
    public void test() {
//        System.out.println("simple test method");
        int it = 10;
        System.out.println(it);
    }

    //return type of this fucntion is int anything before the method name is the return type
    public int totalAmount() {
        System.out.println("totalamount");
        int it = 10;
        int tax = 5;
        int finalPayment = it + tax;
        return finalPayment;

    }

    public String trainerName() {
        System.out.println("trainer name");
        String name = "Naveen";
        return name;

    }
public char getGender(){
    System.out.println("get gender");
    char c='m';
    return c;
}

    public static void main(String[] args) {
        //we need to call the test method here so we have to create the object of the class
        MethodsInJava me = new MethodsInJava();
        me.test();
        int val = me.totalAmount();
        System.out.println(val);
        //naming convention for methods- it alwys starts with small letter//testSearchAmazon

        String trName = me.trainerName();
        System.out.println(trName);
        if (trName.equals("naveen")) {
            System.out.println("Naveen Automation lab");
        }
char gender=me.getGender();
        System.out.println(gender);
    }
}
