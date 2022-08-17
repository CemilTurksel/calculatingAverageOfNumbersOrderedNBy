import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        int number, total = 0, counter = 0, average = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        number = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= number; i++) {
            if ((i % 3 == 0) && (i% 4 == 0)) {
                total += i;
                counter++;
            }
        }
        average = total/counter;
        System.out.println(average);
    }
}
