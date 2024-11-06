import java.util.Scanner;

public class Years {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        int minutes = Integer.parseInt(scanner.nextLine());
        int years = minutes / (60 * 24) / 365;
        int remainingDays = minutes / (60 * 24) % 365;
        System.out.println(minutes + " minutes is approximately" + years + " years and " + remainingDays + "days");
    }
}
