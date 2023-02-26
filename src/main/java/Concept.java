import java.util.ArrayList;
import java.util.Locale;

public class Concept {
//WAF
//supply browser name: String chrome/ff/Safari
//bussines log: lauch the browser
//return true if the browser is launched.
public boolean lanuchBroswer(String browserName){
    System.out.println("browser name: "+browserName);
    boolean flag=true;
   switch (browserName.toLowerCase().trim()){
       case "chrome":
           System.out.println("Launch chrome");
           break;
       case "firefox":
           System.out.println("Launch firefox");
           break;
       case "safari":
           System.out.println("Launch safari");
           break;
           default:
               System.out.println("please pass right browser name... "+browserName);
               flag=false;
               break;
   }
return flag;
}
public void test(){
    System.out.println("testing method");
    return;//Writting this way is possible since we are not returing anything/since void and return can not be togather.
}
public ArrayList<String> getEmployeeList(String compName) {
//WAF
//supply input parameters: Company name: IBM, Google, MS
//return: the list of employee of the company// meaning we are returning the dynamic list of employee since the number of employees are not fixed
    System.out.println("company name is: " + compName);
    ArrayList<String> empList = new ArrayList<String>();
    if (compName.trim().equalsIgnoreCase("IBM")) {
        empList.add("MJ");
        empList.add("Arsh");
        empList.add("Tamo");

    } else if (compName.trim().equalsIgnoreCase("Google")) {
        empList.add("Zabi");
        empList.add("Sofia");
        empList.add("Sonia");
    } else if (compName.trim().equalsIgnoreCase("ms")) {
        empList.add("Ibo");
        empList.add("Najib");
        empList.add("Iso");


    }else{
        System.out.println("please enter the correct company name");
    }
    return empList;
}

    public static void main (String[]args){
        Concept br1 = new Concept();
        ArrayList<String> ibmList=br1.getEmployeeList("ibm ");
        System.out.println(ibmList);
        ArrayList<String> googleList=br1.getEmployeeList("google ");
        System.out.println(googleList);
        System.out.println(googleList.size());//will give us the number of employees in google.
        ArrayList<String> msList=br1.getEmployeeList("ms ");
        System.out.println(msList);
        ArrayList<String> trrlist=br1.getEmployeeList("tr ");
        System.out.println(trrlist);
        System.out.println(trrlist.size());


        System.out.println("_____________");


        boolean isLanuched = br1.lanuchBroswer("OPERA ");
//        System.out.println(isLanuched);
//        boolean isLanuched2=br1.lanuchBroswer("opera");
//        System.out.println(isLanuched2);
        if (isLanuched) {
            System.out.println("enter the URL....");
        } else {
            System.out.println("don't enter the URL");
        }

    }
}
