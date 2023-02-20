public class SwitchCase {
    public static void main(String[] args) {
        String browser = "chrome";
        switch (browser) {
            case "chrome":
                System.out.println("Launch Chrome");//meaning inside our switch statement we can write if conditions
                if (10 > 5) {
                    System.out.println("10 is greater than 5");
                }

                break;
            case "firefox":
                System.out.println("Launch firefox");
                break;
            case "safari":
                System.out.println("safari");
                break;
            case "ie":
                System.out.println("Launch ie");
                break;
            case "opera":
                System.out.println("Launch opera");
                break;
            default:
                System.out.println("please pass the right browser");
                break;


        }
    }
}
