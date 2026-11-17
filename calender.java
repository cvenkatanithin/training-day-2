import java.util.*;
public class calender {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number (1-12):");
        int month = sc.nextInt();
        String monthname;
        switch(month){
            case 1:
                monthname = "January";
                break;
            case 2:
                monthname = "February";
                break;
            case 3:
                monthname = "March";
                break;
            case 4:
                monthname = "April";
                break;
            case 5:
                monthname = "May";
                break;
            case 6:
                monthname = "June";
                break;
            case 7:
                monthname = "July";
                break;
            case 8:
                monthname = "August";
                break;
            case 9:
                monthname = "September";
                break;
            case 10:
                monthname = "October";
                break;
            case 11:
                monthname = "November";
                break;
            case 12:
                monthname = "December";
                break;
            default:
                monthname = "Invalid month number";
                break;
        }
        System.out.println("the month is: " + monthname);
    }
}
