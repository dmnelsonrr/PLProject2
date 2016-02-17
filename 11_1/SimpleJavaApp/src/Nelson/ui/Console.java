package Nelson.ui;
import java.util.Scanner;


public class Console {

    private static Scanner sc = new Scanner(System.in);

    public static void displayLine() {
        System.out.println();
    }

    public static void displayLine(String s) {
        System.out.println(s);
    }


    public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.nextLine();
        return s;
}

    public static double getDouble(String prompt) {
        double d = 0;
        while (true) {
            System.out.print(prompt);
            try {
                d = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid Decimal. Try again.");
            }
        }
        return d;
    }


    }
