import java.util.Scanner;
public class ControlStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        // 1. IF Statement
        if (num > 0) {
            System.out.println("Positive number");
        }
        // 2. IF-ELSE Statement
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        // 3. ELSE-IF Statement
        if (num > 0) {
            System.out.println("Greater than zero");
        } else if (num < 0) {
            System.out.println("Less than zero");
        } else {
            System.out.println("Number is zero");
        }
        // 4. SWITCH Statement
        System.out.print("Enter day (1-3): ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
        // 5. FOR Loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        // 6. WHILE Loop
        System.out.println("While Loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        // 7. DO-WHILE Loop
        System.out.println("Do-While Loop:");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);
        // 8. BREAK Statement
        System.out.println("Break Statement:");
        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                break;
            }
            System.out.println(k);
        }
        // 9. CONTINUE Statement
        System.out.println("Continue Statement:");
        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                continue;
            }
            System.out.println(k);
        }
        sc.close();
    }
}

