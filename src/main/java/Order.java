public class Order {
    public int getOrder(String customerName,int price,int tax){
       //Problem with this code is we are not using the method parameters in our business logic
        System.out.println(customerName);
       int k=price+tax;
        return k;

    }
    public int getOrder(String customerName,int price){
        //Problem with this code is we are not using the method parameters in our business logic
        System.out.println(customerName);
        int k=price;
        return k;

    }
    public static void main(String[] args) {
        Order or=new Order();
        int item=or.getOrder("MJ",100,20);
        System.out.println(item);
        int item2=or.getOrder("john",120);
        System.out.println(item2);


    }
}
