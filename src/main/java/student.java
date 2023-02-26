public class student {
    //WAF
    //create a method get students mark
    //pass a parameter: studentName(String)
    //return studentmarks-->int
    public int getStudentsMarks(String studentsName){
        int marks=-1;
        System.out.println("getting marks for:"+studentsName);
        if(studentsName.equalsIgnoreCase("mj")){
            marks=90;
        }else if(studentsName.equalsIgnoreCase("Arsh")){
            marks=100;
        }else if(studentsName.equalsIgnoreCase("Tamo")){
            marks=80;
        }else if(studentsName.equalsIgnoreCase("Jannat")){
            marks=10;
    }else {

            System.out.println("no student found..please pass the right student name...."+studentsName);
        }
        return marks;
    }

    public static void main(String[] args) {
        student st=new student();
        int student1=st.getStudentsMarks("mj");
        System.out.println(student1);
        int student2=st.getStudentsMarks("arsh");
        System.out.println(student2);
        int student3=st.getStudentsMarks("tamo");
        System.out.println(student3);
        if (student3>=0){
            System.out.println("print the student marksheet");

        }
        int student4=st.getStudentsMarks("zabi");
        System.out.println(student4);//-1 will be printed
        if (student4>=0){
            System.out.println("print the student marksheet");

        }
        int student5=st.getStudentsMarks("Peter");
        System.out.println(student5);
    }
}
