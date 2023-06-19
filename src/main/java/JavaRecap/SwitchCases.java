package JavaRecap;

public class SwitchCases {
    public static void main(String[] args) {
        String browser="ie";
        switch (browser){
            case  "chrome":
                System.out.println("launch chrome");
                if(10>5){
                    System.out.println("10 is greater than 5");
                }
                break;
            case "Edge":
                    System.out.println("launch edge");
                    break;
            case "firefox":
                System.out.println("launch firefox");
                break;
            case "ie":
                System.out.println("launch i.e");
                break;

            default:
                System.out.println("wrong browser name");
                break;


        }
    }
}
