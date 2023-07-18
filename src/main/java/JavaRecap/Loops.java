package JavaRecap;

public class Loops {
    public static void main(String[] args) {
        //Printing 1 to 100;
//while loop
        int i = 1;
        while (i <=9) {
            System.out.println(i);
            i++;
//            i=i+2;
            //Printing odd numbers between 1 to 100
        }
 int k=1;
        while (true){
            System.out.println("welcome to Hotel Taj");

            if(k==5){
            break;

        }
            k++;
        }
        //for loop.
        //printing 1 to 1o //for loop formula for(initi, conditon,increment/decrement)

        for(int f=1; f<=10;f++){
            System.out.println(f);

            f++;//this way we can print odd numbers between 1 and 10



        }
        System.out.println("-------------------------");
        for(int f=1; f<=10;f++){
            System.out.println(f);
    }
        int c=1;
    for(;true;c++){
        System.out.println("welcome to naveen automation labs");
        if(c==5){
            break;
        }
    }
    int p;
    for (p=1;p<=5;p++){
        System.out.println(p);

    }
        System.out.println("-------------------");//Printing ASCI table value for small letters
    for (char ch='a'; ch<='z';ch++){
        System.out.println(ch+" = "+(byte)ch);
    }
        System.out.println("-------------------");
    for(char ch1='A'; ch1<='Z'; ch1++){//Printing ASCI table value for Capital letters
        System.out.println(ch1+" = "+(byte)ch1);


    }
    //can we use boolean with for loops- no we never use.
    }
}
