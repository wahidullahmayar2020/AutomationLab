public class studentWithSwitchCase {

    public int getStudetnsMarks(String studentNames) {
        int mark = -1;

        switch (studentNames) {
            case "Arsh":
                mark = 80;
                System.out.println(mark);
                break;
            case "Tamo":
                mark = 98;
                System.out.println(mark);
                break;
            case "MJ":
                mark = 65;
                System.out.println(mark);
                break;
            default:
                System.out.println("no student found..please pass the right student name...." + studentNames);
                break;


        }
        return mark;
    }

    public static void main(String[] args) {
        studentWithSwitchCase s1=new studentWithSwitchCase();
        int student1=s1.getStudetnsMarks("Arsh");

    }
}



