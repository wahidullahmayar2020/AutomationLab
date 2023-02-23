public class Customer {
    String name;
    String age;
    double salary;
    char gender;
    boolean isActive;
    String dob;

    public static void main(String[] args) {
        Customer emp=new Customer();
        System.out.println(emp.name);
        System.out.println(emp.age);
        System.out.println(emp.salary);
        System.out.println(emp.gender);//default value of char is "\u0000 null charecter value
        System.out.println(emp.isActive);
        System.out.println(emp.dob);
        emp.name="MJ";
        System.out.println(emp.name);
        Customer emp1=new Customer();
        Customer emp2=new Customer();
        new Customer();
        Customer emp3;//a reference with out a object
        Customer emp4=new Customer();
        emp4=null;//null reference object
        //Calling Garbage Collector.
        //System.gc();//Not a good practice
        Customer emp5=new Customer();//This is eligble for garbage collector
        Customer emp6=new Customer();
   emp5=emp6;

   Customer emp7;
   emp7=new Customer();



    }
}
