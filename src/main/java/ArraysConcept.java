import java.util.Arrays;

public class ArraysConcept {
    public static void main(String[] args) {
        int a = 10;
        a = 20;
        a = 30;
        System.out.println(a);
        //delcaring an Array
        //1.With new keywoard:
        int b[] = new int[4];
        b[0] = 10;
        b[1] = 45;
        b[2] = 30;
        b[3] = 98;

        System.out.println(b[0]);
        System.out.println(b[3]);
//        System.out.println(b[4]);ArrayIndexOutOfBoundsException: 4/Since we do not have index 4 will get an exception
        int ArrayLength = b.length;
        System.out.println(ArrayLength);

        int highIndex = ArrayLength - 1;
        System.out.println(highIndex);

        int lowestIndex = 0;
        System.out.println(lowestIndex);
        //printing values from an array
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);//
        }
//Printing values of Array without for loop
        System.out.println(b);//Gives memory interest of this array not useful
        System.out.println(Arrays.toString(b));
        double d[] = new double[2];
        d[0] = 2.56;
        d[1] = 56.89;
        double arrayLengh = b.length;
        double highIndex1 = arrayLengh - 1;
        double lowIndex = 0;
        System.out.println(arrayLengh);
        System.out.println(highIndex1);
        System.out.println(lowestIndex);
        //String Array
        String emp[] = new String[3];
        emp[0] = "Ahmad";
        emp[1] = "Karem";
        emp[2] = "John";
        System.out.println(Arrays.toString(emp));
        System.out.println("Total employees: " + emp.length);
        System.out.println("________________________");
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
            if (emp[i].equals("Karem")) {
                System.out.println("Karem Salary is: " + 1000);
                break;

            }
        }

    }
}
