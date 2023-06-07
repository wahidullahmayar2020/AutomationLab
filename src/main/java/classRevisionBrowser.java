import java.util.ArrayList;

public class classRevisionBrowser {
String name;
String logo;
double version;
static final String language="JS";
    public static void main(String[] args) {
classRevisionBrowser b1=new classRevisionBrowser();
b1.logo="google";
b1.name="chrome";
b1.version=104.50;
//classRevisionBrowser.language="Python";
//        String Browserlangauge=classRevisionBrowser.language;
        classRevisionBrowser b2=new classRevisionBrowser();

        classRevisionBrowser b3=new classRevisionBrowser();

        classRevisionBrowser b4=new classRevisionBrowser();
//How to get the position of a particular element in an Arraylist

        ArrayList<String> num=new ArrayList<String>();
        num.add("apple");
        num.add("banana");
        num.add("orange");
        int sizeofi=num.indexOf("apple");
        System.out.println(sizeofi);
        String indexZero=num.get(0);
        System.out.println(indexZero);
       String arrayshrink=num.remove(0);
        System.out.println(arrayshrink);
        System.out.println(num);


        ArrayList<String> studentNames=new ArrayList<String>();
        num.add("fox");
        num.add("Sheep");
        num.add("Dog");
        num.add("Aligator");

        System.out.println(studentNames.size());
//        System.out.println(studentNames.remove(0));
        System.out.println(studentNames.size());


        ArrayList<String> namesList=new ArrayList<String>();//PC=4 and VC=6
        namesList.add("naveen");
        namesList.add("ravi");
        namesList.add("peter");
        namesList.add("lisa");
namesList.trimToSize();//size()=pc=4,
        //now pc=vc=4
        //LF=4/2=2
//        namesList.clear();
        System.out.println(namesList.remove(1));
        System.out.println(namesList);

//print 1.0 2.0 3.0 .....10.0

        System.out.println("____________________");
        for(double d=1.0;d<=10.0;d++){
            System.out.println(d);//1.0


        }
        //Print the following series

        //0 9 18 27 36 ...99

        System.out.println("____________________");
        for(int i1=0;i1<=99;i1=i1+9){
            System.out.println(i1);
        }
//Print only vowels (aeiou) using for and while loop start the loop from 'a' to 'z'
//Print 1 to 10 and break the loop once your find the multiplicaiton of 7 with a message"bye, see you tomorrow".
        System.out.println("____________________");
        for (int i2=1;i2<=100;i2++){
            System.out.println(i2);
    if(i2%7==0){
        System.out.println("bye, see you tomorrow");
//        break;


    }
            //Print only vowels (aeiou) using for and while loop start the loop from 'a' to 'z'


            }
}

    }



