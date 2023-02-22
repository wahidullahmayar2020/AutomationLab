import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListFeatures {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>(20);
        //VC=20, PC=0
        //LF=10
        //VC=5, PC=0;
        //LF=5/2=2
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(100);
        numList.add(200);
        numList.add(300);
        numList.add(400);
        System.out.println(numList.size());//4
        numList.remove(2);//Array will automatically adjust it size.
        System.out.println(numList.size());//3
        System.out.println(numList.get(2));
        //we can not remove by it value on by it is index numList.remove(100);
        System.out.println(numList);

        ArrayList<String> empList = new ArrayList<String>(Arrays.asList("Tom", "MJ", "Robin", "Ravi"));
        System.out.println(empList.size());
        System.out.println(empList);
        empList.add("Jannat");
        System.out.println(empList.size());
        System.out.println(empList);
        empList.add(0, "Arsh");
        System.out.println(empList);
        List<Integer> numbs = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbs.size());

        List<String> pageNames = Arrays.asList("CartPage", "Login", "Logout");
        System.out.println("________________");
        ArrayList<Integer> nList = new ArrayList<Integer>();
        //VC=1= , PC=0
        nList.add(100);
        nList.add(260);
        nList.add(10);
        nList.add(4000);
        nList.add(5);
        System.out.println(nList);
        for (int i=0;i>nList.size();i--){
            System.out.println(nList.get(i));
        }
        System.out.println("________________");
//Sorting Arrays we use Collections.sort(nlist)
        //Reversing the values of an Array use Collections.reverse(nlist)


        Collections.sort(nList);
        System.out.println(nList);
        Collections.reverse(nList);
        System.out.println(nList);

        //Creating a static array and we want to sort it.
        int test[] = {23, 2, 45, 100, 1, 900};
        Arrays.sort(test);
        System.out.println(Arrays.toString(test));
        //
        ArrayList<String> myList=new ArrayList<String>(Collections.nCopies(5,"Iphone"));//prints the 5 copies of Ipohne
        System.out.println(myList.size());
        System.out.println(myList);

    }
}
