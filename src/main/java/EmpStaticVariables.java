public class EmpStaticVariables {
static String ceoname="Ramesh";
static String companyName="HP";
int empcode;
String empname;
char deptgrade;
String projectname;
int totalprojects;
int totaldept;
int totalemp;
int totalfaculty;
    public static void main(String[] args) {

        EmpStaticVariables emp=new EmpStaticVariables();
        EmpStaticVariables emp2=new EmpStaticVariables();
        EmpStaticVariables emp3=new EmpStaticVariables();

        emp2.totalfaculty=100;
        System.out.println(emp2.totalfaculty);


    }
}
