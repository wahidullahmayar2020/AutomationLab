public class Shopping {

    //This is method overloading //Method overloading happens in the same class//when u have number of methods with same name but
    //1.with same name
    //2.with different parameters.
    //3.different number of parameters
    //.4.different order of parameters.
    //5. Return type does not matter
    public void test() {
        System.out.println("test method");
    }

    public int test(double d) {
        System.out.println("test method");
        return 100;


    }

    public void test(int i, int j) {//This is duplicate method not allowed.
        System.out.println(i + j);


    }

    public void test(String p) {
        System.out.println(p);
    }

    public void test(String p, int q) {
        System.out.println(p);
    }

    //Used cases of method overloading
    public void login() {


    }

    public void login(String userName, String password) {


    }

    public void login(String userName, String password, String rule) {


    }

    //
    public void search() {


    }

    public void search(String productName) {


    }

    public void search(String productName, int priceRange) {


    }

    public void search(String productName, int priceRange, String color) {


    }

    public void doPayment(String upi) {

    }

    public void doPayment(String cc, int ccv) {

    }

    public void doPayment(String payPal, String pwd, int otp) {
        //uber:booking

    }

    public void doPayment(String stripeId, int otp, String Key) {
        //uber:booking

    }

    public void booking(String fromLocation, String toLocation, int passenger) {


    }

    public static void main(String[] args) {
        Shopping shop = new Shopping();
        shop.login();
        shop.login("mj", "book@1234");

    }
}
