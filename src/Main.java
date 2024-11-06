import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter miles:");
        int miles = Integer.parseInt(scanner.nextLine());
        double kilometers = (double) miles * 1.60934;
        System.out.println(miles + " miles is " + kilometers + " kilometers");
    }
}