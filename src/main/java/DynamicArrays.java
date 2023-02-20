import java.lang.reflect.Array;
import java.util.ArrayList;

public class DynamicArrays {
    public static void main(String[] args) {
        //Arrayslist--default class
        //create object of ArrayList
        ArrayList ar = new ArrayList();
        ar.add(100);
        ar.add(200);
        //getting the size of Arraylist
        System.out.println(ar.size());
        ar.add(300);
        ar.add(400);
        ar.add(500);
        System.out.println(ar.size());
        System.out.println(ar.get(0));//Getting the element of an arraylist
        ar.add(600);
        System.out.println(ar.get(5));
        ar.add(12.33);
        ar.add(true);
        ar.add('m');
        ar.add("testing");
        //What if we want to only add int data types in our ArrayList we use generic concept
        ArrayList<Integer> studentsMarks = new ArrayList<Integer>();//vc=10, pc=0
        studentsMarks.add(50);
        studentsMarks.add(40);
        System.out.println(studentsMarks.size());
        ArrayList<Double> bmiList = new ArrayList<Double>();//vc=10, pc=0
        bmiList.add(23.45);
        bmiList.add(345.67);
        ArrayList<String> browsers = new ArrayList<String>();
        browsers.add("Chrome");
        browsers.add("firefox");
        browsers.add("Opera");
        System.out.println(browsers.size());
        System.out.println(browsers);
        //print all values using for loop
        for (int i = 0; i < browsers.size(); i++) {
            System.out.println(browsers.get(i));
            if (browsers.get(i).equals("firefox")) {
                System.out.println("mozilla");
                break;
            }
        }
//for each loop
        System.out.println("____________________");
        for (String brow : browsers) {
            System.out.println(brow);
        }
//add employee info into arraylist (name,Age,salary,string,char,true
        System.out.println("____________________");
        ArrayList<Object> empInfoList = new ArrayList<Object>();
        empInfoList.add("Mj");
        empInfoList.add(25);
        empInfoList.add("Kabul");
        empInfoList.add('f');
        empInfoList.add(true);
        System.out.println(empInfoList.size());
        System.out.println(empInfoList);
        for (Object emp : empInfoList) {
            System.out.println(emp);

        }
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(100);
        numbers.add(580);
        numbers.add(980);
        numbers.add(100);
        System.out.println(numbers);
        for (int nu : numbers) {
            System.out.println(nu);
            if (nu == 580) {
                System.out.println("You passed the test");
                break;
                //load factor for this ArrayList Lf=pc/2->size()/2
                //vc=1=, pc=0
                //pc=10, vc=0, lanstindex=0-9;
                //LF=pc/2-->10/2=5
                //pc=15, vc=0, 0-14
                //LF=pc/2-->15/2-->7
                //use cases:
                //Uber: carsList
                //userlists
                //total number of links in the page-->LinksList
                //Total number of images-->ImageList
                //ArrayList is a part of collection

            }
        }
    }
}
