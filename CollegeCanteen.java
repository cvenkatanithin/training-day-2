
import java.util.Scanner;

public class CollegeCanteen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int category, choice, quantity;
        int price = 0, total = 0;
        String item = "";

        String[] items = new String[100];
        int[] quantities = new int[100];
        int[] amounts = new int[100];
        int count = 0;

        System.out.println("================================");
        System.out.println("    WELCOME TO COLLEGE CANTEEN");
        System.out.println("================================");

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        while (true) {

            // Main Category Menu
            System.out.println("\n======= MAIN MENU =======");
            System.out.println("1. Tiffins");
            System.out.println("2. Lunch");
            System.out.println("3. Snacks");
            System.out.println("4. Beverages");
            System.out.println("5. Generate Bill & Exit");

            System.out.print("Select Category: ");
            category = sc.nextInt();

            if (category == 5) {
                break;
            }

            // Category Selection
            switch (category) {

                case 1:
                    System.out.println("\n----- TIFFINS -----");
                    System.out.println("1. Idli  - Rs.30");
                    System.out.println("2. Dosa  - Rs.50");
                    System.out.println("3. Poori - Rs.40");
                    System.out.println("4. Vada  - Rs.30");
                    System.out.println("5. Upma  - Rs.35");

                    System.out.print("Select Item: ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            item = "Idli";
                            price = 30;
                            break;
                        case 2:
                            item = "Dosa";
                            price = 50;
                            break;
                        case 3:
                            item = "Poori";
                            price = 40;
                            break;
                        case 4:
                            item = "Vada";
                            price = 30;
                            break;
                        case 5:
                            item = "Upma";
                            price = 35;
                            break;
                        default:
                            System.out.println("Invalid Item!");
                            continue;
                    }
                    break;

                case 2:
                    System.out.println("\n----- LUNCH -----");
                    System.out.println("1. Veg Meals       - Rs.80");
                    System.out.println("2. Chicken Biryani - Rs.150");
                    System.out.println("3. Veg Biryani     - Rs.100");
                    System.out.println("4. Fried Rice      - Rs.70");
                    System.out.println("5. Curd Rice       - Rs.40");

                    System.out.print("Select Item: ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            item = "Veg Meals";
                            price = 80;
                            break;
                        case 2:
                            item = "Chicken Biryani";
                            price = 150;
                            break;
                        case 3:
                            item = "Veg Biryani";
                            price = 100;
                            break;
                        case 4:
                            item = "Fried Rice";
                            price = 70;
                            break;
                        case 5:
                            item = "Curd Rice";
                            price = 40;
                            break;
                        default:
                            System.out.println("Invalid Item!");
                            continue;
                    }
                    break;

                case 3:
                    System.out.println("\n----- SNACKS -----");
                    System.out.println("1. Samosa       - Rs.20");
                    System.out.println("2. Puff         - Rs.25");
                    System.out.println("3. Sandwich     - Rs.50");
                    System.out.println("4. Noodles      - Rs.60");
                    System.out.println("5. French Fries - Rs.50");

                    System.out.print("Select Item: ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            item = "Samosa";
                            price = 20;
                            break;
                        case 2:
                            item = "Puff";
                            price = 25;
                            break;
                        case 3:
                            item = "Sandwich";
                            price = 50;
                            break;
                        case 4:
                            item = "Noodles";
                            price = 60;
                            break;
                        case 5:
                            item = "French Fries";
                            price = 50;
                            break;
                        default:
                            System.out.println("Invalid Item!");
                            continue;
                    }
                    break;

                case 4:
                    System.out.println("\n----- BEVERAGES -----");
                    System.out.println("1. Tea          - Rs.15");
                    System.out.println("2. Coffee       - Rs.20");
                    System.out.println("3. Cool Drink   - Rs.30");
                    System.out.println("4. Water Bottle - Rs.20");

                    System.out.print("Select Item: ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            item = "Tea";
                            price = 15;
                            break;
                        case 2:
                            item = "Coffee";
                            price = 20;
                            break;
                        case 3:
                            item = "Cool Drink";
                            price = 30;
                            break;
                        case 4:
                            item = "Water Bottle";
                            price = 20;
                            break;
                        default:
                            System.out.println("Invalid Item!");
                            continue;
                    }
                    break;

                default:
                    System.out.println("Invalid Category!");
                    continue;
            }

            // Quantity Input
            System.out.print("Enter Quantity: ");
            quantity = sc.nextInt();

            if (quantity <= 0) {
                System.out.println("Invalid Quantity!");
                continue;
            }

            if (count >= items.length) {
                System.out.println("Order limit reached!");
                break;
            }

            // Calculate Amount
            int amount = price * quantity;
            total += amount;

            // Store Order Details
            items[count] = item;
            quantities[count] = quantity;
            amounts[count] = amount;
            count++;

            System.out.println("\n" + item + " added successfully!");
            System.out.println("Amount: Rs." + amount);
            System.out.println("Current Total: Rs." + total);
        }

        // Final Bill
        System.out.println("\n======================================");
        System.out.println("          COLLEGE CANTEEN BILL");
        System.out.println("======================================");
        System.out.println("Customer Name: " + name);
        System.out.println("--------------------------------------");

        System.out.printf("%-20s %-5s %-8s%n",
                          "Item", "Qty", "Amount");

        System.out.println("--------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-20s %-5d Rs.%-8d%n",
                    items[i], quantities[i], amounts[i]);
        }

        System.out.println("--------------------------------------");
        System.out.println("TOTAL BILL: Rs." + total);
        System.out.println("======================================");

        System.out.println("Thank You for Visiting Our College Canteen!");
        System.out.println("Have a Nice Day!");

        sc.close();
    }
}
