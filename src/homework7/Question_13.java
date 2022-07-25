/* 13.Write a Java program which input any number between 1 to 7 and it print The Days
name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
NOTE: if number is out of selection Print message “Week contains 1 to 7 days”. */
package homework7;

import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {
        Question_13 q13=new Question_13();
        q13.m1();
    }
    public void m1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter days number : ");
        int weekday = sc.nextInt();

        switch (weekday)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
    }
}
