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

    }

}
