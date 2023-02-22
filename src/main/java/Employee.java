public class Employee {
    //Class varialbes--Class data member or global varibales
    String name;
    int age;
    String city;

    public static void main(String[] args) {
//String name="MJ";//local variables
//class is template or a blueprint of the object
// object is a physical entity
      Employee emp=new Employee();
      emp.name="Tom";
      emp.age=12;
      emp.city="Kabul";
        System.out.println(emp.name+" "+emp.city+" "+emp.age);
        Employee emp1=new Employee();
        emp1.name="Arsh";
        System.out.println(emp1.name);//will give null since name value is stored in emp
        System.out.println(emp1.age);//will give 0 since default value of int is zero


        //
        new Employee().name="Jannat";//New object since as soon we declare new keyword it creates new object//This type of object is called No reference Object-- not recommended to use
        new Employee().age=25;//new object
        new Employee().city="Kabul";



    }
}
