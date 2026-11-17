              control statements
                       |
      -------------------------------------
      |                |                  |
      conditional     looping            jumping
      |                |                  |
      |                |                  |
      if               for                continue
      if-else          while              break
      else-if ladder   do while           return
      nested if
      switch

      ternary operator program
      
  import java.util.*;
  public class datatypes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is: " + result);
    }
}
